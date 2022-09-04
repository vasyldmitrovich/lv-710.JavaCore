package Lesson3;

public class MainPracticalTask3 {
	public static void main(String[] args) {

		Employee person1 = new Employee("Roman S", 200, 40);
		Employee person2 = new Employee("Liza A", 200, 50);
		Employee person3 = new Employee("Alex B", 100, 70);
		
		person1.changeRate(500);
		
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		
		System.out.println("Salary of person1: " + person1.getSalary());
		System.out.println("Salary of person2: " + person2.getSalary());
		System.out.println("Salary of person3: " + person3.getSalary());
		
		System.out.println("Total Employee's salary: " + Employee.totalSum);

	
	}
}
