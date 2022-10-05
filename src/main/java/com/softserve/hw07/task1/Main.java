package com.softserve.hw07.task1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Employee s = new Employee();
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new SalariedEmployee("SELL_DEPP-1234221", "Jordan", 25, 175, "2341"));
        employees.add(new SalariedEmployee("SELL_DEPP-2324244", "Mick", 25, 175, "1245"));
        employees.add(new ContractEmployee("QA_DEPP", 15000, 43523));
        employees.add(new ContractEmployee("DEV_DEPP", 15000, 23145));

//            s.sortBySalary(employees);


    }
}
