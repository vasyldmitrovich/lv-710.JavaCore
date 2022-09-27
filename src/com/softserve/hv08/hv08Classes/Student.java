package com.softserve.hv08Classes;

import com.softserve.hv08Classes.Person;

public class Student extends Person {
	
	
	int course;
	
		public Student() {
	
	}

	public Student(String firstName, String lastName, int age, int course ) {
		
		this();
		fullName.setFirstName(firstName);
		fullName.setLastName(lastName);
		this.age = age;
		this.course = course;
		
		// TODO Auto-generated constructor stub
/*	fullName.setFirstName(firstName);
		fullName.setLastName(lastName);
		this.age = age;*/
	}
	
	@Override
	public String toString() {

		return "FullName [firstName=" + fullName.getFirstName()  + ", lastName=" + fullName.getLastName() + "]: " + age +" " + course ;
	}
	
		@Override
		public String info() {
			
			return toString();
		}
		public String activity (){
			
			return ("I study at university");
			
		}
		
	

}
