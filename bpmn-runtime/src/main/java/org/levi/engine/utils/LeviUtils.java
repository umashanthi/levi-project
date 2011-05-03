package org.levi.engine.utils;

import org.levi.engine.LeviException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author Ishan Jayawardena
 */
public class LeviUtils {
    public static String trimAndReplace(String str) {
        return str == null ? "" : str
                .trim()
                .replaceAll(" ", "_")
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
}
