package org.levi.bpmn.runtime.event;

import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * User: ishan
 * Date: Nov 24, 2010
 * Time: 9:39:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        String path = "bpmn-runtime/src/main/java/org/levi/bpmn/runtime/data";
        ObjectModel om = new ObjectModel(new File(path + "/TroubleTicketSystem.bpmn"));
        Process p = new Process(om);
        p.execute();
    }
}
