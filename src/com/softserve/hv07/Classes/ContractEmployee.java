package com.softserve.hv07.Classes;

public class ContractEmployee extends Employee implements Payment {
	
	int federalTaxIdmember;
	double fixedMonthlyPayment;
	
	public ContractEmployee (String name, String employeeld, double fixedMonthlyPayment) {
		this.name = name;
	    this.employeeld = employeeld;
	    this.fixedMonthlyPayment = fixedMonthlyPayment;
	}
	
	public int getFederalTaxIdmember() {
	       return federalTaxIdmember;
	   }
	   
	   public void setFederalTaxIdmember (int federalTaxIdmember) {
	       this.federalTaxIdmember = federalTaxIdmember;
	   }
	   
	   public double getFixedMonthlyPayment() {
	       return fixedMonthlyPayment;
	   }
	   
	   public void setFixedMonthlyPayment (double fixedMonthlyPayment) {
	       this.fixedMonthlyPayment = fixedMonthlyPayment;
	   }
	       
	public double calculatePay() {
		double salary = 0;
		   salary = getFixedMonthlyPayment();
		   return salary;
	   }

}
