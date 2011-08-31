package org.levi.engine.utils;

import org.levi.engine.LeviException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author Ishan Jayawardena
 */
public class LeviUtils {
    private LeviUtils() {
    }
    public static String trimAndReplace(String str) {
        return str == null ? "" : str
                .trim()
                .replaceAll(" ", "")
                .replaceAll("-", "_")
                .replaceAll("/", "");
    }

    public static String getyyyyMMddHHmmss() {
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public static <E> List<E> giveList(List<E> list) {
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(list);
    }

    public static <E> ArrayList<E> newArrayList(int initialCapacity) {
         if (initialCapacity <= 0) {
            throw new LeviException("Initial Capacity must be > 0.");
        }
        return new ArrayList<E>(initialCapacity);   
    }

    public static <E> ArrayList<E> newArrayList() {
        return new ArrayList<E>();
    }

    public static <K, V> HashMap<K, V> newHashMap(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new LeviException("Initial Capacity must be > 0.");
        }
        return new HashMap<K, V>(initialCapacity);
    }

    public static <K, V> HashMap<K, V> newHashMap() {
        return new HashMap<K, V>();
    }

    public static int readUserInput(int nOptions) {
        int input;
        System.out.print("What is your option {0 through " + (nOptions - 1) + "}? ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            input = br.read();
            input = input - '0';
            if (input < 0 || input > nOptions - 1) {
                throw new IllegalArgumentException("input " + input + " is out of range");
            }
            return input;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static String getFileExtension(String path) {
        return null;
    }

    public static String getFileName(String path) {
        return path.substring(path.lastIndexOf('/')+1, path.length());
    }

    public static String getNotProcessId(String Id) {
        if (Id == null) {
            throw new NullPointerException("Id is null.");
        }
        String[] parts = Id.split("#");
        if (parts.length <= 1) {
            return  parts[0];
        } else {
            return parts[1];
        }
    }

    public static String getNotTaskId(String Id) {
        if (Id == null) {
            throw new NullPointerException("Id is null.");
        }
        return Id.split("#")[0];
    }

    public static String combineTaskId(String processId, String taskId) {
        if (processId != null && taskId != null) {
            return processId + "#" + taskId;
        } else {
            throw new NullPointerException("Either Process Id or task Id is null.");
        }
    }
}

