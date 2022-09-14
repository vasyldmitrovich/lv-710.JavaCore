package com.softserve.hv05;

import java.util.Scanner;

public class Logic {
	
	static Cars acura = new Cars ("Acura", 2020, 2.2);
	static Cars audi = new Cars ("Audi", 2018, 2.5);
	static Cars bmw = new Cars ("BMW", 2019, 3.0);
	static Cars opel = new Cars ("Opel", 2020, 1.2);
	static Cars cars[] = { acura, audi, bmw, opel };
	
	static void displayCars () {
	Scanner in= new Scanner (System.in);
	  
	 System.out.println("Enter year of production: ");
    int yearOfProduction= in.nextInt();

   
  	 for ( int i = 0; i < cars.length; i++) {
  		 if (cars[i].getYearOfProduction() == yearOfProduction){
  			 System.out.println("Trere are " + cars[i].getType() + " Production in " +yearOfProduction + " year " );
           }
	}
/*	int numMonth;
	
	public static void innDay () {
	
	System.out.print("Enter number of month = ");
    Scanner input = new Scanner(System.in);
    int numMonth = input.nextInt();
    
    int dayInMonth=0;
    
    switch (numMonth) {
    case 1: numMonth = DayInMonth.howManyDays; break;
    case 2: numMonth = DayInMonth.howManyDays; break;
    case 3: numMonth = DayInMonth.howManyDays; break;
    case 4: numMonth = DayInMonth.howManyDays; break;
    case 5: numMonth = DayInMonth.howManyDays; break;
    case 6: numMonth = DayInMonth.howManyDays; break;
    case 7: numMonth = DayInMonth.howManyDays; break;
    case 8: numMonth = DayInMonth.howManyDays; break;
    case 9: numMonth = DayInMonth.howManyDays; break;
    case 10: numMonth = DayInMonth.howManyDays; break;
    case 11: numMonth = DayInMonth.howManyDays; break;
    case 12: numMonth = DayInMonth.howManyDays; break;
    default: System.out.println("Incorrect input"); return;
}
System.out.println(dayInMonth);
	}
*/	
/*	public static void innArr () {
		
	Scanner sc=new Scanner(System.in);  
	
	int[] array = new int[10];  
	System.out.println("Enter the elements of the array: ");  
	for(int i=0; i<10; i++)  
	{  
	array[i]=sc.nextInt();  
	}  
	}
*/
}
}
