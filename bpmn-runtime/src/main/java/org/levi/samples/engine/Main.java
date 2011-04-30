package org.levi.samples.engine;

import org.levi.engine.Constants;
import org.levi.engine.ProcessEngine;
import org.levi.engine.impl.ProcessEngineImpl;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ProcessEngine engine = ProcessEngineImpl.getProcessEngine();
        //engine.start();
        engine.deploy(Constants.LAR_PATH + "book_fig61.lar"); // ProduceAdvertisement
        engine.deploy(Constants.LAR_PATH + "book_fig49.1.lar"); // Process:Figure-49
        //engine.startProcess("Process:Figure-49");
        //engine.undeploy("Process:Figure-49");
        //engine.startProcess("Book Figure 61");
        engine.stop();
    }
}
