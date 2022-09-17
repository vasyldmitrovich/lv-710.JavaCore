package com.softserve.hv05;

import java.util.Scanner;

public class IntegerNumbers5 {
	
	static void positionOfElement () {
		
	Scanner sc=new Scanner(System.in);
	
	int[] array = new int[5];  
	System.out.println("Enter the elements of the array: ");  
	for(int i=0; i<5; i++)  
	{  
	array[i]=sc.nextInt();  
	}  
	
    int position = 0;
    int positionSearch = 0;
    
	
	for (int i = 0; i < 5 ; i++) {  
	if (array[i]>0) { positionSearch++; 
	}
	if (positionSearch ==2) {position=i+1; System.out.println ("Second positive is = " + position + "element");
	
	break;
	}
	
	}
	int positionMin = 0;
    int positionMinSearch = array[0];
    
	
	for (int i = 0; i < 5 ; i++) {  
	if (array[i]<positionMinSearch) { positionMinSearch=array[i]; positionMin=i;
	}
	}
	System.out.println ("minimum is = " + positionMinSearch + " in position " +(positionMin+1));
	
	}
}	




