package soft;
import java.util.Scanner;

public class Employee {
   
   private String name;
   private double rate;
   private double hours;
   static double totalSum;
   
  
   private Employee () {
	      }
   
   private Employee (String name, double rate) {
       this.name = name;
       this.rate = rate;
   }
   private Employee (String name, double rate, int hours) {
	   this.name = name;
       this.rate = rate;
       this.hours = hours;
   }
   public String getName() {
       return name;
   }

   public double getRate() {
       return rate;
   }

   public void setRate(double rate) {
       this.rate = rate;
   }

   public double getHours() {
       return hours;
   }

   public void setHours(int hours) {
       this.hours = hours;
   }

   public void setName(String name) {
       this.name = name;
   }
   public static void main(String[] args) {  
   }
	   private double getSalary(double rate, double hours) {
		   this.rate = rate;
	       this.hours = hours;
		   Employee.totalSum = rate * hours;
	   }
	   @Override
	   public String toString() {
		   return "Employee[Name=" +name + 
		   			 ",rate=" +rate +  
		   				", Working hours="+ hours+"]";
	   }
       private double changeRate(double rate) {	
    	   setRate(rate);
           return rate;
    	   
       }
       public double getBonuses() {
           return rate * hours * 1.1;
       }

    	   
       }
    

