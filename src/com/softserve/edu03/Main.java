package com.softserve.edu03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static Employee newEmployee() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tempName;
        double tempRate;
        int tempHours;
        System.out.println("Введіть імя працівника:");
        tempName = br.readLine();
        System.out.println("Введіть ставку:");
        tempRate = Double.parseDouble(br.readLine());
        System.out.println("Введіть к-сть годин:");
        tempHours = Integer.parseInt(br.readLine());
        return new Employee(tempName, tempRate, tempHours);
    }

    static void getSalary(Employee emp) {
        System.out.println(emp);
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Salary with bonuses" + emp.getBonuses());
    }

    public static void main(String[] args) throws IOException {
        Employee emp1 = newEmployee();
        Employee emp2 = newEmployee();
        Employee emp3 = newEmployee();
        emp3.changeRate(15.0);
        getSalary(emp1);
        getSalary(emp2);
        getSalary(emp3);
        System.out.println();
        System.out.println("Total sum="+Employee.totalSum);
    }


}
