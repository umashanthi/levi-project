package org.levi.engine.impl.bpmn;

import org.levi.engine.bpmn.RunnableFlowNode;
import org.levi.engine.persistence.hibernate.HibernateDao;
import org.levi.engine.persistence.hibernate.process.hobj.ProcessInstanceBean;
import org.levi.engine.persistence.hibernate.process.hobj.TaskBean;
import org.levi.engine.runtime.ProcessInstance;
import org.levi.engine.utils.LeviUtils;
import org.omg.spec.bpmn.x20100524.model.TServiceTask;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.*;

import javax.ws.rs.core.MultivaluedMap;

import javax.mail.MessagingException;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: keheliya
 * Date: 9/5/11
 * Time: 9:20 AM
 * For Levi - The Native BPMN 2.0 Execution Engine
 */


public class ServiceTask extends RunnableFlowNode {
    private final TServiceTask task;
    private final ProcessInstance processInstance;

    // private String from;


    public static class Builder {
        private TServiceTask task;
        private ProcessInstance process;

        public Builder(TServiceTask task) {
            this.task = task;
        }

        public Builder processInstance(ProcessInstance process) {
            this.process = process;
            return this;
        }

        public ServiceTask build() {
            return new ServiceTask(this);
        }
    }

    private ServiceTask(Builder builder) {
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
        persistServiceTask(this);
        //}
    }

    private void persistServiceTask(ServiceTask serviceTask) {
        HibernateDao dao = new HibernateDao();
        // todo remove later
//        processInstance.setVariable("recipient", "eranda");
//        processInstance.setVariable("orderId", 1234);
//        processInstance.setVariable("male", true);
//        processInstance.setVariable("recipientName", "Eranda");
        processInstance.setVariable("now", new Date());
        TaskBean starteventbean = (TaskBean) dao.getObject(TaskBean.class, serviceTask.getId());
        if (starteventbean == null) {
            starteventbean = new TaskBean();
            Node exElems = task.getExtensionElements().getDomNode();
            NodeList children = exElems.getChildNodes();
            for (int i = 0; i < children.getLength(); ++i) {
                Node field = children.item(i);
                if (field.getNodeType() != Node.ELEMENT_NODE) {
                    continue;
                }
                if (!"field".equals(field.getNodeName())) {
                    throw new RuntimeException("Unknown element '" + field.getNodeName()
                            + "' inside sendTask.");
                }
                Node nameAttribute = field.getAttributes().getNamedItem("name");
                String key = nameAttribute.getNodeValue();
                // key must be one of {from, to, subject, content}. we must handle this
                // from the xsd.
                if (!("url".equals(key) || "isbn".equals(key)
                        || "key".equals(key))) {
                    throw new RuntimeException("Field name must be one of {url,isbn,key}. " + key);
                }
                Node stringValueAttribute = field.getAttributes().getNamedItem("stringValue");
                Node expressionAttribute = field.getAttributes().getNamedItem("expression");
                String value = null;
                if (stringValueAttribute != null) {
                    if (expressionAttribute != null) {
                        throw new RuntimeException("Cant have values for both StringValue or Expression attributes");
                    }
                    value = stringValueAttribute.getNodeValue();
                } else if (expressionAttribute != null) {
                    FormalExpression fe = new FormalExpression(expressionAttribute.getNodeValue());
                    value = fe.evaluateString(processInstance);
                    System.out.println("value: " + value);
                } else { // both stringValue and expression attrbts are null. Then this field elem must have an expression elem
                    NodeList elems = field.getChildNodes();
                    for (int e = 0; e < elems.getLength(); ++e) {
                        Node expression = elems.item(e);
                        if (expression.getNodeType() != Node.ELEMENT_NODE) {
                            continue;
                        }
                        if (!("expression".equals(expression.getNodeName())
                                || "string".equals(expression.getNodeName()))) {
                            throw new RuntimeException("Unknown element '" + expression.getNodeName()
                                    + "' inside field.");
                        }
                        FormalExpression fe = new FormalExpression(expression.getFirstChild().getNodeValue());
                        value = fe.evaluateString(processInstance);
                        System.out.println("value: " + value);
                    }
                }
                if (key == null || value == null) {
                    throw new RuntimeException("Malformed serviceTask.");
                }
                processInstance.setVariable(getId() + "_" + key, value);
            }
            starteventbean.setTaskId(serviceTask.getId());
            starteventbean.setTaskId(serviceTask.getId());
            ProcessInstanceBean processInstanceBean = (ProcessInstanceBean) dao.getObject(ProcessInstanceBean.class, processInstance.getProcessId());
            processInstanceBean.getRunningTasks().put(starteventbean.getTaskId(), starteventbean);
            starteventbean.setFormName(task.getName());
            starteventbean.setTaskName(task.getName());
            dao.save(starteventbean);
            dao.save(processInstanceBean);
        }
        dao.close();
    }

    public void run() {
        processInstance.run(getId());
        // get the details
        System.out.println("ServiceTask run(): Getting the task details.");
        String url = (String) processInstance.getVariable(getId() + "_url");
        System.out.println("ServiceTask persistSendTask(): URL:" + url);
        String isbn = (String) processInstance.getVariable(getId() + "_isbn");
        System.out.println("ServiceTask persistSendTask(): ISBN:" + isbn);
        String key = (String) processInstance.getVariable(getId() + "_key");
        System.out.println("ServiceTask persistSendTask(): KEY:" + key);

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
        } else {
            try {
                resumeTask();
            } catch (MessagingException e) {
                e.printStackTrace();
            }
        }
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
        return LeviUtils.combineTaskId(processInstance.getProcessId(), task.getId());
    }

    public void resumeTask() throws MessagingException {
        // todo this is what must happen when
        // processInstance.getVariables().putAll(vars);
        System.out.println("Resuming send task id " + getId());

        System.out.println("ServiceTask run(): Getting the task details.");
        String url = (String) processInstance.getVariable(getId() + "_url");
        System.out.println("ServiceTask persistSendTask(): URL:" + url);
        String isbn = (String) processInstance.getVariable(getId() + "_isbn");
        System.out.println("ServiceTask persistSendTask(): ISBN:" + isbn);
        String key = (String) processInstance.getVariable(getId() + "_key");
        System.out.println("ServiceTask persistSendTask(): KEY:" + key);

        //marketingClient.sendMessage(to+"@localhost", subject,  content);
        try {

            Client client = Client.create();
            ClientResponse response = goodReadsAuthor(client, url, isbn, key);
            // ClientResponse response =  ip2place(client);
            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }
            System.out.println("Output from Server .... \n");
            String output = response.getEntity(String.class);
            System.out.println(output);
            System.out.println(response.toString());

            processInstance.setVariable(getId() + "_result", output);


        } catch (Exception e) {
            e.printStackTrace();
        }

        instance(processInstance.executeNext(this));
        processInstance.complete(getId());

    }

    // todo
    public boolean hasInputForm() {
        boolean hasInputForm = false;
        return hasInputForm;
    }

    private static ClientResponse goodReadsAuthor(Client client, String url, String isbn, String key) {
        WebResource webResource = client
                .resource(url);
        MultivaluedMap queryParams = new MultivaluedMapImpl();
        queryParams.add("isbn", isbn);
        queryParams.add("key", key);
        return webResource.queryParams(queryParams).get(ClientResponse.class);
    }
}


