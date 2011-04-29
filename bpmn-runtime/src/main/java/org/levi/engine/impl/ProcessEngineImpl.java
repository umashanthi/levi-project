package org.levi.engine.impl;

import org.levi.engine.*;
import org.levi.engine.identity.IdentityService;
import org.levi.engine.utils.ObjectLoader;
import org.levi.engine.utils.ObjectSaver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProcessEngineImpl implements ProcessEngine {
    private EngineData engineData;
    private StorageService storageService;
    private RuntimeService runtimeService;
    private TaskService taskService = new TaskServiceImpl();
    private IdentityService identityService = new IdentityServiceImpl();
    
    private static final ProcessEngine processEngine = new ProcessEngineImpl();


    private ProcessEngineImpl() {    // todo <== process engine configuration
        try {
            start();
            System.out.println("[info] Running Levi " + Constants.LEVI_VERSION + ".");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static ProcessEngine getProcessEngine() {
        return processEngine;
    }

    private void start()
            throws IOException, ClassNotFoundException {
        File inF = new File(Constants.ENGINEDATA_PATH);
        if (inF.exists()) {
            ObjectLoader loader = new ObjectLoader(Constants.ENGINEDATA_PATH);
            EngineData engineData = (EngineData) loader.readNextObject();
            if (engineData == null) {
                throw new RuntimeException("Retrieved engine data is null.");
            }
            this.engineData = engineData;
        } else {
            engineData = new EngineData();
        }
        storageService = new StorageServiceImpl(engineData);
        storageService.start();
        runtimeService = new RuntimeServiceImpl(engineData);
        runtimeService.start();
    }

    public synchronized List<String> getDeploymentIds() {
        return giveList(engineData.getDeploymentIds());
    }

    public synchronized List<String> getRunningProcessIds() {
        return giveList(engineData.getRunningProcessIds());
    }

    private static synchronized <E> List<E> giveList(List<E> list) {
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        return new ArrayList<E>(list);
    }

    public synchronized void stop()
            throws FileNotFoundException, IOException {
        File f = new File(Constants.ENGINEDATA_PATH);
        if (f.exists()) {
            f.delete();
        } // todo this is too bad! fix it
        ObjectSaver saver = new ObjectSaver(Constants.ENGINEDATA_PATH);
        saver.saveObject(this.engineData);
        storageService.stop();
        runtimeService.stop();
    }

    public synchronized void deploy(String larPath) throws IOException {
        if (larPath == null) {
            throw new LeviException("Lar path is null.");
        }
        Deployment d = storageService.createDeployment(larPath);
        storageService.deploy(d);
    }

    public synchronized void undeploy(String id) throws IOException {
        if (id == null) {
            throw new LeviException("Process ID is null.");
        }
        storageService.undeploy(id);
    }

    public synchronized void startProcess(String id)
            throws IOException, ClassNotFoundException {
        if (id == null) {
            throw new LeviException("Process ID is null.");
        }
        runtimeService.startProcess(id);
    }

    public synchronized void stopProcess(String id)
            throws IOException, ClassNotFoundException {
        if (id == null) {
            throw new LeviException("Process ID is null.");
        }
        runtimeService.stopProcess(id);
    }

}