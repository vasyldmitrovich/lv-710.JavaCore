package com.softserve.edu4.employee;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    //TODO rename package from udu4 to adu03
    public static void main(String[] args) {
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

        //TODO Your totalSum do not represent correct data, the value in this variable is zero
        System.out.println("Total sum is = " + Employee.getTotalSum());


        //TODO this is cool that yor know how use Lombok, but please use that in your own projects. Pleas in that task write constructor without params
    }
}
