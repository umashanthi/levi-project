package org.levi.engine.impl.bpmn.parser;

import org.levi.engine.impl.bpmn.SequenceFlowSet;
import org.omg.spec.bpmn.x20100524.model.*;
import org.omg.spec.bpmn.x20100524.model.impl.TProcessImpl;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectModel implements Serializable {
    // TODO: change this
    private static final int INITIAL_INSTANCE_COUNT = 100;
    private static final Map<File, ObjectModel> instances = new HashMap<File, ObjectModel>(INITIAL_INSTANCE_COUNT);
    //
    private DefinitionsDocument definitionsDoc;
    private transient TProcess[] processArray;
    private int processArraySize;
    private TStartEvent startEvent;
    private transient Map<String, SequenceFlowSet> sourceBasedSeqFlowMap;// = new HashMap<String, SequenceFlowSet>(30);
    //private int sourceSFSize;
    private transient Map<String, SequenceFlowSet> targetBasedSeqFlowMap;// = new HashMap<String, SequenceFlowSet>(30);
    //private int targetSFSize;
    private transient  Map<String, TFlowElement> flowElementMap;// = new HashMap<String, TFlowElement>(25);
    //private int flowElemSize;
    private static final short DEFAULT_PROCESS = 0;
    private int executableProcessCount = 0;
    public ObjectModel(File uri) {
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
            throw new RuntimeException(e);           
        }
        processArray = getProcessArray();
        processArraySize = processArray.length;
        createMaps();
    }

    private TProcess[] getProcessArray() {
        List<TProcess> processList = new ArrayList<TProcess>();
        TRootElement[] rootElementArray = definitionsDoc.getDefinitions().getRootElementArray();
        for (TRootElement aRootElementArray : rootElementArray) {
            if (aRootElementArray instanceof TProcessImpl) {
                TProcessImpl p = (TProcessImpl) aRootElementArray;
                p.getName();
                if (p.getIsExecutable()) {
                    processList.add(p);
                    ++executableProcessCount;
                }
            }
        }

        // TODO; we must handle this later
        if (executableProcessCount > 1) {
            throw new RuntimeException("More than one executable process found");
        }
        if (executableProcessCount == 0) {
            throw new RuntimeException("No executable processes found");
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
        sourceBasedSeqFlowMap = new HashMap<String, SequenceFlowSet>(30);
        targetBasedSeqFlowMap = new HashMap<String, SequenceFlowSet>(30);
        flowElementMap = new HashMap<String, TFlowElement>(25);
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
        //sourceSFSize = sourceBasedSeqFlowMap.size();
        //targetSFSize = targetBasedSeqFlowMap.size();
        //flowElemSize = flowElementMap.size();
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
    // todo toString() methods

    private void readObject(ObjectInputStream s)
    	throws IOException, ClassNotFoundException {
    	s.defaultReadObject(); // read the non transient fields
        // TODO;
        if (processArraySize != executableProcessCount) {
            throw new RuntimeException("Process array size and executable process count do not match");
        }
        processArray = new TProcess[processArraySize];
    	for (int i = 0; i < processArraySize; ++i) {
            processArray[i] = (TProcess)s.readObject();
            //System.out.println("Reading: " + processArray[i].xmlText());
        }
        createMaps();
    }

    private void writeObject(ObjectOutputStream s)
    	throws IOException {
    	s.defaultWriteObject(); // write the non transient fields
        for (TProcess p : processArray) {
            //System.out.println("Writing: " + p.xmlText());
            s.writeObject(p);
        }
        /*
        Collection<SequenceFlowSet> sfset = sourceBasedSeqFlowMap.values();
        for (SequenceFlowSet sf : sfset) {
            s.writeObject(sf);
        }
        sfset = targetBasedSeqFlowMap.values();
        for (SequenceFlowSet sf : sfset) {
            s.writeObject(sf);
        }
        Collection<TFlowElement> flowelems = flowElementMap.values();
        for (TFlowElement e : flowelems) {
            s.writeObject(e);
        }*/
    }
}