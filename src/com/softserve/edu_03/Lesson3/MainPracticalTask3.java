package Lesson3;

public class MainPracticalTask3 {
	public static void main(String[] args) {

		Employee person1 = new Employee("Roman S", 200, 40, 0);
		person1.setBonus(50);

		System.out.println(person1);
		
		
		Employee person2 = new Employee("Liza A", 200, 50, 0);
//		person2.changeRate(100);
		person2.setBonus(30);
		
		System.out.println(person2);
		

		System.out.println("Total salary: " + Employee.getTotalSum());
		System.out.println("Total bonuses: " + Employee.getTotalBonus());
//		System.out.println("Total bonuses: " + person1.getBonus());
//		System.out.println("Total bonuses: " + person2.getBonus());
	
	}
}
