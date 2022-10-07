package com.softserve.hv11.Classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.softserve.hv11.App;

public class StartEnd {
	
	
	
	@Override
	public String toString() {
		return "StartEnd [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public static void readNumber() throws IOException{
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Insert start");
		int start = sc.nextInt();
		System.out.println("Insert end");
		int end = sc.nextInt();
		System.out.println("Gates from " +start+" to " + end);
		
		int[] array = new int[10];
		Scanner scc=new Scanner(System.in);
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<10; i++){  
			 try
			    {
				 array[i]=scc.nextInt();
			    }
			    catch (InputMismatchException exception)
			    {
			        System.out.println("Integers only, please."); break;
			    }
			
			try  {
				if (array[i]<start || array[i]> end) 
				 throw new ArithmeticException();
				}
				catch (ArithmeticException b) {
					System.out.println("out of gates"); break;
				}
			
					finally { System.out.println((i+1) + " element= "+ array[i]);
					}
		}
	}
}
	
		
		
		
		
		
	


