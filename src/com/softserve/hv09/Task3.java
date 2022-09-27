package com.softserve.hv09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

import com.softserve.hv09Classes.Student;

public class Task3 {
	
	public static void main (String [] args) {
		
		List<Student> lstStr = new ArrayList<>();
		lstStr.add(new Student("Alex", 4));
		lstStr.add(new com.softserve.hv09Classes.Student("Jack", 3));
		lstStr.add(new com.softserve.hv09Classes.Student("John", 4));
		lstStr.add(new com.softserve.hv09Classes.Student("Max", 3));
		lstStr.add(new com.softserve.hv09Classes.Student("Uma", 2));
		lstStr.add(new com.softserve.hv09Classes.Student("James", 1));
		
		System.out.println("\nList of students ordered by Name");
		
		Collections.sort(lstStr, Student.nameComparator);
		lstStr.forEach((n)-> System.out.print(n.getName()+" "+n.getCourse()+" \n"));
		
		System.out.println("\nList of students ordered by Course");
		
		Collections.sort(lstStr, Student.courseComparator);
		lstStr.forEach((n)-> System.out.print(n.getName()+" "+n.getCourse() +" \n"));
				
		Student.printStudents(lstStr, 3);
		
		
		
	}
}
	

