package com.softserve.edu04;

import java.util.Scanner;

//TODO do not correct name of class, what means 'Hmodd'
public class Hmodd 	{
public static void main(String[] args) {
	countOdd();
}

private static void countOdd() {
	 Scanner in= new Scanner (System.in);
	   
	  int oddNumbers = 0;
  
  for(int i= 1;i<=3;i++)
  {
      System.out.println("Enter 3 numbers: ");
      int numbers= in.nextInt();

      if(numbers %2==1)
      {
          oddNumbers++;
      }
  }
  System.out.println("There are: "+oddNumbers+" odd numbers");
  

   }
	
}