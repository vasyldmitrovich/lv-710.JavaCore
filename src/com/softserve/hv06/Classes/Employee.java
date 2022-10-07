package com.softserve.hv06.Classes;

public class Employee {

		 protected String name;
		 protected int age;
		 protected double salary;
		 
		 Employee () {
		   }
		 
		 public Employee (String name, int age, double salary) {
			   this.name = name;
		       this.age = age;
		       this.salary = salary;
		   }
		 
		 public String getName() {
		       return name;
		   }

		   public int getAge() {
		       return age;
		   }
		   
		   public double getSalary() {
		       return salary;
		   }
		   
		   public void setName(String name) {
		       this.name = name;
		   }
		   
		   public void setAge(int age) {
		       this.age = age;
		   }
		   
		   public void setSalary(double salary) {
		       this.salary = salary;
		   }	 
		   
		   @Override
		    public String toString() {
		        return this.name + " " + this.age +"Years old have " + this.salary + " Per month";
		    }
		   
		   public String report () {
			   return String.format ("Name:	%s, Age: %d, Salary: %.2f", name, age, salary);
		   }

}
