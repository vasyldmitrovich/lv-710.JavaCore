package com.softserve.hv05;

import java.time.*;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Scanner;
  
public class DaysInMounth {
	
    public static void daysInMounth()    {
        
    	Month month = Month.JANUARY;
    	

		System.out.print("Please wright Number of Month  ");
	    Scanner input = new Scanner(System.in);
	    int numMonth = input.nextInt();


	    switch (numMonth) {
	    case 1: month = Month.JANUARY;break;
	    case 2: month = Month.FEBRUARY;break;
	    case 3: month = Month.MARCH;break;
	    case 4: month = Month.APRIL;break;
	    case 5: month = Month.MAY;break;
	    case 6: month = Month.JUNE;break;
	    case 7: month = Month.JULY;break;
	    case 8: month = Month.AUGUST;break;
	    case 9: month = Month.SEPTEMBER;break;
	    case 10: month = Month.OCTOBER;break;
	    case 11: month = Month.NOVEMBER;break;
	    case 12: month = Month.DECEMBER;break;
	    default: System.out.println("Incorrect input"); return;
	  }
	    System.out.println(month.length(false));
	}
  
       
    
}
