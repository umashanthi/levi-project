package org.levi.engine.persistence.hibernate.process.hobj;

import org.levi.engine.persistence.hibernate.HObject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Created by IntelliJ IDEA.
 * User: eranda
 * Date: May 28, 2011
 * Time: 1:13:29 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "runtime_service")
public class RuntimeServiceBean extends HObject {
    private String id;
    private EngineDataBean engineData;

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
}
