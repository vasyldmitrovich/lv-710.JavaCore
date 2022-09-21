package com.softserve.hv08Classes;

public abstract class Person {
	
class FullName {
		
		private String firstName;
		private String lastName;
		
		public FullName() {
			this.firstName = "";
			this.lastName = "";
		}

		public FullName(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
			
		}
		
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		@Override
		public String toString() {

			return "FullName [firstName=" + firstName + ", lastName=" + lastName + "]: " + age;
		}

	}
	
	protected FullName fullName = new FullName();
	int age;
	
	public Person() {
		
	}
	
	public Person(FullName fullName , int age) {
		
		fullName.setFirstName(null);
		fullName.setLastName(null);
		this.age = age;
/*	fullName.setFirstName(firstName);
		fullName.setLastName(lastName);
		this.age = age;*/
		
		
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
		
	public String info() {
		
		return ("First name: <firstName>, Last name: <lastName>, Age: <age>");
	}
		
		public abstract String activity();
		
	

}
