package com.softserve.edu03;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Employee emp1 = new Employee();
        emp1.addToTotalSum();
        Employee emp2 = new Employee("Bogdan", 100.5);
        emp2.addToTotalSum();
        Employee emp3 = new Employee("Igor",95.8,5);
        emp3.addToTotalSum();

        System.out.println(emp1);
        System.out.println("Salary: " + emp1.getSalary());
        System.out.println("Salary with bonuses"+emp1.getBonuses());
        System.out.println(emp2);
        System.out.println("Salary: " + emp2.getSalary());
        System.out.println("Salary with bonuses: "+emp2.getBonuses());
        System.out.println(emp3);
        System.out.println("Salary: " + emp3.getSalary());
        System.out.println("Salary with bonuses"+emp3.getBonuses());
        System.out.println();
        System.out.println("Total sum: "+Employee.totalSum);


    }
}
