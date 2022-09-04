package Lesson3;

public class Employee {
	static double totalSum;
	private String name;
	private double rate;
	private double hours;
	
	
	public Employee() {
			
	}

	public Employee(String name, double rate) {
		this.name = name;
		this.rate = rate;
		
	}

	public Employee(String name, double rate, double hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		totalSum += getSalary();
		
		
				
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getRate() {
		return rate;
	}
	
	public double changeRate(double rate) {
		totalSum -= getSalary();
		setRate(rate);
		totalSum += getSalary();
		return totalSum;
	}
	
	
	public void setHours(double hours) {
		this.hours = hours;
	}

	public double getHours() {
		return this.hours;
	}
	
	public double getSalary() {
		return this.hours * this.rate;
		
	}
	
	public double getBonuses() {
		return this.hours * this.rate * 0.1;
	}

	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
	}
	
	
				
}
