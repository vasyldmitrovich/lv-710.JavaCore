package com.softserve.hw07.task1;

import java.util.ArrayList;

public class SalariedEmployee extends Employee implements Payment {

    private final int payPerHour;
    private final int amountHours;
    private final String socialSecurityNumber;
    private String name;
    private int averagePay;
    private String employeeId;


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

    public int getRatePerHour() {
        return payPerHour;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public int calculatePay() {
        return getAmountHours() * getRatePerHour();
    }

    @Override
    public int getSalary(){
        return calculatePay();
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
}
