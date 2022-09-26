package com.softserve.hw08.tasks.classes.firstTaskClasses;

public class Student extends Person{

    private int courseID;

    public Student(FullName fullName, int age, int courseID) {
        super(fullName, age);
        this.courseID = courseID;
    }

    @Override
    public String info(){
        return String.format(super.info() + " Course ID: %d", this.courseID);
    }

    @Override
    public String activity() {
        return "I study at university";
    }
}
