package org.levi.samples.engine;

import org.levi.samples.conditionexpression.ConditionExpressionTest;

import java.io.IOException;

/**
 * @author Ishan Jayawardena
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //engine.deploy("/home/ishan/Desktop/bpmnsamples/ScriptTaskTest1.lar");
        //engine.deploy("/home/ishan/Desktop/bpmnsamples/HelloWorldScriptTask.lar");
        //engine.deploy(Constants.LAR_PATH + "book_fig61.lar"); // ProduceAdvertisement
        //engine.deploy(Constants.LAR_PATH + "book_fig49.1.lar"); // Process:Figure-49
        //engine.deploy(Constants.LAR_PATH + "book_fig49.1modified.lar");
        //engine.deploy(Constants.LAR_PATH + "book_fig49.1modified2.lar");
        //engine.startProcess("Process:Figure-49");
        //engine.undeploy("Process:Figure-49");

        //ScriptTaskTest test = new ScriptTaskTest();
        //test.helloWorld();
        //test.scriptWithVariables();

        // todo do clean the dirs after catching an exception
        ConditionExpressionTest test = new ConditionExpressionTest();
        test.exclusiveGatewayWithDefaultSeqFlow();
    }
}
