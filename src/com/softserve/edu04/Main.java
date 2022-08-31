package com.softserve.edu04;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //TODO Do not correct work totalSum after change newRate and after addBonus

        /*Employee: Bill Gates
        Rate: 100
        Hours: 10

        1000
                ---
                Employee: Steve Jobs
        Rate: 100
        Hours: 10

        Steve Jobs 1000
        1500
        Steve Jobs - Salary after re-rate: 1500
                ---
                Colin Farrel - Salary with bonus: 1100.0
                ---
                Petro Poroshenko 1000
                ---
                4000.0

                *****DO NOT CORRECT******/

        ArrayList<Employee> employees = new ArrayList<>();
        Employee e = new Employee();

        Employee firstEmployee = new Employee("Bill Gates", 100, 10);
        Employee secondEmployee = new Employee("Steve Jobs", 100, 10);
        Employee thirdEmployee = new Employee("Colin Farrel", 100, 10);
        Employee forthEmployee = new Employee("Petro Poroshenko", 100, 10);

        System.out.println(firstEmployee.toString());
        System.out.println(firstEmployee.getSalary());
        System.out.println("---");

        System.out.println(secondEmployee.toString());
        System.out.println(secondEmployee.getName() + " " + secondEmployee.getSalary());
        System.out.println(secondEmployee.changeRate(150));
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
