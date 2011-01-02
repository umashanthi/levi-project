package org.levi.engine.impl.bpmn;

import org.levi.engine.bpmn.Gateway;
import org.omg.spec.bpmn.x20100524.model.*;

/**
 * Created by IntelliJ IDEA.
 * User: ishan
 * Date: Dec 22, 2010
 * Time: 4:23:10 AM
 * To change this template use File | Settings | File Templates.
 */
public class GatewayFactory {
    public static Gateway newGateway(TGateway g, GatewayNode gi) {
        if (g instanceof TExclusiveGateway) {
            return new ExclusiveGateway((TExclusiveGateway)g, gi);
        } else if (g instanceof TParallelGateway) {
            return new ParallelGateway((TParallelGateway)g, gi);
        } else if (g instanceof TInclusiveGateway) {
            throw new IllegalArgumentException("unsupproted Gateway type");
        } else if (g instanceof TComplexGateway) {
            throw new IllegalArgumentException("unsupproted Gateway type");
        } else {
            throw new IllegalArgumentException("unknown Gateway type");
        }
    }
}
