package com.softserve.hw06.Empoyees;

public class Developer extends Employee {
    String position;

    public Developer(String name, int age, String position, double salary) {
        super(name, age, salary);
        this.position = position;
    }

    public String report() {
        return String.format("Name: %s, Age: %d, Position: %s, Salary: \u20b4 %.2f.",
                this.getName(), this.getAge(), this.position, this.getSalary());
    }
}
