package com.softserve.hv07.Task1;

import com.softserve.hv07.Classes.SalariedEmployee;
import com.softserve.hv07.Classes.ContractEmployee;
import com.softserve.hv07.Classes.Employee;

import java.util.ArrayList;
import java.util.List;

import java.util.Comparator;


public class Hv07Task  {
    
	public static void runMyProgram () {
	
List<Employee> list = new ArrayList<Employee>();

list.add(new SalariedEmployee ("Vasya", "3", 15, 150));
list.add(new SalariedEmployee ("Anna", "4", 12, 160));
list.add(new ContractEmployee("Alina", "1", 1000));
list.add(new ContractEmployee("Jack", "2", 2000));
list.sort(new Comparator<Employee>() {
	
	@Override
	public int compare(Employee o1, Employee o2) {
		
		 return (int) ((o2).calculatePay()-(o1).calculatePay());

	}
});
	 
		for (Employee emp:list) {
            System.out.println("EmployeeId: "+ emp.getEmployeeld() +
                    ", name: " + emp.getName()+
                    ", average salary: " + emp.calculatePay());
            
           
        }
		 
}
}


	      
	


	
			

	

		
		/*ContractEmployee ce1 = new ContractEmployee();
		ce1.setName("Alex");
		ce1.setEmployeeld("1");
		ce1.setFixedMonthlyPayment(1000);
		
		
		SalariedEmployee se1 = new SalariedEmployee();
		se1.setName("John");
		se1.setEmployeeld("2");
		se1.setRate(10.5);
		se1.setHours(150);
		
		ContractEmployee ce2 = new ContractEmployee();
		ce2.setName("Jack");
		ce2.setEmployeeld("3");
		ce2.setFixedMonthlyPayment(2000);
		
		SalariedEmployee se2 = new SalariedEmployee();
		se2.setName("Oleg");
		se2.setEmployeeld("4");
		se2.setRate(12.5);
		se2.setHours(140);
		*/
		
		
		
		
	

