package org.levi.samples.conditionexpression;

import org.levi.engine.ProcessEngine;
import org.levi.engine.impl.ProcessEngineImpl;
import org.levi.engine.utils.LeviUtils;
import org.levi.samples.scripttask.ScriptTaskTest;

import java.io.IOException;
import java.util.Map;

/**
 * @author Ishan Jayawardena
 */
public class ConditionExpressionTest {
    public ConditionExpressionTest() {

    }

    public void exclusiveGatewayWithNoDefaultSeqFlow() throws IOException, ClassNotFoundException {
        ProcessEngine processEngine = ProcessEngineImpl.getProcessEngine();
        processEngine.deploy(ScriptTaskTest.path + "ExclusiveGatewayTest1.lar");
        Map<String, Object> variables = LeviUtils.newHashMap(1);
        variables.put("input", 3);
        processEngine.startProcess(processEngine.getDeploymentIds().get(0), variables);
        processEngine.undeploy(processEngine.getDeploymentIds().get(0));
        processEngine.stop();
    }

    public void exclusiveGatewayWithDefaultSeqFlow() throws IOException, ClassNotFoundException {
        ProcessEngine processEngine = ProcessEngineImpl.getProcessEngine();
        processEngine.deploy(ScriptTaskTest.path + "ExclusiveGatewayTest2.lar");
        Map<String, Object> variables = LeviUtils.newHashMap(1);
        variables.put("input", 3);
        processEngine.startProcess(processEngine.getDeploymentIds().get(0), variables);
        processEngine.undeploy(processEngine.getDeploymentIds().get(0));
        processEngine.stop();
    }
}
