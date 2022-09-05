package com.softserve.hw04;

import com.softserve.hw03.InputReader;
import java.io.IOException;
import java.util.ArrayList;

public class Demo {

    public static void showInRange() throws IOException {
        float[] numbs = new float[3];
        System.out.print("Enter first number: ");
        numbs[0] = InputReader.getInputFloat();
        System.out.print("Enter second number: ");
        numbs[1] = InputReader.getInputFloat();
        System.out.print("Enter third number: ");
        numbs[2] = InputReader.getInputFloat();

        for (int i = 0; i < numbs.length; i++) {
            if (numbs[i] >= -5 && numbs[i] <= 5)
                System.out.println(numbs[i] + " in range -5,5;");
            else System.out.println(numbs[i] + " not in range");
        }
    }

    public static void showMinMax() throws IOException {
        int[] numbs = new int[3];
        int min, max;
        System.out.print("Enter first number: ");
        numbs[0] = InputReader.getInputInt();
        System.out.print("Enter second number: ");
        numbs[1] = InputReader.getInputInt();
        System.out.print("Enter third number: ");
        numbs[2] = InputReader.getInputInt();

        min = max = numbs[0];
        for (int i = 0; i < numbs.length; i++) {
            if (numbs[i] < min) min = numbs[i];
            if (numbs[i] > max) max = numbs[i];
        }
        System.out.println("Min: " + min + ", max: " + max + ";");
    }

    public static void showDogInfo() {
        ArrayList<Dog> d1 = new ArrayList<>();
        int dogOld = 0;
        String dogName = null;
        String dogBreed = null;
        d1.add(0, new Dog("Tyzik", 12, Breed.DALMATAIN));
        d1.add(1, new Dog("Sharik", 8, Breed.BERNARD));
        d1.add(2, new Dog("Myhtar", 5, Breed.SHEPHERD));

        System.out.println("Print all dogs:");
        for (Dog dog : d1) {
            System.out.println(dog.toString());
        }

        if (d1.get(0).getName().equals(d1.get(1).getName()) ||
            d1.get(0).getName().equals(d1.get(2).getName()) ||
            d1.get(1).getName().equals(d1.get(2).getName())) {

            System.out.println("\nOne or two names are same.");
        }

        for (int i = 0; i < d1.size(); i++) {
            if (d1.get(i).getAge() > dogOld) {
                dogOld = d1.get(i).getAge();
                dogName = d1.get(i).getName();
                dogBreed = String.valueOf(d1.get(i).getBreed().getDogBreed());
            }
        }

        System.out.println("\nThe " + dogName + " is oldest dog, " +
                "his is " + dogBreed + ".");
    }

    public static void demonstration() throws IOException {
        System.out.println("\nEnter three float numbers and check: are they" +
                " all belong to the range [-5,5].");
        showInRange();
        System.out.println("\nEnter three integer numbers and " +
                "find min and max of them.");
        showMinMax();
        System.out.println("\nEnter number of HTTP Error (400, 401, ...)" +
                "and get declaration of this error.");
        HTTPError.getVal();
        System.out.println("\nCreate three instances of class Dog, " +
                "check the oldest dog, check if there is no two dogs with" +
                "the same name.");
        showDogInfo();
    }

}
