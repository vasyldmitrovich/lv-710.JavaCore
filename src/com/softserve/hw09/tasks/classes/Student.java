package com.softserve.hw09.tasks.classes;

import com.softserve.IO.Output;

import java.util.Iterator;
import java.util.List;

public class Student {

    private String name;
    private int courseID;

    public Student(String name, int courseID) {
        this.name = name;
        this.courseID = courseID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    static public void printStudents(List<Student> students, int courseID ){
        Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()){
            Student s = studentIterator.next();
            if(s.courseID == courseID) {
                Output.print(s.name);
            }
        }
    }

    @Override
    public String toString(){
        return "Student name - " + this.name + ", Course ID - " + this.courseID + "\n";
    }

}
