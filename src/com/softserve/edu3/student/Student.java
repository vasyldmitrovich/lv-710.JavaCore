package com.softserve.edu3.student;


import java.util.Objects;

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

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }

    public static void setSumRating(double sumRating) {
        Student.sumRating = sumRating;
    }

    public static void setAvgRating(double avgRating) {
        Student.avgRating = avgRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.rating, rating) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rating);
    }
}

