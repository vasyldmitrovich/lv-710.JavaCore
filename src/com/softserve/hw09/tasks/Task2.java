package com.softserve.hw09.tasks;

import com.softserve.IO.Output;

import java.util.HashMap;
import java.util.Map;

public class Task2 {

    static public void runTask2(){

        //Create map personMap and add to it ten persons of type <String, String> (lastName, firstName).
        //Output the entities of the map on the screen.
        //There are at least two persons with the same firstName among these 10 people?
        //Remove from the map person whose firstName is ”Orest” (or other). Print result.

        Map<String, String> personMap = new HashMap<>();

        personMap.put("Khrystych ", "Zhyvorid");
        personMap.put("Brodatskyi ", "Orest");
        personMap.put("Borysiuk", "Svitolyk");
        personMap.put("Zastavnyi", "Fedir");
        personMap.put("Oleshko", "Oles");
        personMap.put("Yakymenko", "Yeremii");
        personMap.put("Humennyi", "Tsvitan");
        personMap.put("Matsko", "Tsaruk");
        personMap.put("Shvaika", "Orymyr");
        personMap.put("Ovdiienko", "Fedir");

        Output.printMap(personMap);

        int counter = 0;
        for (Map.Entry<String, String> firstEntry : personMap.entrySet()){
            for (Map.Entry<String, String> secondEntry : personMap.entrySet()) {
                if (firstEntry.getValue().equals(secondEntry.getValue())){
                    counter++;
                }
            }
        }

        if (counter > personMap.size())
            Output.print("There are two, or persons with the same firstName among these 10 people!");
        else
            Output.print("There are no two persons with the same firstName among these 10 people!");

        personMap.remove(personMap.entrySet().removeIf(stringStringEntry -> stringStringEntry.getValue().equals("Orest")));

        Output.printMap(personMap);
    }

}
