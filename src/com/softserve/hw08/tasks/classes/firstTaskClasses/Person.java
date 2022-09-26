package com.softserve.hw08.tasks.classes.firstTaskClasses;

abstract public class Person {

    private FullName fullName;
    private int age;

    public Person (FullName fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public String info(){
        return String.format("First name: %s, Last name: %s, Age: %d ", this.fullName.getFirstName(),
                this.fullName.getLastName(), this.age);
    }

    abstract public String activity();

}
