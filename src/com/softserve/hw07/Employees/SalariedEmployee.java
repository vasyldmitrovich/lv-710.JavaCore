package com.softserve.hw07.Employees;

public class SalariedEmployee extends Employee implements Payment{
    private final String socialSecurityNumber;
    private final double fixedMonthlyPayment;

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, double fixedMonthlyPayment) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + super.toString() +
                "socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", fixedMonthlyPayment=" + fixedMonthlyPayment +
                "} ";
    }
}
