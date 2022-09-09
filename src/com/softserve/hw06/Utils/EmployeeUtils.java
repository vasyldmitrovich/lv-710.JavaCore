package com.softserve.hw06.Utils;

import com.softserve.hw06.Empoyees.Developer;
import com.softserve.hw06.Empoyees.Employee;

import java.util.ArrayList;

public class EmployeeUtils {
    public static void run() {
        ArrayList<Employee> emps = new ArrayList<>();
        emps.add(new Developer("Taras", 32, "Average Java developer", 32735.35));
        emps.add(new Employee("Ivan", 36, 1500.50));
        emps.add(new Developer("Petro", 22, "Junior PHP developer", 23567.35));
        emps.add(new Developer("Bogdan", 36, "Senior Java developer", 50735.00));
        emps.add(new Employee("Dima", 340, 2300.50));
        for (Employee emp : emps) System.out.println(emp.report());
    }
}
