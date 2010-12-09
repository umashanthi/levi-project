package org.levi.bpmn.runtime;



import org.levi.bpmn.runtime.event.NodeFactory;
import org.omg.spec.bpmn.x20100524.model.TTask;

/**
 * Created by IntelliJ IDEA.
 * User: ishan
 * Date: Nov 22, 2010
 * Time: 3:49:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class Task extends Activity {
    TTask _task;
    NodeFactory _nodeFac;

    public Task(TTask task, NodeFactory nodeFac) {
        super();
        _task = task;
        _nodeFac = nodeFac;
    }
    
    public void run() {
        System.out.print(this.getClassName());         
        System.out.println( ": " + _task.getName());
        instance(_nodeFac.createNextNode());
    }
}
