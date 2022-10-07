package com.softserve.hv05;

import java.util.Scanner;

public class IntegerNumbers {

	
	static int productArray =0;

	public static void sumArr () {
	
		
        Scanner sc=new Scanner(System.in);
		
		int[] array = new int[10];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<10; i++)  
		{  
		array[i]=sc.nextInt();  
		}  
		
        int sum = 0;
		
		for (int i = 0; i < 5 ; i++)  
		if (array[i]>0) { sum +=array[i]; 
		 
		}
		else { productArray =array[5]*array[6]*array[7]*array[8]*array[9];
		
		System.out.println("product = " + productArray);
		}
	    
		if (productArray == 0) {
		System.out.println ("Sum="+sum);
		
		}
	}
		
}
