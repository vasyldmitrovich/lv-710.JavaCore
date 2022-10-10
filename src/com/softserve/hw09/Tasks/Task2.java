package com.softserve.hw09.Tasks;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void run(){
        Map<String,String> personMap = new HashMap<>();
        personMap.put("Pupkin","Vasia");
        personMap.put("Vupkin","Ivan");
        personMap.put("Gupkin","Petro");
        personMap.put("Dupkin","Kolia");
        personMap.put("Zupkin","Orest");
        personMap.put("Supkin","Oksana");
        personMap.put("Fupkin","Irina");
        personMap.put("Tupkin","Olga");
        personMap.put("Nupkin","Pavlo");
        personMap.put("Lupkin","Zina");
        System.out.println(personMap);
        personMap.entrySet().removeIf(stringStringEntry -> stringStringEntry.getValue().equals("Orest"));
        System.out.println(personMap);
    }
}
