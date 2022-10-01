package com.softserve.hw07;

public class SalariedEmployee extends Employee implements Payment {

    private final int payPerHour;
    private String employeeId;
    private final int amountHours;
    private final String socialSecurityNumber;

    public SalariedEmployee(String employeeId, int payPerHour, int amountHours, String socialSecurityNumber) {
        super(employeeId);
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
}
