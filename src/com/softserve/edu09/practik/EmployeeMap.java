package com.softserve.edu09.practik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {
    public static void main(String[] args) throws IOException {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(2469, "Petr");
        employeeMap.put(7022, "Anna");
        employeeMap.put(8023, "Ivan");
        employeeMap.put(2974, "Ira");
        employeeMap.put(7582, "Serhii");
        employeeMap.put(9562, "Stas");
        employeeMap.put(6028, "Kolya");
        System.out.println(employeeMap);
        returnName(employeeMap, returnInputInteger("Enter the employee's ID"));
        System.out.println("-------");
        returnID(employeeMap, returnInputString("Enter the employee's name"));

    }

    public static Integer returnInputInteger(String s) throws IOException {
        System.out.println(s);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer result = 0;
        try {
            result = Integer.valueOf((br.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("You input wrong data");
        }

        return result;
    }

    public static String returnInputString(String s) throws IOException {
        System.out.println(s);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        try {
            result = (br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("You input wrong data");
        }

        return result;
    }

    public static String returnName(Map<Integer, String> map, Integer integer) {
        if (!map.containsKey(integer)) {
            System.out.println("there is no such ID");
            return null;
        }
        String name = String.valueOf(map.get(integer));
        System.out.println("The name of the employee with this ID: " + name);
        return name;
    }

    public static Integer returnID(Map<Integer, String> map, String st) {
        Integer key = null;
        for (Map.Entry<Integer, String> entry :
                map.entrySet()) {
            if (entry.getValue().equals(st)) {
                key = entry.getKey();
                break;
            }
        }
        if (key != null) {
            System.out.println("The ID of the employee with this name: " + key);
            return null;
        } else {
            System.out.println("The employee with that name does not exist");
        }
        return 0;
    }
}