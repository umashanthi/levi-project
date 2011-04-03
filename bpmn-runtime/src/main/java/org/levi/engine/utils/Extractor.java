package org.levi.engine.utils;

import java.io.*;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/*
    Extract the files from a lar archive
*/

public class Extractor {

    /*
            Change the file and directories and do separate extraction
            Extract the files and directories to enumerator as Zip entry and extract them one by one.
            @param String
     */
    public void extract(String addr) {
        Enumeration<?> enumEntries;

        try {
            ZipFile zip = new ZipFile(addr);
            enumEntries = zip.entries();
            while (enumEntries.hasMoreElements()) {
                ZipEntry entry = (ZipEntry) enumEntries.nextElement();
                if (entry.isDirectory()) {
                    (new File(entry.getName())).mkdir();
                    continue;
                }
                extract(zip.getInputStream(entry), new FileOutputStream(entry.getName()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void extract(InputStream in, OutputStream out) throws IOException {
        byte[] buf = new byte[1024];
        int count;
        while ((count = in.read(buf)) >= 0) {
            out.write(buf, 0, count);
        }
        in.close();
        out.flush();
        out.close();
    }

}
