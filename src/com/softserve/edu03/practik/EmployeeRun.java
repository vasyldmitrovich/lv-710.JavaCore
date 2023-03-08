package com.softserve.edu03.practik;

import com.softserve.edu03.hw.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.softserve.edu03.practik.Employee.totalSum;

public class EmployeeRun {
    public static void runApp() throws IOException {
        createPersonsAndRuturnInfo();
        System.out.println("Total salary of all employees" + totalSum);
    }

    public static Employee input() throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter name, rate and how many hours person worked, using the \"ENTER\" key");
        return (new Employee(br.readLine(), Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine())));
    }

    public static void createPersonsAndRuturnInfo() throws IOException {
        Employee[] employees = new Employee[]{input(), input(), input()};
        for (Employee eachEmployee :
                employees) {
            System.out.println(eachEmployee.toString());
        }
    }

    public static void main(String[] args) throws IOException {
        runApp();
    }
}
