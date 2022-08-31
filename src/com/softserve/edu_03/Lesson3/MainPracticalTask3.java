package Lesson3;

public class MainPracticalTask3 {
	public static void main(String[] args) {

		Employee person1 = new Employee("Roman S", 200, 40);
		person1.setBonus(50);

		System.out.println(person1);
		
		
		Employee person2 = new Employee("Liza A", 200, 50);
		person2.setBonus(30);
		System.out.println(person2);
		
		
//		Employee person3 = new Employee();
//		System.out.println(person3);

		System.out.println("Total salary " + Employee.getTotalSum());
		System.out.println("Total bonuses " + Employee.getTotalBonus());
		

	}
}
