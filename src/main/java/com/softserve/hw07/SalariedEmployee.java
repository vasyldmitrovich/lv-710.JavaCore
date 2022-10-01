package com.softserve.hw07;

import com.softserve.hw05.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SalariedEmployee extends Employee implements Payment {

    private final int payPerHour;
    private String employeeId;
    private final int amountHours;
    private final String socialSecurityNumber;
    private String name;
    private int averagePay;

    public SalariedEmployee(String employeeId, String name, int payPerHour, int amountHours, String socialSecurityNumber) {
        super(employeeId);
        this.name = name;
        this.payPerHour = payPerHour;
        this.amountHours = amountHours;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getAmountHours() {
        return amountHours;
    }

    public int getPayPerHour() {
        return payPerHour;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public int calculatePay() {
        return getAmountHours() * getPayPerHour();
    }

    @Override
    public String toString() {
        return String.format("EmployeeId: %s, Name: %s, Salary: %s, Average payment: %s", employeeId, name, calculatePay(), getAveragePay());
    }

    public int averagePayment(ArrayList<SalariedEmployee> employees) {
        int sum = 0;
        int quantityOfEmployees = employees.size();
        for (SalariedEmployee employee : employees) {
            sum = sum + employee.calculatePay();
        }
        return averagePay = sum / quantityOfEmployees;
    }

    public int getAveragePay() {
        return averagePay;
    }

//    @Override
//    public ArrayList<SalariedEmployee> sortBySalary(ArrayList<SalariedEmployee> employees){
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
