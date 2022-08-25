package com.softserve.edu3;

import com.softserve.edu3.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Oleksandr", 30);
        Employee employee2 = new Employee("Victor", 50, 10);
        Employee employee3 = new Employee("Milana", 64, 8);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        Employee.getTotalSalary();

        employee2.changeRate(100);
        System.out.println("Bonus of employee 2 is " + employee2.getBonus());

    }
}
