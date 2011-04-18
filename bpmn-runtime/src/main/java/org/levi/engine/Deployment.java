package org.levi.engine;

public final class Deployment {
    private String processId;
    private String extractPath;
    private String oMPath;
    private String diagramPath;

    public Deployment(String pid, String op, String dp, String extractPath) {
        assert pid != null;
        assert op != null;
        assert dp != null;
        assert extractPath != null;
        processId = pid;
        oMPath = op;
        diagramPath = dp;
        this.extractPath = extractPath;
    }

    public String getProcessId() {
        return processId;
    }

    public String getOmPath() {
        return oMPath;
    }

    public String getDiagramPath() {
        return diagramPath;
    }

    public String getExtractPath() {
        return extractPath;
    }

    public String toString() {
        String s;
        s = "{" + processId + ", "
                + oMPath + ", "
                + diagramPath + ", "
                + extractPath
                +"}";
        return s;
    }
}
