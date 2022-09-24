package com.softserve.hw07.task1;

import static java.lang.Double.compare;

public class SalariedEmployee extends Employee {
    private String socialSecurityNumber;
    private double fixedPaid;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String employeeID, String name, String socialSecurityNumber, double fixedPaid) {
        super(employeeID, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedPaid = fixedPaid;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public void setFixedPaid(double fixedPaid) {
        this.fixedPaid = fixedPaid;
    }

    @Override
    public double calculatePay() {
        return fixedPaid;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", fixedPaid=" + fixedPaid +
                '}';
    }
}
