package com.softserve.edu07Interfaces.practik.Persons;

public class Teacher extends Staff {
    private final String TYPE_PERSON = "Teacher";

    public Teacher() {
    }

    public Teacher(String name) {
        super(name);
        System.out.println("type of person: " + getTYPE_PERSON());
    }

    @Override
    public void print() {
        System.out.printf("My name is %s, I am a teacher\n", getName());
    }


    @Override
    public String salary() {
        return "My salary is 20000";
    }

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }
}
