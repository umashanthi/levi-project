package org.levi.engine;

public class Deployment {
    private String processId;
    private String larPath;
    private String oMPath;
    private String diagramPath;

    public Deployment(String pid, String op, String dp, String larPath) {
        assert pid != null;
        assert op != null;
        assert dp != null;
        assert larPath != null;
        processId = pid;
        oMPath = op;
        diagramPath = dp;
        this.larPath = larPath;
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

    public String getLarPath() {
        return larPath;
    }
}
