package org.levi.visualize.api;

/**
 * Created by IntelliJ IDEA.
 * UserBean: keheliya
 * Date: Feb 4, 2011
 * Time: 1:49:39 PM
 * For Levi - The Native BPMN 2.0 Execution Engine
 */
  
public class BPMNSymbolFactory {
    GraphViz gv;
    public BPMNSymbolFactory(GraphViz gv) {
        this.gv = gv;
    }
     public void start_BPMN_graph() {
        gv.addln("digraph BPMN {\nrankdir=LR");
    }

    public void end_BPMN_graph() {
        gv.addln("}");
    }
    /**
    * Adds Start Event to the graph.
    * @param name Name given for event.
    * @param id Unique id of the event
    */
    public void startEvent(String name, String id) {
        gv.addln(id+" [shape=circle,fixedsize=true,width=.5, height=.5,label = \""+name+"\"];");
    }

    /**
    * Adds End Event to the graph.
    * @param name Name given for event.
    * @param id Unique id of the event
    */
    public void endEvent(String name, String id) {
        gv.addln(id+" [shape=doublecircle,fixedsize=true,width=.5, style=bold, height=.5, label = \""+name+"\"];");
    }

    /**
    * Adds a normal task to the graph.
    * @param name Name given for the task.
    * @param id Unique id of the task.
    */
    public void normalTask(String name, String id) {
        gv.addln(id+" [shape=box,style=rounded,fixedsize=true,width=2, height=.9,label = \""+name+"\"];");
    }

    /**
    * Adds a Sequence Flow to the graph.
    * @param sourceRef Source Reference for the Sequence Flow. Should be an Id of a task/event/gateway.
    * @param targetRef Target Reference for the Sequence Flow. Should be an Id of a task/event/gateway.
    */

    public void sequenceFlow(String sourceRef, String targetRef) {
        gv.addln(sourceRef+" -> "+targetRef+"[tailport=e, headport=w];");
    }

    /**
    * Adds a basic gateway to the graph.
    * @param name Name given for the gateway.
    * @param id Unique id of the gateway.
    */
    public void gateway(String name, String id) {
        gv.addln(id+" [shape=diamond,fixedsize=true,width=.7, height=.7, label = \""+name+"\"];");
    }
}
