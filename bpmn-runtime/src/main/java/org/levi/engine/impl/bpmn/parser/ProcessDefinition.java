package org.levi.engine.impl.bpmn.parser;

import org.levi.engine.LeviException;
import org.levi.engine.impl.bpmn.SequenceFlowSet;
import org.levi.engine.utils.LeviUtils;
import org.omg.spec.bpmn.x20100524.model.*;
import org.omg.spec.bpmn.x20100524.model.impl.TProcessImpl;

import java.io.*;
import java.util.*;

/**
 * @author Ishan Jayawardena
 */
public class ProcessDefinition implements Serializable {
    
    private DefinitionsDocument definitionsDoc;
    private transient TProcess[] processArray;
    private int processArraySize;
    private TStartEvent startEvent;
    private transient Map<String, SequenceFlowSet> sourceBasedSeqFlowMap;
    //private int sourceSFSize;
    private transient Map<String, SequenceFlowSet> targetBasedSeqFlowMap;
    //private int targetSFSize;
    private transient  Map<String, TFlowElement> flowElementMap;
    //private int flowElemSize;
    private static final short DEFAULT_PROCESS = 0;
    private int executableProcessCount = 0;
    private String id;

    public ProcessDefinition(File uri) {
        if (uri == null) {
            throw new LeviException("BPMN file is null.");
        }
        init(uri);
    }

    private void init(File instance) {
        try { // XmlException, IOException
            definitionsDoc = DefinitionsDocument.Factory.parse(instance);
            //BPMNDiagram[] diagramarray = definitionsDoc.getDefinitions().getBPMNDiagramArray();
            //BPMNDiagram d1 =diagramarray[0];
            
        } catch (Exception e) {
            throw new LeviException(e);           
        }
        processArray = getProcessArray();
        processArraySize = processArray.length;
        createMaps();
        String defName = getDefinitionsName();
        id = LeviUtils.trimAndReplace(defName);
        id = String.valueOf(id.hashCode());
    }

    private TProcess[] getProcessArray() {
        List<TProcess> processList = LeviUtils.newArrayList();
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
            throw new LeviException("More than one executable process found");
        }
        if (executableProcessCount == 0) {
            throw new LeviException("No executable processes found");
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
        sourceBasedSeqFlowMap = LeviUtils.newHashMap(30);
        targetBasedSeqFlowMap = LeviUtils.newHashMap(30);
        flowElementMap = LeviUtils.newHashMap(25);
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

    public String getModifiedName(TFlowElement e) {
        return modify(e.getName());
    }

    public String getModifiedId(TFlowElement e) {
        return modify(e.getId());
    }

    public String modify(String s) {
        return LeviUtils.trimAndReplace(s);
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
    
    public String getDefaultProcessName() {
        return processArray[DEFAULT_PROCESS].getName();
    }

    public String getDefinitionsName() {
        return definitionsDoc.getDefinitions().getName(); 
    }

    public String getDefinitionsId() {
        return id;
    }

    public Collection <TFlowElement> getFlowElementList() {
        return flowElementMap.values();
    }

    public Collection <SequenceFlowSet> gettargetBasedSeqFlowMapList() {
        return targetBasedSeqFlowMap.values();
    }

    // todo toString() methods
    private void readObject(ObjectInputStream s)
    	throws IOException, ClassNotFoundException {
    	s.defaultReadObject(); // read the non transient fields
        // TODO;
        if (processArraySize != executableProcessCount) {
            throw new LeviException("Process array size and executable process count do not match");
        }
        processArray = new TProcess[processArraySize];
    	for (int i = 0; i < processArraySize; ++i) {
            processArray[i] = (TProcess)s.readObject();
        }
        createMaps();
        id = (String)s.readObject();
    }


    private void writeObject(ObjectOutputStream s)
    	throws IOException {
    	s.defaultWriteObject(); // write the non transient fields
        for (TProcess p : processArray) {
            s.writeObject(p);
        }
        s.writeObject(id);
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