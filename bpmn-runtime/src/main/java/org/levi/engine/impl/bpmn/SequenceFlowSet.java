package org.levi.engine.impl.bpmn;

import org.omg.spec.bpmn.x20100524.model.TSequenceFlow;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class SequenceFlowSet implements Iterable<TSequenceFlow>, Iterator<TSequenceFlow> {
    private TSequenceFlow firstItem;
    private List<TSequenceFlow> seqFlowList = null;
    private int size;
    private int count = 0;

    public SequenceFlowSet(TSequenceFlow firstItem) {
        if (firstItem == null) {
            throw new NullPointerException("Attempt to create a SequenceFlowSet from a null TSequenceFlow reference");
        }
        this.firstItem = firstItem;
        size = 1;
    }

    // TODO do with synchronization?
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

    public String getId() {
        if (!isMultiSet()) {
            return firstItem.getId();
        } else {
            throw new UnsupportedOperationException("Cannot return a single id for a multiset");
        }
    }

    public TSequenceFlow get(int i) {
        return (i == 0) ? firstItem : seqFlowList.get(i-1);
    }

    public String getTargetRef() {
        return firstItem.getTargetRef();
    }

    public boolean isMultiSet() {
        return (seqFlowList != null);
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

    public Iterator<TSequenceFlow> iterator() {
        return this;
    }

    public boolean hasNext() {
        return (count < size);   
    }

    public TSequenceFlow next() {
        if (count == size) {
            throw new NoSuchElementException("No more elements"); 
        }
        ++count;
        return get(count - 1); // TODO count++ instead?
    }

    public void remove() {
        throw new UnsupportedOperationException("remove operation not supported for SequenceFlowSet");   
    }
}
