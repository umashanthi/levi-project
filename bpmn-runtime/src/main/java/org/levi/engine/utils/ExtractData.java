package org.levi.engine.utils;

import java.util.List;
import java.util.Map;

/**
 * @author Ishan Jayawardena
 */
public final class ExtractData {
    public static String EMPTY_EXTENSION = "EMPTYEXTENSION";
    private String extractPath;
    private List<String> bpmnFiles = LeviUtils.newArrayList();
    private Map<String, List<String>> otherFiles = LeviUtils.newHashMap();

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
        String extension = LeviUtils.getFileExtension(otherFile);
        if ("".equals(extension) || extension == null || otherFile.equals(extension)) {
            extension = EMPTY_EXTENSION;
        }
        if (otherFiles.containsKey(extension)) {
            if (!otherFiles.get(extension).contains(otherFile)) {
                otherFiles.get(extension).add(otherFile);
            }
        } else {
            List<String> files = LeviUtils.newArrayList();
            files.add(otherFile);
            otherFiles.put(extension, files);
        }
    }

    public Map<String, List<String>> getOtherFiles() {
        return otherFiles;
    }
}
