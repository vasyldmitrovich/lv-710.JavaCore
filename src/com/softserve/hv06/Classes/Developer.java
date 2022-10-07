package com.softserve.hv06.Classes;

public class Developer extends Employee {
	
	
	String position;

	public Developer() {
		// TODO Auto-generated constructor stub
	}

	public Developer (String name, int age, double salary, String position) {
		
		this.name = name;
	    this.age = age;
	    this.salary = salary;
		this.position = position;
	}
	@Override
	public String report () {
		   return String.format ("Name:	%s, Age: %d, Salary: %.2f, in position: %s", name , age, salary, position );
	   }

}
