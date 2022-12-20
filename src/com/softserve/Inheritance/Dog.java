package com.softserve.Inheritance;

public class Dog extends Animal {


    public int id;

    public Dog(int id) {
        this.id = id;
    }

    public Dog() {
    }

    protected void dogVoice() {
        System.out.println("I am barking");
    }

    public void name() {
        name.append(" some dog");
        System.out.println(name);

    }

    public void eat() {
        System.out.println(id + "I am eating Hot-Dog");
    }


    public boolean equals(Object obj) {
        int id;
        Dog otherPet = (Dog) obj;
        return this.id == otherPet.id;

    }
}