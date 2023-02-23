package com.softserve.hv09Classes;

import java.util.*;

public class Sets {
	
	public static void doSet() {
	


	Set<Student> s = new HashSet<>();
	//Set<Employee> s = new TreeSet<>(new Employee.ByNameAndId());
	//Set<Employee> s = new TreeSet<>();
	//boolean b;
	s.add(new Student("Petrenko", 3));
	System.out.println("s.add(new Student(Petrenko, \"3\")) = " );
	 s.add(new Student("Ivanenko", 2));
	System.out.println("s.add(new Student(Ivanenko, \"2\")) = " );
	 s.add(new Student("Vasylenko", 4));
	System.out.println("s.add(new Student(Vasylenko, \"1\")) = " );
	 s.add(new Student("Bojenko", 5));
		System.out.println("s.add(new Student(Bojenko, \"5\")) = " );
		s.add(new Student("Kovalenko", 1));
		System.out.println("s.add(new Student(Kovalenko, \"1\")) = " );
		
		
	Set<Student> q = new HashSet<>();
	//Set<Employee> s = new TreeSet<>(new Employee.ByNameAndId());
	//Set<Employee> s = new TreeSet<>();
	//boolean b;
	q.add(new Student("Kovalenko", 1));
	System.out.println("q.add(new Student(Kovalenko, \"1\")) = " );
	 q.add(new Student("Shevchenko", 2));
	System.out.println("q.add(new Student(Shevchenko, \"2\")) = " );
	 q.add(new Student("Bojenko", 5));
	System.out.println("q.add(new Student(Bojenko, \"5\")) = " );
	q.add(new Student("Petrenko", 3));
	System.out.println("q.add(new Student(Petrenko, \"3\")) = " );
	 q.add(new Student("Ivanenko", 2));
	System.out.println("q.add(new Student(Ivanenko, \"2\")) = " );
	
	}
	


	public static void union(Set s, Set q){
		Set<Student> union = new HashSet<>(s);
		union.addAll(q);
		System.out.println ("union set =" + union);
		
	}
	
	
	public static void intersect(Set s, Set q){
		
		Set<Student> intersect = new HashSet<>(s);
		intersect.retainAll(q);
		System.out.println ("intersect set =" + intersect);
		
	}
//		}
    
}
