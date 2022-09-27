package com.softserve.hv06.Tasks;

import com.softserve.hv06.Classes.Developer;
import com.softserve.hv06.Classes.Employee;

public class TaskDeveloper {
	
	public static void taskDeveloper () {
	
	Employee e = new Employee ("Alex", 23, 1000.5);
    Developer d = new Developer ("John", 25, 2000.7, "Average Java developer");
    
   
    System.out.println (e.report());
    
    System.out.println (d.report());
	}
    
}
