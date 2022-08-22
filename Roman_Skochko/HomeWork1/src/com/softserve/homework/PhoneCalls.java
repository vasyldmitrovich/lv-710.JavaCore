package com.softserve.homework;

import java.util.Scanner;

public class PhoneCalls {
	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter cost of calls to country 1:");
		double p1 = Double.parseDouble(a.nextLine());
		System.out.println("Enter how long was call to country 1?");
		double t1 = Double.parseDouble(a.nextLine());
		
		System.out.println("Enter cost of calls to country 2:");
		double p2 = Double.parseDouble(a.nextLine());
		System.out.println("Enter how long was call to country 2?");
		double t2 = Double.parseDouble(a.nextLine());
		
		System.out.println("Enter cost of calls to country 2:");
		double p3 = Double.parseDouble(a.nextLine());
		System.out.println("Enter how long was call to country 2?");
		double t3 = Double.parseDouble(a.nextLine());
		
		double pt1 = p1 * t1;
		double pt2 = p2 * t2;
		double pt3 = p3 * t3;
		double all = pt1 + pt2 + pt3;
		
		System.out.println("Price of the call to country 1 is " + pt1);
		System.out.println("Price of the call to country 2 is " + pt2);
		System.out.println("Price of the call to country 3 is " + pt3);
		System.out.println("Total cost of calls is " + all);	
	}
}
