package com.softserve.edu07.hw.Emploees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.util.Arrays.sort;

public class RealizationMyApp {
    public static void createEmploees() {
        Payment[] employees = new Payment[4];
        employees[0] = new SalariedEmployee(InputData("Write name"),InputData("Write Social Security Number"),
                Integer.parseInt(InputData("Write Hourly Rate")),Integer.parseInt(InputData("Write Number Of Hours")));
        employees[1] = new SalariedEmployee(InputData("Write name"),InputData("Write Social Security Number"),
                Integer.parseInt(InputData("Write Hourly Rate")),Integer.parseInt(InputData("Write Number Of Hours")));
        employees[2] = new ContractEmployee(InputData("Write name"),InputData("Write Federal TaxId Member"),
                Integer.parseInt(InputData("Write Fixed Monthly Salary")));
        employees[3] = new ContractEmployee(InputData("Write name"),InputData("Write Federal TaxId Member"),
                Integer.parseInt(InputData("Write Fixed Monthly Salary")));

        System.out.println();
        for (Payment employee:
                employees) {
            System.out.println(employee.toString());
            System.out.println(employee.calculatePay());

//            System.out.println(Arrays.sort(employees));
            sort(employees);
            System.out.println(employee.toString());
//            Comparator<? super Payment> Comparable = null;
//            sort(employees,new BySalaryComparator());

//            if (person instanceof Staff) {
//                System.out.println(((Staff) person).salary());
//            }
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
