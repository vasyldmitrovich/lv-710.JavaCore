package com.softserve.hv07.Classes;

public class Employee extends edu03.Employee {
	
	protected String employeeld;

	 public String getEmployeeld() {
	       return employeeld;
	   }
	   
	   public void setEmployeeld(String employeeld) {
	       this.employeeld = employeeld;
	   }
	   public double calculatePay() {
		   int salary = 0;
		   salary = getRate() * getHours();
		   return salary;
	   }
}
