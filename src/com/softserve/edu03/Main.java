package edu03;



import java.io.IOException;

public class Main  {
	
	    public static void main (String[] args)throws IOException {
	 Employee emp1 = new Employee ("Max",10,176);

	   
	   System.out.println (emp1.toString());
	   System.out.println (emp1.getSalary());
	   emp1.addToTotalSum();
	   
	   Employee emp2 = new Employee ("Ira",15,188);

	   
	   System.out.println (emp2.toString());
	   System.out.println (emp2.getSalary());
	   emp2.addToTotalSum();
	   
	   Employee emp3 = new Employee ("Uma",20,190);

	   
       System.out.println (emp3.toString());
       System.out.println (emp3.getSalary());
       emp3.addToTotalSum();
     
       System.out.println ("totalSum= "+Employee.totalSum);
      
	
	    
	    }

	

}
