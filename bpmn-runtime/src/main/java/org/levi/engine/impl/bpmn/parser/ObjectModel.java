package org.levi.engine.impl.bpmn.parser;

import org.levi.engine.impl.bpmn.SequenceFlowSet;
import org.omg.spec.bpmn.x20100524.model.*;
import org.omg.spec.bpmn.x20100524.model.impl.TProcessImpl;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectModel {
    private static final int INITIAL_INSTANCE_COUNT = 100;
    private static final Map<File, ObjectModel> instances = new HashMap<File, ObjectModel>(INITIAL_INSTANCE_COUNT);
    //
    private DefinitionsDocument definitionsDoc;
    private TProcess[] processArray;
    private TStartEvent startEvent;
    private final Map<String, SequenceFlowSet> sourceBasedSeqFlowMap = new HashMap<String, SequenceFlowSet>(30);
    private final Map<String, SequenceFlowSet> targetBasedSeqFlowMap = new HashMap<String, SequenceFlowSet>(30);
    private final Map<String, TFlowElement> flowElementMap = new HashMap<String, TFlowElement>(25);
    private static final short DEFAULT_PROCESS = 0;

    private ObjectModel(File uri) {
        assert uri != null;
        init(uri);
    }

    // TODO can you verify this?
    public static ObjectModel getInstance(File uri) {
        if (uri == null) {
            throw new IllegalArgumentException("Attempt to create an OM with a null uri");
        }
        ObjectModel om = instances.get(uri);
        if (om == null) {
            synchronized (ObjectModel.class) {
                om = instances.get(uri);
                if (om == null) {
                    om = new ObjectModel(uri);
                    instances.put(uri, om);
                }                          
            }
        }
        return om;
    }

    private void init(File instance) {
        try { // XmlException, IOException
            definitionsDoc = DefinitionsDocument.Factory.parse(instance);
        } catch (Exception e) {
            //e.printStackTrace();
            throw new IllegalArgumentException(e.getMessage());            
        }
        processArray = getProcessArray();
        createMaps();
    }

    private TProcess[] getProcessArray() {
        List<TProcess> processList = new ArrayList<TProcess>();
        TRootElement[] rootElementArray = definitionsDoc.getDefinitions().getRootElementArray();
        for (TRootElement aRootElementArray : rootElementArray) {
            if (aRootElementArray instanceof TProcessImpl) {
                TProcessImpl p = (TProcessImpl) aRootElementArray;
                if (p.getIsExecutable()) {
                    processList.add(p);
                }
            }
        }
        return processList.toArray(new TProcess[processList.size()]);
    }

    private TFlowElement[] getFlowElements(int processId) {
        assert processId >= 0;
        assert processId < processArray.length;
        return processArray[processId].getFlowElementArray();
    }

    private void createMaps() {
        TFlowElement[] flowElems = getFlowElements(DEFAULT_PROCESS);
        for (TFlowElement e : flowElems) {
            if (e instanceof TSequenceFlow) {
                TSequenceFlow sf = (TSequenceFlow) e;
                if (!sourceBasedSeqFlowMap.containsKey(sf.getSourceRef())) {
                    sourceBasedSeqFlowMap.put(sf.getSourceRef(), new SequenceFlowSet(sf));
                } else {
                    sourceBasedSeqFlowMap.get(sf.getSourceRef()).add(sf);
                }
                if (!targetBasedSeqFlowMap.containsKey(sf.getTargetRef())) {
                    targetBasedSeqFlowMap.put(sf.getTargetRef(), new SequenceFlowSet(sf));
                } else {
                    targetBasedSeqFlowMap.get(sf.getTargetRef()).add(sf);
                }
            } else if (e instanceof TStartEvent) {
                startEvent = (TStartEvent) e;
            } else {
                flowElementMap.put(e.getId(), e);
            }
        }
    }

    public TStartEvent getStartEvent() {
        return startEvent;
    }

    public TFlowElement getFlowElement(String id) {
        return flowElementMap.get(id);
    }

    public SequenceFlowSet getSourceSequenceFlowSet(String id) {
        return sourceBasedSeqFlowMap.get(id);
    }

    public SequenceFlowSet getTargetSequenceFlowSet(String id) {
        return targetBasedSeqFlowMap.get(id);
    }
    
    public String getProcessName() {
        return processArray[DEFAULT_PROCESS].getName();
    }
}