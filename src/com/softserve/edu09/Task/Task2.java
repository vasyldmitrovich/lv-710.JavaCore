package com.softserve.edu09.Task;

import com.softserve.edu04.IO.In;
import com.softserve.edu04.IO.Input;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void run(){
        HashMap<Integer,String> employeeMap = new HashMap<>();
        employeeMap.put(1,"Bogdan");
        employeeMap.put(2,"Petro");
        employeeMap.put(3,"Vasyl");
        employeeMap.put(4,"Bogdan");
        employeeMap.put(5,"Oksana");
        employeeMap.put(6,"Natalia");
        employeeMap.put(7,"Nina");
        System.out.println(employeeMap);

        In myIn = new Input();
        int id = myIn.readInt("Enter ID: ");
        System.out.println((employeeMap.containsKey(id))?"name = "+employeeMap.get(id):"There are nobody");
        myIn.readString();
        String name = myIn.readString("Enter name: ");
        if (employeeMap.containsValue(name)){
            for (Map.Entry employee:employeeMap.entrySet()) {
                if (employee.getValue().equals(name)) System.out.println("id = "+employee.getKey());
            }
        }
        else System.out.println("There are nobody");
    }
}
