package com.softserve.hw06.task2;

public class Developer extends Employee {
    private String position;

    public Developer() {
    }

    public Developer(String name, String position, int age, double salary) {
        super(name, age, salary);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d years, Position: %s, Salary: \u20B4 %.2f",
                getName(), getAge(), getPosition(), getSalary());
    }
}
