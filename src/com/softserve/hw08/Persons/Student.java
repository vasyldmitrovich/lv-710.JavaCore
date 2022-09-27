package com.softserve.hw08.Persons;

public class Student extends Person{
    int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;    }

    @Override
    public String info() {
        return super.info()+", Course: "+course;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    public static void main() {
        Student s1 = new Student(new FullName("John", "Smith"), 38, 1);
        Student s2 = new Student(new FullName("Angelina", "Jolie"), 36, 2);
        System.out.println(s1.info());
        System.out.println(s1.activity());
        System.out.println(s2.info());
        System.out.println(s2.activity());
    }
}
