package com.softserve.hw07.Employees;

import java.util.ArrayList;
import java.util.Comparator;

public class Utils {
    public static void run(){
        var empArr = new ArrayList<Employee>();
        empArr.add(new SalariedEmployee("1","Ivan","1001",2300.50));
        empArr.add(new ContractEmployee("2","Petro","1002",150.2,12));
        empArr.add(new SalariedEmployee("3","Oksana","1003",1800.30));
        empArr.add(new ContractEmployee("4","Irina","1004",100.5,16));
        empArr.add(new SalariedEmployee("5","Olena","1005",2900.40));
        empArr.add(new ContractEmployee("6","Igor","1006",160.3,18));
        empArr.add(new SalariedEmployee("7","Ivan","1007",3300));
        empArr.add(new ContractEmployee("8","Dmitro","1008",180.1,22));
        empArr.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (((Payment)o2).calculatePay()-((Payment)o1).calculatePay());
            }
        });
        for (Employee emp:empArr) {
            System.out.println("EmployeeId: "+emp.getEmployeeId()+
                    ", name: "+emp.getName()+
                    ", average salary: "+((Payment)emp).calculatePay());
        }
    }
}
