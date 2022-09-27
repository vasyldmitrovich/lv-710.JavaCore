package com.softserve.hv09Classes;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Scanner;

import com.softserve.hv08Classes.Person;

public class Student {
	
	private String name;
	private Integer course;

	public Student(String name, Integer course ) {
			
	this.name = name;
	this.course = course;
			
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getCourse() {
		return course;
	}
	public void setcourse(Integer course) {
		this.course = course;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(course, other.course) && Objects.equals(name, other.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(course, name);
		
	}	
	
		@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}

		public static Comparator<Student> nameComparator=new Comparator<Student>()
	    {
		public int compare(Student o1, Student o2)
		{
		return o1.getName().compareTo(o2.getName());
		}
		};
		  public static Comparator<Student> courseComparator=new Comparator<Student>()
		    {
			public int compare(Student o1, Student o2)
			{
			return o1.getCourse()-o2.getCourse();
			}
			};
			
		public static void printStudents (List<Student> list, Integer course) {
			
			    Iterator<Student> iterator = list.listIterator();
			    while (iterator.hasNext()) {
			    	
			    	Student s = iterator.next();
			    	if (s.getCourse()==course)
			    	
			    	System.out.println ("Students name  on " +course +" course is " + s.getName());
			    }
	}
}

				



