package com.softserve.edu09.hw;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> personMap = new LinkedHashMap<>();
        personMap.put("Shevchenko", "Ivan");
        personMap.put("Mishcenko", "Igor");
        personMap.put("Lopar", "Ganna");
        personMap.put("Pronina", "Maria");
        personMap.put("Bazhan", "Vasyl");
        personMap.put("Lunyov", "Sergiy");
        personMap.put("Leleka", "Ivan");
        personMap.put("Gorbacheva", "Irina");
        personMap.put("Krut", "Alina");
        personMap.put("Dereza", "Asya");
        System.out.println(personMap);
        checkAndRemove(personMap);
    }

    public static void checkAndRemove (Map map) {
        Iterator iterator = map.entrySet().iterator();
        Map<String, String> dublicateMap = new LinkedHashMap<>();

        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            if (map.containsValue(entry.getValue()) && dublicateMap.containsValue(entry.getValue())) {
                System.out.println("Співпадіння знайдені: " + entry.getValue());
                System.out.println("---------");
            } else {
                dublicateMap.put((String) entry.getKey(), (String) entry.getValue());
            }
            if (entry.getValue() == "Ganna") {
                System.out.println("---------");
                System.out.println("Видаляємо персону з іменем Ganna");
                iterator.remove();
                System.out.println("---------");
            }

        }
       map.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
