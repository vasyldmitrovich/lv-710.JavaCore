package com.softserve.hw07.task1;

import static java.lang.Double.compare;

public class ContractEmployee extends Employee {
    private int federalTaxIdMember;
    private double hourlyPaid;
    private int hours;

    public ContractEmployee() {
    }

    public ContractEmployee(String employeeID, String name, int federalTaxIdMember, double hourlyPaid, int hours) {
        super(employeeID, name);
        this.federalTaxIdMember = federalTaxIdMember;
        this.hourlyPaid = hourlyPaid;
        this.hours = hours;
    }

    public int getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(int federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public double getHourlyPaid() {
        return hourlyPaid;
    }

    public void setHourlyPaid(double hourlyPaid) {
        this.hourlyPaid = hourlyPaid;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public double calculatePay() {
        return hourlyPaid * hours;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "federalTaxIdMember=" + federalTaxIdMember +
                ", hourlyPaid=" + hourlyPaid +
                ", hours=" + hours +
                '}';
    }
}
