package org.levi.bpmn.bpmn20.event;

import org.apache.xmlbeans.XmlException;
import org.omg.spec.bpmn.x20100524.model.DefinitionsDocument;
import org.omg.spec.bpmn.x20100524.model.TFlowElement;
import org.omg.spec.bpmn.x20100524.model.TProcess;
import org.omg.spec.bpmn.x20100524.model.TRootElement;
import org.omg.spec.bpmn.x20100524.model.impl.TProcessImpl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ishan
 * Date: Nov 24, 2010
 * Time: 11:11:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class ObjectModel {
    private DefinitionsDocument _definitionsDoc;
    private TProcess[] _processArray;

    public ObjectModel(File instance) {
        assert instance != null;        
        init(instance);
    }

    private void init(File instance) {
        try {
            _definitionsDoc = DefinitionsDocument.Factory.parse(instance);
        } catch (XmlException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        _processArray = getProcessArray();
    }

    /**
     * returns the executable processes list of the current instance document
     * @return
     */
    private TProcess[] getProcessArray() {
        List<TProcess> list = new ArrayList<TProcess>();
        TRootElement[] rootElementArray = _definitionsDoc.getDefinitions().getRootElementArray();
        for (int i = 0; i < rootElementArray.length; ++i) {
            if (rootElementArray[i] instanceof TProcessImpl) {
                TProcessImpl p = (TProcessImpl)rootElementArray[i];
                if (p.getIsExecutable()) {
                    list.add(p);
                }
            }
        }
        return list.toArray(new TProcess[list.size()]);
    }
    
    public TFlowElement[] getFlowElements(int processId) {
        assert processId >= 0;
        assert processId < _processArray.length;
        return _processArray[processId].getFlowElementArray();
    }
}
