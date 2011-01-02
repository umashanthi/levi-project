package org.levi.engine.impl.bpmn;

import org.omg.spec.bpmn.x20100524.model.TSequenceFlow;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ishan
 * Date: Dec 20, 2010
 * Time: 1:44:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class SequenceFlowSet {
    private TSequenceFlow firstItem;
    private List<TSequenceFlow> seqFlowList = null;
    private int size;

    public SequenceFlowSet(TSequenceFlow firstItem) {
        // TODO
        //if (firstItem == null) {
        //    throw new NullPointerExeption();
        //}
        //seqFlowList = new ArrayList<TSequenceFlow>(3);
        assert firstItem != null; // this should be handled with an exception instead
        this.firstItem = firstItem;
        size = 1;
    }

    public void add(TSequenceFlow seqFlow) {
        if (seqFlow == null) {
            throw new NullPointerException();
        }
        if (seqFlowList == null) {
            seqFlowList = new ArrayList<TSequenceFlow>(3);
        }
        if (!seqFlowList.contains(seqFlow) && seqFlow != firstItem) {
            seqFlowList.add(seqFlow);
            ++size;
        }
    }
    public int size() {
        return size;
    }

    public String getSourceRef() {
        return firstItem.getSourceRef();
    }
    public String getId() {
        if (!isMultiSet()) {
            return firstItem.getId();
        } else {
            throw new IllegalArgumentException("Cannot return a single id for a multiset");
        }
    }

    public TSequenceFlow get(int i) {
        return (i == 0) ? firstItem : seqFlowList.get(i-1);
    }

    public TSequenceFlow getByTargetRef(String id) {
        if (id.equals(firstItem.getTargetRef())) {
            return firstItem;
        }
        for (TSequenceFlow sf : seqFlowList) {
            if (id.equals(sf.getTargetRef())) {
                return sf;
            }
        }
        return null;
    }

    public String getTargetRef() {
        return firstItem.getTargetRef();
    }

    public boolean isMultiSet() {
        return (seqFlowList == null) ? false : true;
    }

    public String toString() {
        String s = "";
        s += "{(";
        s += firstItem.getSourceRef();
        s += ":";
        s += firstItem.getTargetRef();
        s += ")";
        if (seqFlowList != null) {
            for (int i = 1; i < seqFlowList.size(); ++i) {
                TSequenceFlow sf = seqFlowList.get(i);
                s += ", (";
                s += sf.getSourceRef()+ ":";
                s += sf.getTargetRef() + ")";
            }
        }
        s += "}";
        return s;
    }
}
