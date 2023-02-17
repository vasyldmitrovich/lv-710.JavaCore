package com.softserve.edu03.practik;

import java.io.IOException;

import static com.softserve.edu03.practik.Employee.totalSum;

public class EmployeeTest {

    public static void main(String[] args) throws IOException {
        Employee em1 = new Employee("Kollin", 35, 14);
        Employee em2 = new Employee("Boby", 30, 15);
        Employee em3 = new Employee("Nick", 40, 12);

        System.out.println(em1.toString());
        System.out.println(em2.toString());
        System.out.println(em3.toString());

        System.out.println("Total salary of all employees: " + (em1.getSalary() + em2.getSalary() + em3.getSalary()));
        System.out.println(totalSum);

        em1.changeRate(45);
        System.out.println("Total salary of all employees: " + (em1.getSalary() + em2.getSalary() + em3.getSalary()));
        System.out.println(totalSum);

    }
}
