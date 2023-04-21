package com.softserve.edu07.hw.Emploees;

public class ContractEmployee extends Employee implements Payment {
    private String federalTaxIdMember;
    private int fixedMonthlySalary;

    public ContractEmployee() {
    }

    public ContractEmployee(String employeeld, String federalTaxIdMember, int fixedMonthlySalary) {
        super(employeeld);
        this.federalTaxIdMember = federalTaxIdMember;
        this.fixedMonthlySalary = fixedMonthlySalary;
    }

    @Override
    public int calculatePay() {
        return getFixedMonthlySalary();
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public int getFixedMonthlySalary() {
        return fixedMonthlySalary;
    }

    public void setFixedMonthlySalary(int fixedMonthlySalary) {
        this.fixedMonthlySalary = fixedMonthlySalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ContractEmployee that = (ContractEmployee) o;

        if (fixedMonthlySalary != that.fixedMonthlySalary) return false;
        return federalTaxIdMember.equals(that.federalTaxIdMember);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + federalTaxIdMember.hashCode();
        result = 31 * result + fixedMonthlySalary;
        return result;
    }

    @Override
    public String toString() {
        return "\nContractEmployee: " + "Name = " + getEmployeeld() +
                ", Federal TaxId Member = " + getFederalTaxIdMember() + ", Salary = " + calculatePay();
    }
}
