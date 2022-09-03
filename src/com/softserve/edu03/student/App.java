package com.softserve.edu03.student;

public class App {
    public static void main(String[] args) {
        Student studentBob = new Student("Bob", 2);
        showInfo();

        Student studentTom = new Student("Tom", 1);
        studentTom.setRating(3);
        showInfo();

        Student studentAnna = new Student("Anna", 4);
        showInfo();

        System.out.println("Is Tom better than Anna? - " + studentTom.betterStudent(studentAnna));

//        var students = Stream.of(studentBob, studentAnna, studentTom)
//                .sorted().toList();
    }

    private static void showInfo() {
        System.out.println("AvgRating = " + Student.getAvgRating() +
                "\nTotalRating = " + Student.getSumRating());
    }
}
