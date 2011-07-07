package org.levi.engine.impl.bpmn;

import org.levi.engine.bpmn.RunnableFlowNode;
import org.levi.engine.persistence.hibernate.HibernateDao;
import org.levi.engine.persistence.hibernate.process.hobj.ProcessInstanceBean;
import org.levi.engine.persistence.hibernate.process.hobj.TaskBean;
import org.levi.engine.runtime.ProcessInstance;
import org.omg.spec.bpmn.x20100524.model.TSendTask;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Created by IntelliJ IDEA.
 * User: keheliya
 * Date: 7/1/11
 * Time: 12:17 PM
 * For Levi - The Native BPMN 2.0 Execution Engine
 */
public class SendTask extends RunnableFlowNode {

    private final TSendTask task;
    private final ProcessInstance processInstance;
    private final boolean hasInputForm=true;

    public static class Builder {
        private FlowNodeFactory flowNodeFac;
        private TSendTask task;
        private ProcessInstance process;

        public Builder(TSendTask task) {
            this.task = task;
        }

        public Builder processInstance(ProcessInstance process) {
            this.process = process;
            return this;
        }

        public SendTask build() {
            return new SendTask(this);
        }
    }

    private SendTask(Builder builder) {
        this.task = builder.task;
        this.processInstance = builder.process;
        //TResourceRole[] resourceRoles = task.getResourceRoleArray();
        //if (resourceRoles[0] instanceof TPotentialOwner) {
        //    TPotentialOwner potentialOwner = (TPotentialOwner)resourceRoles[0];
        //    potentialOwner.getResourceAssignmentExpression().getExpression();
        //}
        //THumanPerformer humanPerformer = (THumanPerformer)resourceRoles[1];
        //humanPerformer.getResourceAssignmentExpression().getExpression();

        //hasInputForm = task.getInputForm() != null;

        // todo check and write the input form data.
        //if (hasInputForm()) {
            persistSendTask(this);
        //}
    }

    private void persistSendTask(SendTask sendTask) {
        HibernateDao dao = new HibernateDao();
        TaskBean starteventbean = (TaskBean) dao.getObject(TaskBean.class, sendTask.getId());
        if (starteventbean == null) {
            starteventbean = new TaskBean();
            Node exElems = task.getExtensionElements().getDomNode();
            NodeList children = exElems.getChildNodes();
            for (int i = 0; i < children.getLength(); ++i) {
                 System.out.println("Iteration:"+i);
                Node field = children.item(i);
                Node nameAttribute=field.getAttributes().getNamedItem("name");
                String key = nameAttribute.getNodeValue();

                //TODO check from,to,subject,content
                Node stringValueAttribute=field.getAttributes().getNamedItem("stringValue");
                Node expressionAttribute=field.getAttributes().getNamedItem("expression");
//                if ((stringValueAttribute==null&& expressionAttribute==null) || (stringValueAttribute!=null && expressionAttribute!=null))
//                {
//                    throw new RuntimeException("Include StringValue or Expression") ;
//                }
//                else if   (stringValueAttribute!=null)
//                {}
//                else
//                {}
//
                String value;
                if (stringValueAttribute != null) {
                    if (expressionAttribute != null) {
                       throw new RuntimeException("Cant have values for both StringValue or Expression attributes") ;
                    }
                    value=stringValueAttribute.getNodeValue() ;
                } else  if (expressionAttribute != null) {
                    FormalExpression fe = new FormalExpression(expressionAttribute.getNodeValue());
                   value=(String)fe.evaluate(processInstance);
                } else if(field.hasChildNodes()){
                    Node content = field.getChildNodes().item(0);
                    String strType = content.getNodeName();
                    if(strType=="expression")
                    {
                        value=content.getNodeValue();
                        //TODO Evaluating using velocity
                    }
                    else if (strType=="string")
                    {
                        value=content.getNodeValue();
                    }
                    else
                      throw new RuntimeException("Content Node must have string or expression sub elements") ;

                } else
                    throw new RuntimeException("If Field node has no StringValue or Expression it must be content node") ;

                processInstance.setVariable(key,value);
                System.out.println("SendTask persistSendTask(): Setting variables.");


            }
            starteventbean.setId(sendTask.getId());
            starteventbean.setTaskId(sendTask.getId());
            ProcessInstanceBean processInstanceBean = (ProcessInstanceBean) dao.getObject(ProcessInstanceBean.class, processInstance.getProcessId());
            starteventbean.setProcesseInstance(processInstanceBean);
            //UserBean user = (UserBean) dao.getObject(UserBean.class, task.getAssignee());
            //starteventbean.setAssignee(user);
            starteventbean.setFormName(task.getName());
            starteventbean.setTaskName(task.getName());
           // starteventbean.setHasUserForm(hasInputForm());
            //starteventbean.setFromPath(task.getInputForm());
            dao.save(starteventbean);
        }
        dao.close();
    }

    public void run() {
        processInstance.addRunning(getId());
        // get the details
        System.out.println("SendTask run(): Getting the task details.");

        String to= (String) processInstance.getVariable("to");
                System.out.println("SendTask persistSendTask(): Recipent:" + to);
          String subject= (String) processInstance.getVariable("subject");
                System.out.println("SendTask persistSendTask(): Subject:" + subject);
        String content= (String) processInstance.getVariable("content");
                System.out.println("SendTask persistSendTask(): Content:" + content);

        // write them to the db
        //System.out.println("SendTask run(): Wrote details to the db.");
        // see if a form is there
        //System.out.println("SendTask run(): Checking for an input form.");
        // if yes then create a waitedtask and wait for it
        //System.out.println("SendTask run(): Creating the waited task for the form.");
        //System.out.println("SendTask run(): Waiting for the form reply...");
        //WaitedTaskChannel channel = newChannel(WaitedTaskChannel.class, "channel");
        //WaitedTask task = new WaitedTask(channel);
        //processInstance.addWaitedTask(getId(), task);
        //instance(task);
        // todo:
        if (hasInputForm()) {
            System.out.println("SendTask hasInputForm. Pause.");
            processInstance.pause(getId());
        } //else {
        //    resumeTask();
        //}
        /*
        object(new WaitedTaskChannelListener(channel) {
            @Override
            public void resume(Map<String, Object> vars) {
                System.out.println("UserTask run(). done." + vars.toString());
                System.out.println("UserTask run(). saving the variables.");
                processInstance.getVariables().putAll(vars);
                resumeTask();
            }
        }); */


    }

    public String getId() {
        return task.getId();
    }

    public void resumeTask() {
        // todo this is what must happen when
        // processInstance.getVariables().putAll(vars);
        System.out.println("Resuming send task id " + getId());
        instance(processInstance.executeNext(this));
        processInstance.addCompleted(getId());

    }

    // todo
    public boolean hasInputForm() {
        return hasInputForm;
    }
}

