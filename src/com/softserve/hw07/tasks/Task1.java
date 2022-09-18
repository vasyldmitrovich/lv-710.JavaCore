package com.softserve.hw07.tasks;

import com.softserve.IO.Output;
import com.softserve.hw07.tasks.classes.firstTaskClasses.ContractEmployee;
import com.softserve.hw07.tasks.classes.firstTaskClasses.Employee;
import com.softserve.hw07.tasks.classes.firstTaskClasses.SalariedEmployee;

public class Task1 {

    public static void runFirstTask(){

        SalariedEmployee developer = new SalariedEmployee("SSN000001", "Full Stack Developer",
                12.5d, 176);
        SalariedEmployee projectManager = new SalariedEmployee("SSN000002", "Project Manager",
                10.0d, 176);
        ContractEmployee cleaner = new ContractEmployee("FTN000001", "Cleaner", 500d);
        ContractEmployee builder = new ContractEmployee("FTN000002", "Builder", 800d);

        Employee[] employees = new Employee[] {
                developer,
                projectManager,
                cleaner,
                builder
        };

        displayEmployeesInfo(sortEmployees(employees));

    }

    static Employee[] sortEmployees(Employee[] employees){
        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;
            for (int i = 1; i < employees.length; i++){
                if (employees[i].calculatePay() > employees[i - 1].calculatePay()){
                Employee template = employees[i];
                employees[i] = employees[i - 1];
                employees[i - 1] = template;
                isSorted = false;
                }
            }
        }
        return employees;
    }

    static void displayEmployeesInfo(Employee[] employees){
        for (Employee template : employees){
            Output.print(template.toString());
        }
    }
}
