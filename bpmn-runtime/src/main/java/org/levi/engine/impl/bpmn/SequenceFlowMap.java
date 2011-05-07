package org.levi.engine.impl.bpmn;

import org.omg.spec.bpmn.x20100524.model.TSequenceFlow;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ishan Jayawardena
 */
public final class SequenceFlowMap {
    private final Map<String, TSequenceFlow> seqFlows;
    private final int initialCapacity;
    private final String[] k1;
    private final String[] k2;
    private final String[] k3;
    private int count;

    public SequenceFlowMap(int initialCapacity) {
        this.initialCapacity = initialCapacity;
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Invalid initial capacity for SequenceFlowMap");
        }
        seqFlows = new HashMap<String, TSequenceFlow>(this.initialCapacity);
        k1 = new String[this.initialCapacity];
        k2 = new String[this.initialCapacity];
        k3 = new String[this.initialCapacity];
        count = 0;
    }

    public void put(TSequenceFlow seqFlow) {
        k1[count] = seqFlow.getSourceRef();
        k1[count].intern();
        k2[count] = seqFlow.getId();
        k2[count].intern();
        k3[count] = seqFlow.getTargetRef();
        k3[count].intern();
        seqFlows.put(k1[count]+k2[count]+k3[count], seqFlow);
        ++count;
    }

    public TSequenceFlow getBySourceRef(String sourceRef) { // k1
        if (sourceRef == null) {
            throw new IllegalArgumentException("null Source Ref");
        }
        return seqFlows.get(makeKey(search(sourceRef, k1)));
    }

    public TSequenceFlow getById(String id) {    // k2
        if (id == null) {
            throw new IllegalArgumentException("null id");
        }
        return seqFlows.get(makeKey(search(id, k2)));
    }

    public TSequenceFlow getByTargetRef(String targetRef) {  // k3
        if (targetRef == null) {
            throw new IllegalArgumentException("null Target Ref");
        }
        return seqFlows.get(makeKey(search(targetRef, k3)));
    }

    private int search(String s, String[] keys) {
        for (int i = 0; i < keys.length; ++i) {
            if (s == keys[i]) {
                return i;
            }
        }
        return -1;
    }

    private String makeKey(int keyIndex) {
        assert keyIndex >= 0;
        return k1[keyIndex] + k2[keyIndex] + k3[keyIndex];
    }
}

