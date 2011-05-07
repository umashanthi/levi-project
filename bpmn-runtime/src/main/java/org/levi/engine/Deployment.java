package org.levi.engine;

/**
 * @author Ishan Jayawardena
 */
public final class Deployment {
    private String definitionsId;
    private String extractPath;
    private String processDefinitionPath;
    private String diagramPath;

    public Deployment(String pid, String op, String dp, String extractPath) {
        assert pid != null;
        assert op != null;
        assert dp != null;
        assert extractPath != null;
        definitionsId = pid;
        processDefinitionPath = op;
        diagramPath = dp;
        this.extractPath = extractPath;
    }

    public String getDefinitionsId() {
        return definitionsId;
    }

    public String getProcessDefinitionPath() {
        return processDefinitionPath;
    }

    public String getDiagramPath() {
        return diagramPath;
    }

    public String getExtractPath() {
        return extractPath;
    }

    public String toString() {
        String s;
        s = "{" + definitionsId + ", "
                + processDefinitionPath + ", "
                + diagramPath + ", "
                + extractPath
                +"}";
        return s;
    }
}
