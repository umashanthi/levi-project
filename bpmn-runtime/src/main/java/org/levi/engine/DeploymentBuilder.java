package org.levi.engine;

import java.io.InputStream;
import java.util.zip.ZipInputStream;

/**
 * Created by IntelliJ IDEA.
 * User: keheliya
 * Date: Feb 1, 2011
 * Time: 11:41:48 AM
 * For Levi - The Native BPMN 2.0 Execution Engine
 */
public interface DeploymentBuilder {


    DeploymentBuilder addInputStream(String resourceName, InputStream inputStream);

    DeploymentBuilder addClasspathResource(String resource);

    DeploymentBuilder addString(String resourceName, String text);

    DeploymentBuilder addZipInputStream(ZipInputStream zipInputStream);

    DeploymentBuilder setName(String name);

    void deploy();

}
