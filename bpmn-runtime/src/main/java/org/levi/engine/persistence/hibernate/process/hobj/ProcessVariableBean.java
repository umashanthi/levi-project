package org.levi.engine.persistence.hibernate.process.hobj;

import org.hibernate.annotations.CollectionOfElements;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name = "process_instance_variables")     
public class ProcessVariableBean {

    private String processId;
    private Map<String, String> variables;

    @Id
    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    @CollectionOfElements   
	@JoinTable( name="process_variable",joinColumns={ @JoinColumn(name="processId")})
    public Map<String, String> getVariables() {
        return variables;
    }

    public void setVariables(Map<String, String> variables) {
        this.variables = variables;
    }
}
