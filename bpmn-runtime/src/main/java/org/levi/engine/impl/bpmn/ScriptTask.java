package org.levi.engine.impl.bpmn;

import org.levi.engine.bpmn.RunnableFlowNode;
import org.levi.engine.runtime.ProcessInstance;
import org.levi.engine.utils.LeviUtils;
import org.omg.spec.bpmn.x20100524.model.TScriptTask;

/**
 * @author Ishan Jayawardena
 */
public class ScriptTask extends RunnableFlowNode {
    private final String script;
    private final String language;
    private final ProcessInstance processInstance;
    private final String resultVariableName;
    private String id;
    private String name;

    public static class Builder {
        private String script;
        private String language;
        private ProcessInstance processInstance;
        private String id;
        private String name;

        public Builder(TScriptTask scriptTask) {
           script = scriptTask.getScript().newXMLStreamReader().getText();
           language = scriptTask.getScriptFormat();
           if (language == null) {
               language = ScriptEngines.DEFAULT_SCRIPTING_LANGUAGE;
           }
           id = LeviUtils.trimAndReplace(scriptTask.getId());
           name = scriptTask.getName();
        }
        public Builder processInstance(ProcessInstance process) {
            this.processInstance = process;
            return this;
        }
        public ScriptTask build() {
            return new ScriptTask(this);
        }

        private String script(TScriptTask scriptTask) {
            String script = scriptTask.toString(); //task.getScript().newXMLStreamReader().getText(); // TOOD get script method
            //System.out.println("Script: \n" + script);
            script = scriptTask.getScript().toString();
            //System.out.println("scriptTask.getScript().toString() \n" + script);
            script = scriptTask.getScript().xmlText();
            //System.out.println("scriptTask.getScript().xmlText() \n" + script);
            script = scriptTask.getScript().newXMLStreamReader().getText();
            //System.out.println("scriptTask.getScript().newXMLStreamReader().getText()\n" + script);
            String s = scriptTask.getScript().newDomNode().getChildNodes().item(0).getLocalName();
            //System.out.println("scriptTask.getScript().newDomNode().getFirstChild().toString() \n" + s);
            //throw new LeviException("this is temporary");
            return script;
        }
    }

    private ScriptTask(Builder builder) {
        this.script = builder.script;
        this.language = builder.language;
        this.processInstance = builder.processInstance;
        this.id = builder.id;
        this.name = builder.name;
        this.resultVariableName = "resultVariable-" + id;
    }

    @Override
    public void run() {
        // todo: see if a form is present and pause the process accordingly
        System.out.println("Evaluating Script Task.");
        ScriptEngines scriptEngines = ScriptEngines.getInstance();
        Object result = null;
        result = scriptEngines.evaluate(
                script,
                language,
                processInstance);
        processInstance.setVariable(resultVariableName, result);
        resumeTask();
    }

    public String getId() {
        return id;
    }

    public void resumeTask() {
        instance(processInstance.executeNext(this));
    }

    @Override
    public String toString() {
        return "[" + language + ", " + resultVariableName +", "+ processInstance +", " + script +"]";
    }
}
