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
        
        Iterator<Map.Entry<String, String>> iterator = personMap.entrySet().iterator();
        ArrayList<String> name = new ArrayList<String>();
        while(iterator.hasNext()){
            name.add(iterator.next().getValue());
        }
        //System.out.println(name);

        Map<String, Integer> personMap1 = new HashMap<>();
        for (String o : name){
           
           personMap1.put(o, getCountTheSameFirstName(personMap, o));
           
        }
        System.out.println(personMap1);

    }
    public static int getCountTheSameFirstName(Map<String, String> map, String firstName){

        int count = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, String> pair1 = iterator.next();
            String value = pair1.getValue();
            if (value.equals(firstName))
            {
                count++;
            }
        }

        return count;
        
    }


}
