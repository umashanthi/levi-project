package org.levi.engine;

public final class Deployment {
    private String definitionsName;
    private String extractPath;
    private String oMPath;
    private String diagramPath;

    public Deployment(String pid, String op, String dp, String extractPath) {
        assert pid != null;
        assert op != null;
        assert dp != null;
        assert extractPath != null;
        definitionsName = pid;
        oMPath = op;
        diagramPath = dp;
        this.extractPath = extractPath;
    }

    public String getDefinitionsName() {
        return definitionsName;
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
        s = "{" + definitionsName + ", "
                + oMPath + ", "
                + diagramPath + ", "
                + extractPath
                +"}";
        return s;
    }
}
