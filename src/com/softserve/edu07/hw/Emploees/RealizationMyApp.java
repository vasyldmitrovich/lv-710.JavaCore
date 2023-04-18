package com.softserve.edu07.hw.Emploees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.util.Arrays.sort;

public class RealizationMyApp {
    public static void createEmploees() {
        Employee[] employees = new Employee[4];
        employees[0] = new SalariedEmployee(InputData("Write name"), InputData("Write Social Security Number"),
                Integer.parseInt(InputData("Write Hourly Rate")), Integer.parseInt(InputData("Write Number Of Hours")));
        employees[1] = new SalariedEmployee(InputData("Write name"), InputData("Write Social Security Number"),
                Integer.parseInt(InputData("Write Hourly Rate")), Integer.parseInt(InputData("Write Number Of Hours")));
        employees[2] = new ContractEmployee(InputData("Write name"), InputData("Write Federal TaxId Member"),
                Integer.parseInt(InputData("Write Fixed Monthly Salary")));
        employees[3] = new ContractEmployee(InputData("Write name"), InputData("Write Federal TaxId Member"),
                Integer.parseInt(InputData("Write Fixed Monthly Salary")));

        System.out.println(Arrays.toString(employees) + "\n");
//        for (Payment employee :
//                employees) {
//            System.out.println(employee.calculatePay());
//        }
        sort(employees);
        System.out.println(Arrays.toString(employees) + "\n");
        sort(employees, new SortBySalary());
        System.out.println(Arrays.toString(employees) + "\n");
    }

    public static String InputData(String s) {
        System.out.println(s);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        try {
            result = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("You input wrong data");
        }
        return result;
    }

    public static void main(String[] args) {
        createEmploees();
    }
}