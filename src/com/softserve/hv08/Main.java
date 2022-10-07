package com.softserve.hv08;

import com.softserve.hv08Classes.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student st1 = new Student ("Max","Hromylo", 34, 5);
		
		Student st2 = new Student ("Uma", "Hromylo", 12, 1);
		
		System.out.println (st1.activity());
		System.out.println (st1.info());
		System.out.println (st2.activity());
		System.out.println (st2.info());
		

	}

}
