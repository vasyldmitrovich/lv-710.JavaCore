package com.softserve.homework;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	
	Scanner a1 = new Scanner(System.in);	
	
	System.out.println("Welcome to primitive calculator");
	System.out.println("Enter value of 'A'");
	double a = Double.parseDouble(a1.nextLine());
	System.out.println("Enter value of 'B'");
	double b = Double.parseDouble(a1.nextLine());
	
	double summ = a + b;
	double rizn = a - b;
	double mnoz = a * b;
	double dile = a / b;
	
	System.out.println("Results:");
	System.out.println("a + b = " + summ);
	System.out.println("a - b = " + rizn);
	System.out.println("a * b = " + mnoz);
	System.out.println("a / b = " + dile);
}
}
