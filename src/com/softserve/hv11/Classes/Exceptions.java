package com.softserve.hv11.Classes;

import java.util.Scanner;

import com.softserve.hv11.Classes.Exceptions;

public class Exceptions {
	
	private double num1;
	private double num2;
	double dividing =0;
	
	
    public Exceptions() {
		
	}
    
    public Exceptions(double num1, double num2) {
		
	}
	

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	public double getDividing() {
		return dividing;
	}

	public void setDividing(double dividing) {
		this.dividing = dividing;
	}

	@Override
	public String toString() {
		return "Exceptions [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public double div (double num1, double num2) {
		
	 try {
	            if (num2 == 0)
	                throw new ArithmeticException();
	             
	} catch (ArithmeticException e) {
		// TODO Auto-generated catch block
		System.out.println("Division by zero");
		//return 0;
		
	}
	 finally {
	 dividing = (num1/num2);
	 return dividing;
	 }
		
		
	}
	
	
}

