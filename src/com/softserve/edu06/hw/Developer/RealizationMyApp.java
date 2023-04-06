package com.softserve.edu06.hw.Developer;

import com.softserve.edu05.practic.Employee.Employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RealizationMyApp {
    public static void createPersons() {
        InterfaceReport[] persons = new InterfaceReport[4];
        persons[0] = new Employee(showMessageAndReturnInputData("Print a name"),
                Integer.parseInt(showMessageAndReturnInputData("Print a number of department")),
                Integer.parseInt((showMessageAndReturnInputData("Print a salary"))));
        persons[1] = new Employee(showMessageAndReturnInputData("Print a name"),
                Integer.parseInt(showMessageAndReturnInputData("Print a number of department")),
                Integer.parseInt((showMessageAndReturnInputData("Print a salary"))));
        persons[2] = new Developer(showMessageAndReturnInputData("Print a name"),
                Integer.parseInt(showMessageAndReturnInputData("Print a number of department")),
                Integer.parseInt((showMessageAndReturnInputData("Print a salary"))),
                Integer.parseInt((showMessageAndReturnInputData("Print a age"))),
                showMessageAndReturnInputData("Print a position"));
        persons[3] = new Developer(showMessageAndReturnInputData("Print a name"),
                Integer.parseInt(showMessageAndReturnInputData("Print a number of department")),
                Integer.parseInt((showMessageAndReturnInputData("Print a salary"))),
                Integer.parseInt((showMessageAndReturnInputData("Print a age"))),
                showMessageAndReturnInputData("Print a position"));
        for (InterfaceReport person :
                persons) {
            person.report();
        }
    }

    public static String showMessageAndReturnInputData(String s) {
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
        createPersons();
    }
}
