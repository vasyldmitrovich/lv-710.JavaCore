package com.softserve.hw07.task1;

public class ContractEmployee extends Employee implements Payment {

    private final int fixedMonthlyPayment;
    private final int federalTaxIdNumber;
    private final String name;

    public ContractEmployee(String employeeId, String name, int fixedMonthlyPayment, int federalTaxIdNumber) {
        super(employeeId);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        this.federalTaxIdNumber = federalTaxIdNumber;
        this.name = name;
    }

    public int getSalary() {
        return fixedMonthlyPayment;
    }

    @Override
    public int calculatePay() {
        return getSalary();
    }
}
