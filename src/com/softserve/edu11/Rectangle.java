package com.softserve.edu11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Rectangle {
	
	private static int a;
	private static int b;
	private static int square = 0;	
	
	 public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getSquare() {
		return square;
	}
	public void setSquare(int square) {
		this.square = square;
	}
	
	 
		
	public static int squareRectangle (int a, int b) {
		
		Scanner sc=new Scanner(System.in); 
		 System.out.println("Enter a $ b ");  
	//		a=sc.nextInt();
	//		b=sc.nextInt();
			
			try {
				a=sc.nextInt();

			} catch (InputMismatchException ex) {
			    System.out.println("Not a valid number!");
			    System.exit(0);
			}
			try {
				b=sc.nextInt();

			} catch (InputMismatchException ex) {
			    System.out.println("Not a valid number!");
			    System.exit(0);
			}
		try {
			if ((a <0)||(b<0))
				throw new ArithmeticException();
		} catch (ArithmeticException e) {
		System.out.println("We need positive values");
		 System.exit(0);
		}
		finally {
		square = a*b;
		
		return square;
		}
	}


}
