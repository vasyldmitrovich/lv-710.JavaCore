package Lesson3;

public class Employee {
	static double totalSum;
	static double totalBonus;
	private String name;
	private double rate;
	private double hours;
	private double salary;
	private double bonus;
	
	
	public Employee() {
		this.name = "Unknown";
		this.rate = 0;
		this.hours = 0;
		getSalary();
	}

	public Employee(String name, double rate) {
		this.name = name;
		this.rate = rate;
		getSalary();

	}

	public Employee(String name, double rate, double hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		getSalary();
		getBonus();
		totalSum += salary;	
		totalBonus += bonus;
		
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

	public void setHours(double hours) {
		this.hours = hours;
	}

	public double getHours() {
		return hours;
	}
	
	public double getSalary() {

		this.salary = hours * rate;
		return salary;
	}

	public static double getTotalSum() {
		return totalSum;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double getBonus() {
		this.bonus = getSalary() * bonus;
		return bonus;
	}
	
	public static double getTotalBonus() {
		return totalBonus;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + ", salary=" + salary + 
				", bonus=" + bonus + "%" + "]";
	}
				
}
