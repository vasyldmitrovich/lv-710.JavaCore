package com.softserve.hw06.extra_task;

public class Worker extends Person {
    private String workPosition;
    private int experienceYears;

    public Worker() {
    }

    public Worker(String name, String workPosition, int experienceYears) {
        super(name);
        this.workPosition = workPosition;
        this.experienceYears = experienceYears;
    }

    public String getWorkPosition() {
        return workPosition;
    }

    public void setWorkPosition(String workPosition) {
        this.workPosition = workPosition;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    @Override
    public String toString() {
        return "Worker[workPosition=" + getWorkPosition() +
                ", experienceYears=" + getExperienceYears() + "]";
    }
}
