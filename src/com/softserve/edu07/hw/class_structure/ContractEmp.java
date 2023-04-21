package com.softserve.edu07.hw.class_structure;

import java.util.Objects;

public class ContractEmp extends Employee {
    private String federalTaxIdMember;
    private int fixedMonthlySalary;

    public ContractEmp(int id, int salary, String federalTaxIdMember, int fixedMonthlySalary) {
        super(id, salary);
        this.federalTaxIdMember = federalTaxIdMember;
        this.fixedMonthlySalary = fixedMonthlySalary;
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
        ContractEmp that = (ContractEmp) o;
        return fixedMonthlySalary == that.fixedMonthlySalary && Objects.equals(federalTaxIdMember, that.federalTaxIdMember);
    }

    @Override
    public int hashCode() {
        return Objects.hash(federalTaxIdMember, fixedMonthlySalary);
    }

    @Override
    public String toString() {
        return "ContractEmp{" + " id=" + getId() + " ,salary=" + getSalary() +
                " federalTaxIdMember='" + federalTaxIdMember + '\'' +
                ", fixedMonthlySalary=" + fixedMonthlySalary +
                '}';
    }

    @Override
    public int calculatePay() {
        return getFixedMonthlySalary();
    }
}
