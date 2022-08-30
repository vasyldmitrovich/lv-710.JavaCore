package com.softserve.edu03;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    private static BigDecimal totalSum = BigDecimal.ZERO;

    public static void demonstration() {

        List<Employee> obj = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            obj.add(i, new Employee("Employee" + i,
                    (10 * ((i + 1) * 5)), (12 * ((i + 1) * 5))));
        }

        for (int i = 0; i < obj.size(); i++) {
            System.out.println(obj.get(i));
        }

        System.out.println("\nIncrease rate for Employee0: " + obj.get(0).changeRate(200));

        for (int i = 0; i < obj.size(); i++) {
            totalSum = totalSum.add(obj.get(i).getSalary());
        }
        System.out.println("\nTotal salary: " + totalSum);
    }
}
