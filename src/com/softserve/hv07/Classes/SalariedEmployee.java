package com.softserve.hv07.Classes;

public class SalariedEmployee extends Employee implements Payment {
	
	private String socialSecurityNumber;
	
	public SalariedEmployee (String name, String employeeld, int rate, int hours) {
		this.name = name;
	    this.employeeld = employeeld;
	    this.rate = rate;
	    this.hours = hours;
	}
	    
	
	public String getSocialSecurityNumber() {
	       return socialSecurityNumber;
	   }
	   
	   public void setSocialSecurityNumber(String socialSecurityNumber) {
	       this.socialSecurityNumber = socialSecurityNumber;
	   }
	   
	   public double calculatePay() {
		   double salary = 0;
		   salary = getRate() * getHours();
		   return salary;
	   }
	


		   
		   
	   

}
