package com.softserve.edu05Logic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import com.softserve.edu04.Product;

public class Logic {

	 static Employee e1 = new Employee("Alex", 1, 1000 );
     static Employee e2 = new Employee("John", 2, 2000 );
     static Employee e3 = new Employee("Eugene", 3, 3000 );
     static Employee e4 = new Employee("Bob", 2, 4000 );
     static Employee e5 = new Employee("James", 1, 4000 );
     static Employee[] employees = {e1, e2, e3, e4, e5};
     
     static Product p1 = new Product("TV", 1000, 1000 );
     static Product p2 = new Product("Phone", 2000, 2000 );
     static Product p3 = new Product("Laptop", 3000, 3000 );
     static Product p4 = new Product("VR", 4000, 4000 );
     static Product[] products = {p1, p2, p3, p4};

public static void employeesInDepartment () {
	
	 Scanner in= new Scanner (System.in);
	  
	 System.out.println("Enter departmentNumber: ");
     int departmentNumber= in.nextInt();

    
   	 for ( int i = 0; i < employees.length; i++) {
   		 if (employees[i].getDepartmentNumber() == departmentNumber){
   			 System.out.println("Trere are " + employees[i].getName() + " in " +departmentNumber + " department " );
            }
     }
}

public static void SalaryInDescendingOrder () {
	
	
	
	/*Arrays.sort(employees, Comparator.comparing(Employee::getSalary).reversed());
	System.out.println("arrange workers by the field salary in descending order:\n"+Arrays.toString(employees));
	*/
	 Employee tmp ;
	 for (int i = 0; i < employees.length ; i++) {
	 	for (int j = i + 1; j < employees.length; j++) {
	 		if (employees[i].getSalary() < employees[j].getSalary()) {
	 			tmp = employees[i];
	 			employees[i] = employees[j];
	 			employees[j] = tmp;
	 		}
	 	}
	 }
	 for (int i = 0; i < employees.length; i++) {
	 	System.out.println(employees[i]);
	 }

}	





public static void mostExpencive () {
	 Product mp = new Product("", 0, 0);
	 for ( int i = 0; i < products.length; i++) {
		 if (mp.getPrice() < products[i].getPrice()){
		mp=products[i];
}
	 }

	 System.out.println("The most expansive product is - " + mp.getName() + " Its quantity=" + mp.getQuantity() );
	
}

public static void maxQuantity () {
	 Product mq = new Product("", 0, 0);
	 for ( int i = 0; i < products.length; i++) {
		 if (mq.getQuantity() < products[i].getQuantity()){
		mq=products[i];
}
	 }
	 
	 System.out.println("The biggest Quantity has - " + mq.getName() + " Its quantity=" + mq.getQuantity() );
	
}
}