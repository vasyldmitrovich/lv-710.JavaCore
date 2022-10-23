package com.softserve.hw07.task1;

public class SalariedEmployee extends Employee  implements Payment{
    
    private final int socialSecurityNumber;
    private final double fixedMonthlyPayment;
    
    public int getSocialSecurityNumber(){ return socialSecurityNumber; }
    public double getFixedMonthlyPayment(){ return fixedMonthlyPayment; }
    
    public SalariedEmployee(String employeeId, String name, int socialSecurityNumber, double fixedMonthlyPayment){
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
        double averageMonthlySalary=fixedMonthlyPayment;
        return averageMonthlySalary;
    }

    
    
}
