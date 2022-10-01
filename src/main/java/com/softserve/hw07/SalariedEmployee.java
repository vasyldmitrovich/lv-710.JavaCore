package com.softserve.hw07;

public class SalariedEmployee extends Employee implements Payment {

    private final int payPerHour;
    private String employeeId;
    private final int amountHours;

    public SalariedEmployee(String employeeId, int payPerHour, int amountHours) {
        super(employeeId);
        this.payPerHour = payPerHour;
        this.amountHours = amountHours;
    }

    public int getAmountHours() {
        return amountHours;
    }

    public int getPayPerHour() {
        return payPerHour;
    }

    @Override
    public int calculatePay() {
        return getAmountHours() * getPayPerHour();
    }
}
