package com.softserve.hw07.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Employee {

    private String employeeId;

    public Employee(){}

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

//    public ArrayList<> sortBySalary(ArrayList<SalariedEmployee> employees){
//        Collections.sort(employees, new Comparator<SalariedEmployee>() {
//            @Override
//            public int compare(SalariedEmployee o1, SalariedEmployee o2) {
//                return o1.calculatePay() - o2.calculatePay();
//            }
//        });
//        for (SalariedEmployee employee: employees){
//            System.out.println(employee);
//        }
//        return employees;
//    }
}
