package com.softserve.edu05.practic.Employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
// READY!!
public class EmployeeBisLogic {

    public static void checkEmployee() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        try {
            t = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Employee employee1 = new Employee("Bob", 12, 12000);
        Employee employee2 = new Employee("Jack", 11, 12500);
        Employee employee3 = new Employee("Stevie", 12, 11800);
        Employee employee4 = new Employee("Angela", 10, 12400);
        Employee employee5 = new Employee("Karol", 12, 12800);

        Employee[] empl = {
                employee1,
                employee2,
                employee3,
                employee4,
                employee5
        };
        ArrayList<Employee> empl1 = new ArrayList<>();
        for (int i = 0; i < empl.length; i++) {

            if (empl[i].getDepartmentNumber() == t) {
                empl1.add(empl[i]);
            }
        }
        System.out.println(empl1);

        for (int i = 0; i < empl.length; i++) {
            int pos = i;
            int max = empl[i].getSalary();
            Employee obMax = empl[i];
            for (int j = i + 1; j < empl.length; j++) {
                if (empl[j].getSalary() > max) {
                    max = empl[j].getSalary();
                    pos = j;
                    obMax = empl[j];
                }
            }
            empl[pos] = empl[i];
            empl[i] = obMax;
        }
        for (Employee em :
                empl) {
            System.out.println(em);

        }
    }

    public static void main(String[] args) {
        checkEmployee();
    }
}
