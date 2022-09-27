package com.softserve.hw08.Persons;

public abstract class Person {
    FullName fullName;
    int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public String info(){
        return "First name: "+fullName.getFirstName()+
                ", Last name: "+fullName.getLastName()+
                ", Age: "+age;
    }
    public abstract String activity();
}
