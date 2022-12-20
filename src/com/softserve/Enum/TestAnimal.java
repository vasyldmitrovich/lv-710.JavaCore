package com.softserve.Enum;

import static com.softserve.Enum.Animal.*;

public class TestAnimal {
    public static void main(String[] args) {
        Animal dog = DOG;
        Animal frog = FROG;

        System.out.println(dog instanceof Object);
        System.out.println(dog.getClass());
        System.out.println();
        System.out.println(dog.getTranslation());
        System.out.println();

        if (frog == DOG) {
            System.out.println("DOG is a animal");
        } else {
            System.out.println("wrong");
        }

        frog = valueOf("FROG");
        System.out.println(frog.getTranslation());
        System.out.println();

        System.out.println("position's number of frog is: " + frog.ordinal());
        System.out.println();

        System.out.println(frog.compareTo(dog));
        System.out.println();

        switch (dog) {
            case CAT:
                System.out.println("Its a CAT");
                break;
            case DOG:
                System.out.println("Its a DOG");
                break;
            case FROG:
                System.out.println("Its a FROG");
                break;
        }
    }
}
