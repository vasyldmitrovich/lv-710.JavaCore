package com.softserve.hw07.task1;

public class ContractEmployee extends Employee  implements Payment{
    
    private final int federalTaxIdmember;
    private final double hourlyRate ;
    private final double numberOfHoursWorked;
 
    
    public int getFederalTaxIdmember(){return federalTaxIdmember;}
    public double getHourlyRate(){ return hourlyRate; }
    public double getNumberOfHoursWorked(){ return numberOfHoursWorked; }
    
    public ContractEmployee(String employeeId, String name, int federalTaxIdmember, double hourlyRate, double numberOfHoursWorked){
        super(employeeId, name);
        this.federalTaxIdmember = federalTaxIdmember;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    @Override
    public double calculatePay() {
        double averageMonthlySalary = hourlyRate * numberOfHoursWorked;
        return averageMonthlySalary;
    }

    
    
}
