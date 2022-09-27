package com.softserve.edu05Logic;

public class Employee {

	 private String name;
	 private int departmentNumber;
	 private double salary;
	 
	 Employee () {
	   }
	 
	 Employee (String name, int departmentNumber, double salary) {
		   this.name = name;
	       this.departmentNumber = departmentNumber;
	       this.salary = salary;
	   }
	 
	 public String getName() {
	       return name;
	   }

	   public int getDepartmentNumber() {
	       return departmentNumber;
	   }
	   
	   public double getSalary() {
	       return salary;
	   }
	   
	   public void setName(String name) {
	       this.name = name;
	   }
	   
	   public void setDepartmentNumber(int departmentNumber) {
	       this.departmentNumber = departmentNumber;
	   }
	   
	   public void setSalary(double salary) {
	       this.salary = salary;
	   }	 
	   
	   @Override
	    public String toString() {
	        return this.name + " (Department " + this.departmentNumber +") " + this.salary;
	    }
}
