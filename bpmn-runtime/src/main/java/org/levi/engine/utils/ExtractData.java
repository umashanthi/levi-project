package org.levi.engine.utils;

import java.util.List;

/**
 * @author Ishan Jayawardena
 */
public final class ExtractData {
    private String extractPath;
    private List<String> bpmnFiles = LeviUtils.newArrayList();
    private List<String> otherFiles = LeviUtils.newArrayList();

    public boolean validate() {
        if (extractPath == null) {
            System.err.println("Extract path of the extract data is null");
            return false;
        }
        if (bpmnFiles.isEmpty()) {
            System.err.println("No BPMN files found in Extract data");
            return false;
        }
        return true;
    }

    public void setExtractPath(String extractPath) {
        assert extractPath != null;
        this.extractPath = extractPath;
    }

    public String getExtractPath() {
        return extractPath;
    }

    public void addBPMNFile(String bpmnFile) {
        assert bpmnFile != null;
        if (!bpmnFiles.contains(bpmnFile)) {
            bpmnFiles.add(bpmnFile);
        }
    }

    public List<String> getBPMNFiles() {
        return bpmnFiles;
    }

    public void addOtherFile(String otherFile) {
        assert otherFile != null;
        if (!otherFiles.contains(otherFile)) {
            otherFiles.add(otherFile);
        }
    }

    public List<String> getOtherFiles() {
        return otherFiles;
    }
}
