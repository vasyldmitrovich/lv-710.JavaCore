package com.softserve.edu4;

import lombok.Data;

import java.util.stream.Stream;


@Data
public class Student implements Comparable<Student> {
    private String name;
    private double rating;
    private static double sumRating;
    private static int count;
    private static double avgRating;

    public Student() {
        count++;
        avgRating = sumRating / count;
    }

    public Student(String name, double rating) {
        this.name = name;
        this.rating = rating;
        sumRating += rating;
        count++;
        avgRating = sumRating / count;
    }

    public void setRating(double rating) {
        sumRating -= this.rating;
        this.rating = rating;
        sumRating += rating;
        avgRating = sumRating / count;
    }

    public static double getAvgRating() {
        return avgRating;
    }

    public static double getSumRating() {
        return sumRating;
    }

    public boolean betterStudent(Student student) {
        return this.compareTo(student) > 0;
    }

    //    The natural ordering of students would be sorting by rating
    public int compareTo(Student o) {
        if (this.rating == o.rating)
            return 0;
        return this.rating > o.rating ? 1 : -1;
    }

    public static void main(String[] args) {
        Student studentBob = new Student("Bob", 2);
        System.out.println("AvgRating = " + Student.getAvgRating() +
                "\nTotalRating = " + Student.getSumRating());

        Student studentTom = new Student("Tom", 1);
        studentTom.setRating(3);
        System.out.println("AvgRating = " + Student.getAvgRating() +
                "\nTotalRating = " + Student.getSumRating());

        Student studentAnna = new Student("Anna", 4);
        System.out.println("AvgRating = " + Student.getAvgRating() +
                "\nTotalRating = " + Student.getSumRating());

        System.out.println("Is Tom better than Anna? - " + studentTom.betterStudent(studentAnna));

//        var students = Stream.of(studentBob, studentAnna, studentTom)
//                .sorted().toList();

    }
}

