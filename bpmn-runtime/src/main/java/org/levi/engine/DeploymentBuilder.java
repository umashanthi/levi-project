package org.levi.engine;

import java.io.InputStream;
import java.util.zip.ZipInputStream;

public interface DeploymentBuilder {


    DeploymentBuilder addInputStream(String resourceName, InputStream inputStream);

    DeploymentBuilder addClasspathResource(String resource);

    DeploymentBuilder addString(String resourceName, String text);

    DeploymentBuilder addZipInputStream(ZipInputStream zipInputStream);

    DeploymentBuilder setName(String name);

    void deploy();

}
