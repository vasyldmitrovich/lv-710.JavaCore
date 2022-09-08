package edu05;

import java.util.Arrays;

public class Array {
	
	static int[] array = {-5, 28, 4, -7, 8, -19, 
			0, 12, -20, 40} ;
	
	public static void maxArr () {
	 int max = array[0];
	int imax = 0;
	int i = 0;
	while (i < array.length) {
		if (array[i] > max) {
			max = array[i];
			imax = i;
		}
		i++;
	}
	System.out.print("Maximum = " + max);
	System.out.println(" is in " + (imax + 1) + " place");
	}
	
	public static void sumArr () {
		int sum = 0;
		for (int i = 0; i < array.length; i++) 
		if (array[i]>0) { sum += array[i];
		
		}
		System.out.println("Sum = " + sum);
	}

	public static void amountArr () {
	int amountN = 0;
	int amountP = 0;
	for (int a : array) {
		if (a < 0 ) { amountN++; }
		else { amountP++; }
	}
	if (amountN>amountP) {
		System.out.println("There are more negative numbers " );
	}
		else 	{System.out.println("There are more positive numbers " );
		
		}
	
	System.out.println("Amount negative = " + amountN);
	}

	
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maxArr ();
		sumArr ();
		amountArr ();
		
	}

}
