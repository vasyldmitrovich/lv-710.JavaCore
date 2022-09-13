package com.softserve.extra02.Persons;

public class Worker extends Person{
    String workPosition;
    int experienceYears;

    public String getWorkPosition() {
        return workPosition;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public Worker(String name, String workPosition, int experienceYears) {
        super(name);
        this.workPosition = workPosition;
        this.experienceYears = experienceYears;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "workPosition='" + workPosition + '\'' +
                ", experienceYears=" + experienceYears +
                '}';
    }
}
