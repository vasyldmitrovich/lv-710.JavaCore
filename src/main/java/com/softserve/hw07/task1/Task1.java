package com.softserve.hw07.task1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public void runApp() {
        List<Employee> employees = new ArrayList<>() {{
            add(new SalariedEmployee("SELL_DEPP-1234221", "Jordan", 50, 10, "2341"));
            add(new SalariedEmployee("SELL_DEPP-2324244", "Mick", 30, 10, "1245"));
            add(new ContractEmployee("QA_DEPP", "Marry", 15000, 43523));
            add(new ContractEmployee("DEV_DEPP", "Liza", 12000, 23145));
        }};

        employees.stream().sorted((e1, e2) -> ((Integer) e1.getSalary()).compareTo(e2.getSalary()))
                .forEach(person -> System.out.println(person.getEmployeeId() + "Salary: " + person.getSalary()));
    }
}
