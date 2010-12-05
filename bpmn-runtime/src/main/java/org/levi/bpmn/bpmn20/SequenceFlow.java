package org.levi.bpmn.bpmn20;

/**
 * Created by IntelliJ IDEA.
 * User: ishan
 * Date: Nov 22, 2010
 * Time: 3:01:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class SequenceFlow {
    private Node _parent;
    private Node _child;

    public SequenceFlow(Node parent, Node child) {
        _parent = parent;
        _child = child;
    }
}
