package com.softserve.edu04;

import java.util.ArrayList;

public class Main {

    //TODO rename folder edu04 to edu03

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        Employee e = new Employee();

        Employee firstEmployee = new Employee("Bill Gates", 10, 10);
        Employee secondEmployee = new Employee("Steve Jobs", 100, 10);
        Employee thirdEmployee = new Employee("Colin Farrel", 200, 10);

        System.out.println("---");

        System.out.println(firstEmployee.getName() + " " + firstEmployee.getSalary());
        firstEmployee.setRate(20);
        System.out.println(firstEmployee.getName() + " " + firstEmployee.getSalary());
        System.out.println("---");

        System.out.println(secondEmployee.getName() + " " + secondEmployee.getSalary());
        secondEmployee.setRate(200);
        System.out.println(secondEmployee.getName() + " " + secondEmployee.getSalary());
        System.out.println("---");

        System.out.println(thirdEmployee.getName() + " " + thirdEmployee.getSalary());
        thirdEmployee.setRate(300);
        System.out.println(thirdEmployee.getName() + " " + thirdEmployee.getSalary());
        System.out.println("---");


        employees.add(firstEmployee);
        employees.add(secondEmployee);
        employees.add(thirdEmployee);
        System.out.println(e.totalSum(employees));
    }
}
