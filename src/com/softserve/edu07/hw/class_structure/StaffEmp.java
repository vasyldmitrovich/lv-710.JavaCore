package com.softserve.edu07.hw.class_structure;

import java.util.Objects;

public class StaffEmp extends Employee {
    private String socialSecurityNumber;
    private int hourlyRate;
    private int numberOfHours;

    public StaffEmp(int id, int salary, String socialSecurityNumber, int hourlyRate, int numberOfHours) {
        super(id, salary);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.numberOfHours = numberOfHours;
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
        StaffEmp staffEmp = (StaffEmp) o;
        return hourlyRate == staffEmp.hourlyRate && numberOfHours == staffEmp.numberOfHours && Objects.equals(socialSecurityNumber, staffEmp.socialSecurityNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(socialSecurityNumber, hourlyRate, numberOfHours);
    }

    @Override
    public String toString() {
        return "StaffEmp{" + " id=" + getId() + " ,salary=" + getSalary() +
                " socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", numberOfHours=" + numberOfHours +
                '}';
    }

    @Override
    public int calculatePay() {
        return getHourlyRate() * getNumberOfHours();
    }
}
