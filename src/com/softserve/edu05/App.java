package com.softserve.edu05;


import com.softserve.edu05Logic.Logic;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    runTasks();
	}
	
	public static void runTasks () {
		Logic.employeesInDepartment();
		Logic.SalaryInDescendingOrder();	
		Logic.maxQuantity();
		Logic.mostExpencive();
	}

}
