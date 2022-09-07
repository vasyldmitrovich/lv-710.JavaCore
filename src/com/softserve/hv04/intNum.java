package hv04;

import java.util.Scanner;

public class intNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checNum();
	}
		private static void checNum() {
			 Scanner in= new Scanner (System.in);
			   
			 int maxNum =0;
			 int minNum =2147483647;
		  
		  for(int  i= 1;i<=3;i++)
		  {
		      System.out.println("Enter 3 numbers: ");
		      int  intNum= in.nextInt();

		      if(intNum > maxNum )
		      {
		    	   maxNum = intNum;
		    	   }
		      if(intNum < minNum )
	      {
			  minNum = intNum;
	    	   }
		  intNum++;
	      }
		      
		      
		  
		  System.out.println("maxNum= " + maxNum);
		  
			  System.out.println("minNum= "+ minNum);
		  }
		  
		  

		  
		  
		 
		  
		

	}


