package com.softserve.edu04;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Employee e = new Employee();

        Employee firstEmployee = new Employee("Bill Gates", 350, 160);
        Employee secondEmployee = new Employee("Steve Jobs", 500, 160);
        Employee thirdEmployee = new Employee("Colin Farrel", 150, 160);
        Employee forthEmployee = new Employee("Petro Poroshenko", 10, 600);

        System.out.println(firstEmployee.toString());
        System.out.println(firstEmployee.getSalary());
        System.out.println("---");

        System.out.println(secondEmployee.toString());
        System.out.println(secondEmployee.getName() + " " + secondEmployee.getSalary());
        System.out.println(secondEmployee.changeRate(1000));
        System.out.println(secondEmployee.getName() + " - Salary after re-rate: " + secondEmployee.getNewSalary());
        System.out.println("---");

        System.out.println(thirdEmployee.getName() + " - Salary with bonus: " + thirdEmployee.getBonuses());
        System.out.println("---");

        System.out.println(forthEmployee.getName() + " " + forthEmployee.getSalary());
        System.out.println("---");


        employees.add(firstEmployee);
        employees.add(secondEmployee);
        employees.add(thirdEmployee);
        employees.add(forthEmployee);
        System.out.println(e.totalSum(employees));
    }
}
