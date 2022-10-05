package com.softserve.hw07.task1;

public class ContractEmployee extends Employee implements Payment {

    private final int fixedMonthlyPayment;
    private final int federalTaxIdNumber;

    public ContractEmployee(String employeeId, int fixedMonthlyPayment, int federalTaxIdNumber) {
        super(employeeId);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        this.federalTaxIdNumber = federalTaxIdNumber;
    }

    public int getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    @Override
    public int calculatePay() {
        return getFixedMonthlyPayment();
    }
}
