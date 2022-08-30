package com.softserve.edu4.student;

import lombok.Data;


@Data
public class Student implements Comparable<Student> {
    private static int count;
    private static double sumRating;
    private static double avgRating;
    private String name;
    private double rating;

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

}

