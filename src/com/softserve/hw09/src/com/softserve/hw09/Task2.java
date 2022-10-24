package com.softserve.hw09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task2 {
    public static void map() {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Austin", "Jane");
        personMap.put("Wilson", "James");
        personMap.put("Danes", "Flavia");
        personMap.put("Davidson", "Pete");
        personMap.put("Gilmore", "Lorelei");
        personMap.put("Whalberg", "Jess");
        personMap.put("Johnson", "Kim");
        personMap.put("Smith", "Sam");
        personMap.put("Chung", "Alexa");
        personMap.put("Whitaker", "John");
        System.out.println(personMap);

        personMap.entrySet().removeIf(entry -> entry.getValue().equals("John"));
        System.out.println("\n" + personMap);
        
    }


}
