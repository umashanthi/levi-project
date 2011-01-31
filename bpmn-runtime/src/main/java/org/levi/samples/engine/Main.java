package org.levi.samples.engine;

import org.levi.engine.impl.bpmn.parser.ObjectModel;
import org.levi.engine.runtime.ProcessInstance;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String path = "bpmn-runtime/src/main/java/org/levi/samples/data";
        // /TroubleTicketSystem.bpmn
        // /book_fig61.bpmn
        // /parallel_gateway_1.bpmn
        ObjectModel om = ObjectModel.getInstance(new File(path + "/book_fig49.bpmn"));
        ProcessInstance p = new ProcessInstance(om);
        p.execute();
    }
}
