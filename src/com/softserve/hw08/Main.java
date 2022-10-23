package com.softserve.hw08;

public class Main {
    public static void main(String[] args) {

        //Task 1
        Student student[] = new Student[2];

        student[0] = new Student(new FullName("Kate", "Smith"), 19, 3 );
        student[1] = new Student(new FullName("Jane", "Wilson"), 21, 5 );

        System.out.println("Task1\n");

        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].info());
            System.out.println(student[i].activity());
            System.out.println("\n");
        }

        //Task2

        Wrapper<Integer> wInt = new Wrapper<>(20);
        Wrapper<String> wString = new Wrapper<>("Word");
        Wrapper<Boolean> wBoolean = new Wrapper<>(true);

        System.out.println("\nTask 2");
        System.out.println(wInt.getValue());
        System.out.println(wString.getValue());
        System.out.println(wBoolean.getValue());






    }
}