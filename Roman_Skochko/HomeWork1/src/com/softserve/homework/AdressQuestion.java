package com.softserve.homework;

import java.util.Scanner;

public class AdressQuestion {
	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = a.nextLine();
		System.out.println("Where are you live, " + name);
		String adress = a.nextLine();
		System.out.println("Okay, your name is " + name + " and you live at " + adress);
		
	}
}
