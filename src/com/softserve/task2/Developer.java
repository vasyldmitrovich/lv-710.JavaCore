package com.softserve.task2;

public class Developer extends Employee{
    String position;

    public Developer(String name, int age,String position, double salary) {
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
        //return super.report();
        return "Name: " + super.getName() + ", Age: " + super.getAge() + " years" +
                ", Position: " + this.getPosition() + ", Salary: " + super.getSalary();
    }
}
