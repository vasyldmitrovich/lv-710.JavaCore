package com.softserve.hw07;

public class ContractEmployee extends Employee implements Payment {

    private final int quantityOfJobs;
    private final int payPerJob;

    public ContractEmployee(String employeeId, int quantityOfJobs, int payPerJob) {
        super(employeeId);
        this.quantityOfJobs = quantityOfJobs;
        this.payPerJob = payPerJob;
    }

    public int getPayPerJob() {
        return payPerJob;
    }

    public int getQuantityOfJobs() {
        return quantityOfJobs;
    }

    @Override
    public int calculatePay() {
        return getPayPerJob() * getQuantityOfJobs();
    }
}
