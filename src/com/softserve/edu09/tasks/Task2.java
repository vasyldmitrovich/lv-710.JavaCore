package com.softserve.edu09.tasks;

import com.softserve.IO.Input;
import com.softserve.IO.Output;

import java.util.HashMap;
import java.util.Map;

public class Task2 {

    public static void runTask2(){

        //In the main() method declare map employeeMap of pairs <Integer, String>.

        Map<Integer, String> employeeMap = new HashMap<>();

        //Add to employeeMap seven pairs (ID, name) of some persons. Display the map on the screen.

        employeeMap.put(10001, "Bob");
        employeeMap.put(10002, "Sam");
        employeeMap.put(10003, "John");
        employeeMap.put(10004, "Mike");
        employeeMap.put(10005, "Steve");
        employeeMap.put(10006, "George");
        employeeMap.put(10007, "Maria");

        Output.printMap1(employeeMap);

        //Ask user to enter ID, then find and write corresponding name from your map.
        // If you can't find this ID - say about it to user (use function containsKey()).

        int inputIntKey = Input.inputInt("Please, enter ID to get username",
                "You need to enter ID number, 10000 for example");
        if (employeeMap.containsKey(inputIntKey)){
            Output.print("username: " + employeeMap.get(inputIntKey));
        } else {
            Output.print("There is no user with such ID");
        }

        // Ask user to enter name, verify than you have name in your map and write corresponding ID.
        // If you can't find this name - say about it to user (use function containsValue()).

        String inputStringKey = Input.inputString("Please, enter username to get ID");
        if (employeeMap.containsValue(inputStringKey)){
            Output.print("ID: " + getUserID(employeeMap, inputStringKey));
        } else {
            Output.print("There is no user with such username");
        }

    }

    static int getUserID(Map<Integer, String> map, String userName){
        int result = 0;
        for (Map.Entry<Integer, String> template : map.entrySet()){
            if (template.getValue().equals(userName)){
                result = template.getKey();
            }
        }
        return result;
    }

}