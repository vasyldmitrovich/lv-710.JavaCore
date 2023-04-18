package com.softserve.edu07.hw.Emploees;

public class SalariedEmployee extends Employee implements Payment {
    private String socialSecurityNumber;
    private int hourlyRate;
    private int numberOfHours;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String employeeld, String socialSecurityNumber, int hourlyRate, int numberOfHours) {
        super(employeeld);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.numberOfHours = numberOfHours;
    }

    @Override
    public int calculatePay() {
        int salary;
        return salary = getHourlyRate() * getNumberOfHours();
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SalariedEmployee that = (SalariedEmployee) o;

        if (hourlyRate != that.hourlyRate) return false;
        if (numberOfHours != that.numberOfHours) return false;
        return socialSecurityNumber.equals(that.socialSecurityNumber);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + socialSecurityNumber.hashCode();
        result = 31 * result + hourlyRate;
        result = 31 * result + numberOfHours;
        return result;
    }

    @Override
    public String toString() {
        return "\nSalariedEmployee: " + "Name = " + getEmployeeld() +
                ", Social Security Number = " + getSocialSecurityNumber() + ", Salary = " + calculatePay();
    }
}
