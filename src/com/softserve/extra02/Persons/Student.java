package com.softserve.extra02.Persons;

public class Student extends Person{
    private String studyPlace;
    private int studyYears;

    public Student(String name, String studyPlace, int studyYears) {
        super(name);
        this.studyPlace = studyPlace;
        this.studyYears = studyYears;
    }

    public String getStudyPlace() {
        return studyPlace;
    }

    public int getStudyYears() {
        return studyYears;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studyPlace='" + studyPlace + '\'' +
                ", studyYears=" + studyYears +
                '}';
    }
}
