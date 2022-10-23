package com.softserve.hw09collections.task2;

import java.util.Map;

public class FirstLastName {

    public Map<String, String> deleteSpecificPerson(Map<String, String> personsMap, String firstName){
        personsMap.entrySet().removeIf(name -> name.getValue().equals(firstName));
        personsMap.entrySet().forEach(System.out::println);
        return personsMap;
    }
}
