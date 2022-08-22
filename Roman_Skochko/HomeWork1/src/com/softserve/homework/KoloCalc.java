package com.softserve.homework;

import java.util.Scanner;

public class KoloCalc {
	public static void main(String[] args) {
		
		Scanner rad = new Scanner(System.in);
		
		System.out.println("Enter a radius of the circle");
		
		double r = Double.parseDouble(rad.nextLine());
		double pi = 3.141;
		double peri = 2 * r * pi; 
		double area = pi * r * r;
		
		System.out.println("Okay area of your circle = " + area + " and perimeter = " + peri);
		
		
		
	}
}
