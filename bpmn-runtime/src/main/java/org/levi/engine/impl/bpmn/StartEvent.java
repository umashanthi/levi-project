package org.levi.engine.impl.bpmn;

import org.levi.engine.bpmn.Event;
import org.levi.engine.persistence.hibernate.HibernateDao;
import org.levi.engine.persistence.hibernate.process.hobj.ProcessInstanceBean;
import org.levi.engine.persistence.hibernate.process.hobj.TaskBean;
import org.levi.engine.runtime.ProcessInstance;
import org.omg.spec.bpmn.x20100524.model.TStartEvent;

/**
 * @author Ishan Jayawardena
 */
public class StartEvent extends Event {
    private final ProcessInstance processInstance;
    private final TStartEvent startEvent;
    private final boolean hasInputForm;

    public static class Builder {
        private ProcessInstance process;
        private TStartEvent se;

        public Builder(TStartEvent startEvent) {
            this.se = startEvent;
        }

        public Builder processInstance(ProcessInstance process) {
            this.process = process;
            return this;
        }
        public StartEvent build() {
            return new StartEvent(this);    
        }
    }
    private StartEvent(Builder builder) {
        this.startEvent = builder.se;
        this.processInstance = builder.process;
        hasInputForm = startEvent.getInputForm() != null;
        // todo check and write the input form data
        if (hasInputForm()) {
            persistStartEvent(this);
        }
    }

    private void persistStartEvent(StartEvent startEvent) {
        HibernateDao dao = new HibernateDao();
        TaskBean starteventbean = new TaskBean();
        starteventbean.setId(startEvent.getId());
        ProcessInstanceBean processInstanceBean = (ProcessInstanceBean)dao.getObject(ProcessInstance.class, processInstance.getProcessId());
        starteventbean.setProcesseInstance(processInstanceBean);
        starteventbean.setAssignee(processInstanceBean.getStartUser());
        starteventbean.setFormName(this.startEvent.getInputForm());
        dao.save(starteventbean);
        dao.close();
    }


    public String getId() {
        return startEvent.getId();
    }

    public void run() {
        // todo see if a form is present and pause accordingly
        if (hasInputForm()) {
            processInstance.pause(this.getId());
        }
        //processInstance.addRunning(getId());
        //resumeTask();
    }

    public void resumeTask() {
        instance(processInstance.executeNext(this));
        processInstance.addCompleted(getId());
    }

    public boolean hasInputForm() {
        return hasInputForm;
    }

    public String toString() {
        String out = "{";
        out += "startEvent: " + startEvent;
        out += "}";
        return out;
    }
}