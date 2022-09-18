package com.softserve.hw07.Employees;

public class ContractEmployee extends Employee implements Payment{
    private final String federalTaxIdMember;
    private final double hourlyRate;
    private final int hours;

    public ContractEmployee(String employeeId, String name, String federalTaxIdMember, double hourlyRate, int hours) {
        super(employeeId, name);
        this.federalTaxIdMember = federalTaxIdMember;
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    @Override
    public double calculatePay() {
        return hourlyRate*hours;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" + super.toString() +
                "federalTaxIdMember='" + federalTaxIdMember + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", hours=" + hours +
                "} ";
    }
}
