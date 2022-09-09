package com.softserve.edu03.employee;

import java.util.concurrent.ThreadLocalRandom;

public class Task1 {
    public static void runTask1() {
        for (int i = 0; i < 3;) {
            Employee employee = new Employee("employee" + (++i),
                    ThreadLocalRandom.current().nextInt(10_000, 20_000),
                    ThreadLocalRandom.current().nextInt(100, 172));

            System.out.println(employee);
            System.out.println(employee.getSalary());
            employee.getBonuses();
            System.out.println("totalSum: " + Employee.getTotalSum());
            System.out.println("________________________________");
        }

        System.out.println("Total sum is = " + Employee.getTotalSum());
    }
}
