package com.softserve.hw09.task2;

import java.util.HashMap;
import java.util.Map;

/**
 * Create map personMap and add to it ten persons of type <String, String> ().
 * Output the entities of the map on the screen.
 * There are at less two persons with the same firstName among these 10 people?
 * Remove from the map person whose firstName is ”Orest” (or other). Print result.
 */
public class Task2 {
    public void run() {
        Map<String, String> personMap = new HashMap<>() {{
            put("lastName1", "firstName1");
            put("lastName2", "The-same-firstName");
            put("lastName3", "firstName3");
            put("lastName4", "Orest");
            put("lastName5", "firstName5");
            put("lastName6", "The-same-firstName");
            put("lastName7", "firstName7");
            put("lastName8", "firstName8");
            put("lastName9", "firstName9");
            put("lastName10", "firstName10");
        }};

        System.out.println(personMap);
        personMap.remove(personMap.entrySet().removeIf(entry -> entry.getValue().equals("Orest")));
        System.out.println(personMap);
    }
}
