package org.levi.engine.impl;

import org.levi.engine.*;
import org.levi.engine.identity.IdentityService;
import org.levi.engine.utils.ObjectLoader;
import org.levi.engine.utils.ObjectSaver;

import java.io.*;

public class ProcessEngineImpl implements ProcessEngine {
    private EngineData engineData;
    private StorageService storageService;
    private RuntimeService runtimeService;
    private TaskService taskService = new TaskServiceImpl();
    private IdentityService identityService = new IdentityServiceImpl();
    
    public static final String enginedatap =  StorageServiceImpl.LOM_PATH + "enginedata";
    private static ProcessEngineImpl processEngine = new ProcessEngineImpl();


    private ProcessEngineImpl() {    // todo <== process engine configuration
        try {
            start();
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (ClassNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    public static ProcessEngineImpl getProcessEngine() {
        return processEngine;
    }
    
    private void start()
            throws IOException, ClassNotFoundException {
        File inF = new File(enginedatap);
        if (inF.exists()) { // we have an engine data file
            ObjectLoader loader = new ObjectLoader(enginedatap);
	        EngineData engineData = (EngineData)loader.readNextObject();//objectIs.readObject();
            if (engineData == null) {
                throw new RuntimeException("Retrieved engine data is null");
            }
            this.engineData = engineData;
            //System.out.println("[Info] Loaded process engine data");
        } else {
            engineData = new EngineData();
        }
        storageService = new StorageServiceImpl(engineData);
        storageService.start();
        runtimeService = new RuntimeServiceImpl(engineData);
        runtimeService.start();
    }

    public void showRunningProcesses() {
        runtimeService.showRunningProcess();
    }
    
    public void showDeployedProcesses() {
        storageService.showDeployedProcessList();
    }

    public void stop() throws FileNotFoundException, IOException {
        File f = new File(enginedatap);
        if (f.exists()) {
            f.delete();
        } // todo this is too bad! fix it
        ObjectSaver saver = new ObjectSaver(enginedatap);
        saver.saveObject(this.engineData);
        //System.out.println("[Info] Saved process engine data");
        storageService.stop();
        runtimeService.stop();
    }

    public void deploy(String larPath) throws IOException {
        assert larPath != null;
        Deployment d = storageService.createDeployment(larPath);
        storageService.deploy(d);
    }

    public void undeploy(String id) throws IOException {
        assert id != null;
        storageService.undeploy(id);
    }

    public void startProcess(String id)
            throws IOException, ClassNotFoundException {
        assert id != null;
        runtimeService.startProcess(id);
    }
}
