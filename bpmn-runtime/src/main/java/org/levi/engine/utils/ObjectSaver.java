package org.levi.engine.utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author Ishan Jayawardena
 */
public class ObjectSaver {
    FileOutputStream out;
    ObjectOutputStream objectOs;

    public ObjectSaver(String path)
            throws IOException {
        assert path != null;

        out = new FileOutputStream(path);
        objectOs = new ObjectOutputStream(out);
    }

    public void saveObject(Object object)
            throws IOException {
        assert object != null;
        objectOs.writeObject(object);
    }
}
