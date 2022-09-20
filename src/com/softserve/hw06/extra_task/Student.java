package com.softserve.hw06.extra_task;

public class Student extends Person{
    private String studyPlace;
    private int studyYears;

    public Student() {
    }

    public Student(String name, String studyPlace, int studyYears) {
        super(name);
        this.studyPlace = studyPlace;
        this.studyYears = studyYears;
    }

    public String getStudyPlace() {
        return studyPlace;
    }

    public void setStudyPlace(String studyPlace) {
        this.studyPlace = studyPlace;
    }

    public int getStudyYears() {
        return studyYears;
    }

    public void setStudyYears(int studyYears) {
        this.studyYears = studyYears;
    }

    @Override
    public String toString() {
        return "Student[" +
                "studyPlace='" + studyPlace + '\'' +
                ", studyYears=" + studyYears +
                ']';
    }
}
