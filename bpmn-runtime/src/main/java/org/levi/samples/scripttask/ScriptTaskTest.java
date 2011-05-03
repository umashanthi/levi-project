package org.levi.samples.scripttask;

import org.levi.engine.ProcessEngine;
import org.levi.engine.impl.ProcessEngineImpl;
import org.levi.engine.utils.LeviUtils;

import java.io.IOException;
import java.util.Map;

/**
 * @author Ishan Jayawardena
 */
public class ScriptTaskTest {

    public final static String path = "/home/ishan/Desktop/bpmnsamples/";


    public ScriptTaskTest() {
    }

    public void helloWorld() throws IOException, ClassNotFoundException {
        System.out.println("HelloWorld-----------------------");
        ProcessEngine engine = ProcessEngineImpl.getProcessEngine();
        String id = engine.deploy(path + "HelloWorldScriptTask.lar");
        engine.startProcess(id, null);
        engine.undeploy(id);
        engine.stop();
    }

    public void scriptWithVariables() throws ClassNotFoundException, IOException {
        System.out.println("ScriptWithVariables-----------------------");
        ProcessEngine engine = ProcessEngineImpl.getProcessEngine();
        String id = engine.deploy(path + "ScriptTaskTest2.lar");
        Map<String, Object> variables = LeviUtils.newHashMap(2);
        variables.put("inputArray", new int[] {1, 2, 3, 4, 5});
        variables.put("result", 0);
        
        engine.startProcess(id, variables);
        System.out.println("result: " + variables.get("result"));
        System.out.println("printString: " + variables.get("printString"));
        engine.undeploy(id);
        engine.stop();
    }

}
