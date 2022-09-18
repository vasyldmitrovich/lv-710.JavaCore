package com.softserve.hw07.tasks.classes.firstTaskClasses;

public class SalariedEmployee extends Employee{

    private String socialSecurityNumber;
    private double rate;
    private int workedHours;
    private String position;

    public SalariedEmployee(){

    }

    public SalariedEmployee(String socialSecurityNumber, String position, double rate, int workedHours){
        this.socialSecurityNumber = socialSecurityNumber;
        this.rate = rate;
        this.workedHours = workedHours;
        this.position = position;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public double calculatePay() {
        return rate * workedHours;
    }

    @Override
    public String toString() {
        return String.format("Social Security Number: %s, Position: %s, Monthly income: " + calculatePay() ,
                this.socialSecurityNumber, this.position);
    }
}
