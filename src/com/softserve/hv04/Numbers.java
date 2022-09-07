package edu04;

import java.util.Scanner;

public class Numbers {
	
	public static void main(String[] args) {
		checNum();
	}

	private static void checNum() {
		 Scanner in= new Scanner (System.in);
		   
		 int countNum =0;
	  
	  for(float  i= 1;i<=3;i++)
	  {
	      System.out.println("Enter 3 numbers: ");
	      float  numbers= in.nextInt();

	      if(numbers >-5 && numbers <5)
	      {
	    	  countNum++;
	      }
	      
	      
	  
	  if (countNum == 3) {
	  System.out.println("all numbers belong to the range [-5,5]");
	  }
	  else {
		  System.out.println("Not all numbers belong to the range [-5,5]");
	  }
	  }
	  

	  
	  
	 }
	  
	}
	


		
	

	

