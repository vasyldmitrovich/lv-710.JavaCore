package com.softserve.hw06.tasks.classes.secondTaskClasses;

public class Developer extends Employee{

    String position;

    public Developer(){


    }

    public Developer(String name, int age, String position, double salary){
        setName(name);
        setAge(age);
        setSalary(salary);
        this.position = position;
    }

    @Override
    public String report(){
        return String.format("Name: %s, Age: %d, Position: %s,  Salary: \u20B4 %.2f."
                , getName(), getAge(), this.position, getSalary());
    }

}
