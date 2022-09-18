package com.softserve.hw07.tasks.classes.firstTaskClasses;

public class ContractEmployee extends Employee implements Payment{

    private String federalTaxIdMember ;
    private double salary;
    private String position;

    public ContractEmployee(){

    }

    public ContractEmployee(String federalTaxIdMember, String position, double salary){
        this.federalTaxIdMember = federalTaxIdMember;
        this.salary = salary;
        this.position = position;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public double calculatePay() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("federal Tax ID: %s, Position: %s, Monthly income: " + calculatePay(),
                this.federalTaxIdMember, this.position);
    }

}
