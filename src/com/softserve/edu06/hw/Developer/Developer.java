package com.softserve.edu06.hw.Developer;

import com.softserve.edu05.practic.Employee.Employee;

import java.util.Objects;

public class Developer extends Employee implements InterfaceReport {
    private int age;
    private String position;

    public Developer() {
    }

    public Developer(int age, String position) {
        this.age = age;
        this.position = position;
    }

    public Developer(String name, int departmentNumber, int salary, int age, String position) {
        super(name, departmentNumber, salary);
        this.age = age;
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Developer developer = (Developer) o;

        if (age != developer.age) return false;
        return Objects.equals(position, developer.position);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + age;
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "age=" + age +
                ", position='" + position + '\'' +
                '}';
    }

    @Override
    public void report() {
        System.out.println("Name: " + super.getName() + ", Age: " + this.getAge() + ", Position: " +
                this.getPosition() + ", Number of department: " + super.getDepartmentNumber() +
                ", Salary: " + super.getSalary());
    }
}
