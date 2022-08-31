package com.softserve.edu03;

import java.util.ArrayList;
import java.util.List;


public class Demo {
    public static void demonstration() {
        Employee emplObj = new Employee();
        List<Employee> emplList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            emplList.add(i, new Employee("Employee" + (i + 1),
                    (10 * ((i + 1) * 5)), (12 * ((i + 1) * 5))));
        }

        for (int i = 0; i < emplList.size(); i++) {
            System.out.println(emplList.get(i));
        }
        System.out.println("Total salary for 3 workers: "
                + emplObj.getTotalSum());

        // change rate for employee1
        System.out.println("\nChange rate for Employee1: " +
                emplList.get(0).changeRate(300) + "\n");
        // show whole statistic after changing rate
        for (int i = 0; i < emplList.size(); i++) {
            System.out.println(emplList.get(i));
        }
        System.out.println("Total salary for 3 workers: "
                + emplObj.getTotalSum());

    }
}
