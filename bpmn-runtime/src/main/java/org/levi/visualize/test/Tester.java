package org.levi.visualize.test;

import org.levi.visualize.api.GraphViz;
import org.levi.visualize.api.BPMNSymbolFactory;
import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * UserBean: keheliya
 * Date: Feb 4, 2011
 * Time: 10:19:31 AM
 * For Levi - The Native BPMN 2.0 Execution Engine
 */

public class Tester {
     public static void main(String[] args)
   {
      Tester t = new Tester();
     t.start();

   }

    private void start() {

      GraphViz gv = new GraphViz();
      BPMNSymbolFactory sf = new BPMNSymbolFactory(gv);

      sf.start_BPMN_graph();

        //Adding all the nodes
      sf.startEvent("SE 1","se_1");
      sf.normalTask("Task 1","tk_1");
      sf.gateway("GWay 1","gt_1");
      sf.normalTask("Task 2","tk_2");
      sf.normalTask("Task 3","tk_3");
      sf.gateway("GWay 2","gt_2");
      sf.normalTask("Task 4","tk_4");
      sf.endEvent("End 1","end_1");

        //Adding the edges
      sf.sequenceFlow("se_1","tk_1");
      sf.sequenceFlow("tk_1","gt_1");
      sf.sequenceFlow("gt_1","tk_2");
      sf.sequenceFlow("gt_1","tk_3");
      sf.sequenceFlow("tk_2","gt_2");
      sf.sequenceFlow("tk_3","gt_2");
      sf.sequenceFlow("gt_2","tk_4");
      sf.sequenceFlow("tk_4","end_1");

      sf.end_BPMN_graph();

      System.out.println(gv.getDotSource());

      File out = new File("/home/keheliya/Projects/bpmnViz/new/bpmn1.svg");
      gv.writeGraphToFile(gv.getGraph(gv.getDotSource(),"svg"), out);
    }
}
