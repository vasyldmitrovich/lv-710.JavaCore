package com.softserve.edu05;

import java.util.ArrayList;
import java.util.List;

public class TaskRunner {
    public static void main(String[] args) {
        task1();
        task2();

    }

    public static void task1() {
        Integer[] numbers = new Integer[] {-3, -89, 78, 678, -9876, 95,234756, -245, 876, -34657};
        System.out.println("The bigest of these numbers is   " + IntegerUtil.findMaxNumber(numbers));
        System.out.println("Sum of positive numbers is  " + IntegerUtil.sumOfPositiveNumbers(numbers));
        System.out.println("Sum of positive negative is  " + IntegerUtil.sumOfNegativeNumbers(numbers));
    }
    public static void task2() {

        Employee employee1 = new Employee("Oleh", 5, 7000);
        Employee employee2 = new Employee("Sasha", 9, 5000);
        Employee employee3 = new Employee("Vira", 1, 6000);
        Employee employee4 = new Employee("Nadia", 9, 5500);
        Employee employee5 = new Employee("Roman", 3, 10000);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        List<Employee> result = EmployeeUtil.findEmployeesByDepartment(employees, 9);

        System.out.println(result);


    }
}
