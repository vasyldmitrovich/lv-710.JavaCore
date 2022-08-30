package edu03;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Employee {
   
   private String name;
   private double rate;
   private double hours;
   public static double totalSum = 0;
   
  
   Employee () {
   }
   
   Employee (String name, double rate) {
       this.name = name;
       this.rate = rate;
   }
   Employee (String name, double rate, double hours) {
	   this.name = name;
       this.rate = rate;
       this.hours = hours;
   }
/*   public void getEmployee() throws IOException {
  		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
      	System.out.println("What is your name? ");
      	String name = br.readLine();
      	System.out.println("What is your Rate? " +name +"?");
   

        rate = Double.parseDouble ( br.readLine() );
      	
      	System.out.println("How many hours did you work? " +name +"?");
        

       double hours = Double.parseDouble ( br.readLine() );
   }*/
   public String getName() {
       return name;
   }

   public double getRate() {
       return rate;
   }
   
   public double getHours() {
       return hours;
   }
   
   public void setName(String name) {
       this.name = name;
   }
   
   public void setRate(double rate) {
       this.rate = rate;
   }

     public void setHours(int hours) {
       this.hours = hours;
   }

    	   public double getSalary() {
		   return rate * hours;
	   }
    	   
	   @Override
	   public String toString() {
		   return "Employee[Name=" +name + 
		   			 ",rate=" +rate +  
		   				", Working hours="+ hours+"]";
	   }
	   public double changeRate(double rate) {	
    	   setRate(rate);
           return rate;
    	   
       }
       public double getBonuses() {
           return rate * hours * 1.1;
       }
       
       public void addToTotalSum() {
           totalSum = totalSum + getSalary();
       }
       
       
       	  
       	

    	   
       }
    

