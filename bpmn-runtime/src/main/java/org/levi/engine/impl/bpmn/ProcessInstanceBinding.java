package org.levi.engine.impl.bpmn;

import org.levi.engine.LeviException;
import org.levi.engine.runtime.ProcessInstance;

import javax.script.Bindings;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * @author Ishan Jayawardena
 */
public class ProcessInstanceBinding implements Bindings {
    protected ProcessInstance processInstance;
    // todo do we need a set of unsupported keys?
    public ProcessInstanceBinding(ProcessInstance processInstance) {
        if (processInstance == null) {
            throw new LeviException("Cannot create a process instance binding. Process instance is null.");
        }
        this.processInstance = processInstance;
    }

    public Object put(String name, Object value) {
        return processInstance.setVariable(name, value);
    }

    public void putAll(Map<? extends String, ? extends Object> toMerge) {
        throw new UnsupportedOperationException("putAll method is not supported");
    }

    public void clear() {
        processInstance.getVariables().clear();
    }

    public Set<String> keySet() {
        return processInstance.getVariables().keySet();
    }

    public Collection<Object> values() {
        return processInstance.getVariables().values();
    }

    public Set<Entry<String, Object>> entrySet() {
        return processInstance.getVariables().entrySet();
    }

    public int size() {
        return processInstance.getVariables().size();
    }

    public boolean isEmpty() {
        return processInstance.getVariables().isEmpty();
    }

    public boolean containsKey(Object key) {
        return processInstance.getVariables().containsKey(key);
    }

    public boolean containsValue(Object value) {
        return processInstance.getVariables().containsValue(value);
    }

    public Object get(Object key) {
        return processInstance.getVariables().get(key);
    }

    public Object remove(Object key) {
        throw new UnsupportedOperationException("Cannot delete process variables");
    }
}
