package com.softserve.hw07;

public class SalariedEmployee extends Employee implements Payment{

    public SalariedEmployee(String employeeId) {
        super(employeeId);
    }

    @Override
    public int calculatePa() {
        return 0;
    }
}
