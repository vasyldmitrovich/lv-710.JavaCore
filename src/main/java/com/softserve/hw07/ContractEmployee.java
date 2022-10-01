package com.softserve.hw07;

public class ContractEmployee extends Employee implements Payment{

    public ContractEmployee(String employeeId) {
        super(employeeId);
    }

    @Override
    public int calculatePa() {
        return 0;
    }
}
