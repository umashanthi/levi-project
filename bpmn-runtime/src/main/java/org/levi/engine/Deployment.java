package org.levi.engine;

import org.levi.engine.utils.ExtractData;
import org.levi.engine.utils.Extractor;
import org.levi.engine.utils.LeviUtils;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author Ishan Jayawardena
 */
public final class Deployment {
    private String definitionsId;
    private String extractPath;
    private String processDefinitionPath;
    private String diagramPath;
    private Date deploymentTime;
    private Map<String, List<String>> otherFiles;

    public Deployment(String pid, String op, String dp, String extractPath, Date depTime, Map<String, List<String>> otherFiles) {
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
        this.otherFiles = otherFiles;
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

    public String getOtherFile(String fileName) {
        String ext = LeviUtils.getFileExtension(fileName);

        if (ext == null)  {
            return "";
        }
        if ("".equals(ext)) {
            ext = ExtractData.EMPTY_EXTENSION;
        }
        List<String> paths = otherFiles.get(ext);
        for (String path : paths) {
            if (path.endsWith(fileName)) {
                return path;
            }
        }
        return "";
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
