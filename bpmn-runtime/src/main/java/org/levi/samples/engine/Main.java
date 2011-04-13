package org.levi.samples.engine;

import org.levi.engine.ProcessEngine;
import org.levi.engine.impl.ProcessEngineImpl;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = "bpmn-runtime/src/main/java/org/levi/samples/data";
        // /TroubleTicketSystem.bpmn
        // /book_fig61.bpmn
        // /parallel_gateway_1.bpmn
        /*
        ObjectModel om = ObjectModel.getInstance(new File(path + "/book_fig49.1.bpmn"));
        ProcessInstance p = new ProcessInstance(om);
        p.execute();
        */
        //StorageService s = new StorageServiceImpl();

        //s.showDeployedProcessList();
        ProcessEngine engine = new ProcessEngineImpl();
        engine.start();
        engine.showDeployedProcesses();
        //engine.showRunningProcesses();
        engine.stop();
    }
}
