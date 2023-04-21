package com.softserve.edu07.hw.Emploees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.util.Arrays.sort;

public class RealizationMyAppArrays {
    public static void createEmploees() {
        Employee[] employees = new Employee[4];
//        employees[0] = new SalariedEmployee(InputData("Write name"), InputData("Write Social Security Number"),
//                Integer.parseInt(InputData("Write Hourly Rate")), Integer.parseInt(InputData("Write Number Of Hours")));
//        employees[1] = new SalariedEmployee(InputData("Write name"), InputData("Write Social Security Number"),
//                Integer.parseInt(InputData("Write Hourly Rate")), Integer.parseInt(InputData("Write Number Of Hours")));
//        employees[2] = new ContractEmployee(InputData("Write name"), InputData("Write Federal TaxId Member"),
//                Integer.parseInt(InputData("Write Fixed Monthly Salary")));
//        employees[3] = new ContractEmployee(InputData("Write name"), InputData("Write Federal TaxId Member"),
//                Integer.parseInt(InputData("Write Fixed Monthly Salary")));
        employees[0] = new SalariedEmployee("Dave", "213145650", 310, 70);
        employees[1] = new SalariedEmployee("Jack", "456789098", 350, 70);
        employees[2] = new ContractEmployee("Bob", "8976543523", 20500);
        employees[3] = new ContractEmployee("Sam", "9876545352", 22500);

        System.out.println(Arrays.toString(employees) + "\n");
        sort(employees);
        for (Payment employee :
                employees) {
            System.out.println();
            System.out.println(employee);
        }
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
