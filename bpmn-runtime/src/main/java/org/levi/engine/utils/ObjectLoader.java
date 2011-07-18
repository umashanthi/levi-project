package org.levi.engine.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author Ishan Jayawardena
 */
public class ObjectLoader {
    FileInputStream in;
	ObjectInputStream objectIs;
    
    public ObjectLoader(String path)
            throws IOException {
        assert path != null;
        in = new FileInputStream(path);
        objectIs = new ObjectInputStream(in);
    }

    public Object readNextObject()
            throws ClassNotFoundException, IOException {
        return objectIs.readObject();  
    }
}
