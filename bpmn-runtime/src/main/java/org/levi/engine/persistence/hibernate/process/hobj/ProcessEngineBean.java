package org.levi.engine.persistence.hibernate.process.hobj;

import org.levi.engine.EngineData;
import org.levi.engine.RuntimeService;
import org.levi.engine.TaskService;
import org.levi.engine.impl.TaskServiceImpl;

import javax.persistence.Id;

/**
 * Created by IntelliJ IDEA.
 * User: eranda
 * Date: May 27, 2011
 * Time: 1:27:03 AM
 * To change this template use File | Settings | File Templates.
 */
public class ProcessEngineBean {

    private String id;
    private EngineData engineData;
    private RuntimeService runtimeService;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EngineData getEngineData() {
        return engineData;
    }

    public void setEngineData(EngineData engineData) {
        this.engineData = engineData;
    }

    public RuntimeService getRuntimeService() {
        return runtimeService;
    }

    public void setRuntimeService(RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }
}
