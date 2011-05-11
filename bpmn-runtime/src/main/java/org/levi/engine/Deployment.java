package org.levi.engine;

import java.util.Date;

/**
 * @author Ishan Jayawardena
 */
public final class Deployment {
    private String definitionsId;
    private String extractPath;
    private String processDefinitionPath;
    private String diagramPath;
    private Date deploymentTime;

    public Deployment(String pid, String op, String dp, String extractPath, Date depTime) {
        assert pid != null;
        assert op != null;
        assert dp != null;
        assert extractPath != null;
        assert depTime != null;
        definitionsId = pid;
        processDefinitionPath = op;
        diagramPath = dp;
        this.extractPath = extractPath;
        deploymentTime = depTime;
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

    public Date getDate() {
        return deploymentTime;
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
