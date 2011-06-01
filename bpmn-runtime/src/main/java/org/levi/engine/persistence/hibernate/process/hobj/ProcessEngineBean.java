package org.levi.engine.persistence.hibernate.process.hobj;

import org.levi.engine.EngineData;
import org.levi.engine.RuntimeService;
import org.levi.engine.TaskService;
import org.levi.engine.impl.TaskServiceImpl;
import org.levi.engine.persistence.hibernate.HObject;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * User: eranda
 * Date: May 27, 2011
 * Time: 1:27:03 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "process_engine")
public class ProcessEngineBean extends HObject {

    private String id;
    private EngineDataBean engineData;
    private RuntimeServiceBean runtimeService;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @OneToOne
    public EngineDataBean getEngineData() {
        return engineData;
    }

    public void setEngineData(EngineDataBean engineData) {
        this.engineData = engineData;
    }

    @OneToOne
    public RuntimeServiceBean getRuntimeService() {
        return runtimeService;
    }

    public void setRuntimeService(RuntimeServiceBean runtimeService) {
        this.runtimeService = runtimeService;
    }
}
