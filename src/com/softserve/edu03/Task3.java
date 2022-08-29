package com.softserve.edu03;

public class Task3 {
    public static void main(String[] args){

        System.out.println(Employee.getTotalSum());

        Employee emp1 = new Employee(8, "Oleh", 1000.3);
        System.out.println(Employee.getTotalSum());
        Employee emp2 = new Employee(7, "Oksana", 1030.3);
        System.out.println(Employee.getTotalSum());
        Employee emp3 = new Employee(5, "Nadia", 1100.3);
        System.out.println(Employee.getTotalSum());

        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());


    }
}
