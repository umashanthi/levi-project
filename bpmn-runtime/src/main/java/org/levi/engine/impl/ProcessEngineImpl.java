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
    public static final String enginedatap =  "/home/ishan/devel/levi/serial/enginedata";

    public ProcessEngineImpl() {    // todo <== process engine configuration
    }

    private void init(EngineData engineData) {
        storageService = new StorageServiceImpl(engineData);
        
        runtimeService = new RuntimeServiceImpl(engineData);
    }

    public void start()
            throws IOException, ClassNotFoundException {
        File inF = new File(enginedatap);
        if (inF.exists()) { // we have an engine data file
            ObjectLoader loader = new ObjectLoader(enginedatap);
	        EngineData engineData = (EngineData)loader.readNextObject();//objectIs.readObject();
            if (engineData == null) {
                throw new RuntimeException("Retrieved engine data is null");
            }
            this.engineData = engineData;
            System.out.println("[Info] Loaded process engine data");
        } else {
            engineData = new EngineData();
            System.out.println("[Info] Fresh startup");
        }
        init(this.engineData);
        System.out.println("[Info] Running process engine id: " + this.hashCode());
        String path = "bpmn-runtime/src/main/java/org/levi/samples/data";
        Deployment d;
        d = storageService.createDeployment(path + "/book_fig49.1.bpmn"); // Process:Figure-49
        storageService.deploy(d);
        d = storageService.createDeployment(path + "/TroubleTicketSystem.bpmn"); // TroubleTicketSystem
        storageService.deploy(d);
        d = storageService.createDeployment(path + "/book_fig61.bpmn"); // ProduceAdvertisement
        storageService.deploy(d);
        d = storageService.createDeployment(path + "/parallel_gateway_1.bpmn"); //ParallelGatewayTest
        storageService.deploy(d);
        runtimeService.runProcess("Process:Figure-49");
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
        System.out.println("[Info] Saved process engine data");
    }
}
