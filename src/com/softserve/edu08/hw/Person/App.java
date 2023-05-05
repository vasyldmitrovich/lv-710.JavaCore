package com.softserve.edu08.hw.Person;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student(new FullName("Petro", "Shevchenko"), 22, 99);
        Student student2 = new Student(new FullName("Ivan", "Tychina"), 19, 88);
        printStudent(student1, student2);
        Student student3 = (Student) student1.clone();
        System.out.println("Student3 перед змінами: ");
        printStudent(student3);
        student3.setCourse(66);
        System.out.println("Student3 після змін: ");
        printStudent(student3);
    }

    public static void printStudent(Student... students) {
        for (Student student : students) {
            System.out.println(student.info() + "\n" + student.activity());
            System.out.println();
        }
    }
}
