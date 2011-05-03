package org.levi.engine.impl.bpmn;

import org.levi.engine.LeviException;
import org.levi.engine.runtime.ProcessInstance;

import javax.script.*;

/**
 * @author Ishan Jayawardena
 */
public class ScriptEngines {
    //todo: implement JUEL as the default scripting language :D
    public static final String DEFAULT_SCRIPTING_LANGUAGE = "javascript";

    private final ScriptEngineManager scriptEngineManager;
    private static final ScriptEngines scriptEngines = new ScriptEngines();

    public static ScriptEngines getInstance() {
        return scriptEngines;
    }
    
    private ScriptEngines() {
        this(new ScriptEngineManager());
    }
    
    private ScriptEngines(ScriptEngineManager scriptEngineManager) {
        this.scriptEngineManager = scriptEngineManager;
    }

    public Object evaluate(String script, String language, ProcessInstance processInstance) {
        if (script == null) {
            throw new LeviException("Script is null");
        }
        Bindings bindings = createBindings(processInstance);
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName(language);
        if (scriptEngine == null) {
            throw new LeviException("No scripting engine found for " + language);
        }
        try {
            return scriptEngine.eval(script, bindings);
        } catch (ScriptException e) {
            throw new LeviException("Failed to evaluate script:" + e.getMessage());
        }
    }

    protected Bindings createBindings(ProcessInstance processInstance) {
        if (processInstance.getVariables() == null) {
            return new SimpleBindings();
        }
        return new ProcessInstanceBinding(processInstance);
    }
}
