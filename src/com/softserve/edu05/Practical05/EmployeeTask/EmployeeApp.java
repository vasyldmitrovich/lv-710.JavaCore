package com.softserve.edu05.Practical05.EmployeeTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println("Please input the number of department: ");
        employee.setDepartmentNumber(employee.inputInt());
        Employee employee1 = new Employee("Serhii", employee.getDepartmentNumber(), 3587);
        Employee employee2 = new Employee("Anna", employee.getDepartmentNumber(), 2890);
        Employee employee3 = new Employee("Vasul", employee.getDepartmentNumber(), 3150);
        Employee employee4 = new Employee("Maryna", employee.getDepartmentNumber(), 4800);
        Employee employee5 = new Employee("Pavlo", employee.getDepartmentNumber(), 4950);

        List<Employee> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        list.add(employee5);
        System.out.println("========================================================================");
        Collections.sort(list, Employee.salarySort);
        for (Employee in : list) {
            System.out.println(in);
        }
        System.out.println("========================================================================");

    }
}
