package com.softserve.edu09.practical_tasks.task2;

import com.softserve.hw01.MessageHelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.softserve.hw01.MessageHelper.*;

/**
 * In the main() method declare map employeeMap of pairs <Integer, String>.
 * <p>- Add to employeeMap seven pairs (ID, name) of some persons. Display the map on the screen.
 * <p>- Ask user to enter ID, then find and write corresponding name from your map. If you can't
 * find this ID - say about it to user (use function containsKey()).
 * <p>- Ask user to enter name, verify than you have name in your map and write corresponding ID.
 * <p>If you can't find this name - say about it to user (use function containsValue()).
 */
public class Task2 {
    public void run() {
        Map<Integer, String> employeeMap = new HashMap<>() {{
            put(1, "Bob");
            put(2, "Tom");
            put(3, "Ron");
            put(4, "Tom");
            put(5, "Jon");
            put(6, "Ann");
            put(7, "Sara");
        }};

        System.out.println("employeeMap" + employeeMap);

        writeMessage("Enter ID:");
        int id = readIntMessage();
        System.out.println(employeeMap.containsKey(id) ?
                "Corresponding name - " + employeeMap.get(id) :
                "Can't find ID "+ id);

        writeMessage("Enter name:");
        String name = readStringMessage();
        System.out.println(employeeMap.containsValue(name) ?
                "Corresponding ID - " + getListKeys(employeeMap, name) :
                "Can't find \"" + name + "\" name");

    }

    private <K, V> List<K> getListKeys(Map<K, V> map, V value) {
        return map.entrySet().stream()
                .filter(entry -> entry.getValue().equals(value))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
/*
        List<K> keys = new ArrayList<>();
        for (Map.Entry<K,V> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                keys.add(entry.getKey());
            }
        }
        return keys;
*/
    }

}
