package com.softserve.edu04.hm.Dog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.softserve.edu04.hm.Dog.Breed.*;

// READY !!
public class DogDemo {

    public static void createDogs() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Dog dog = new Dog(br.readLine(), DOBERMAN, Integer.parseInt(br.readLine()));
        Dog dog2 = new Dog(br.readLine(), DACHSHUND, Integer.parseInt(br.readLine()));
        Dog dog3 = new Dog(br.readLine(), BULLDOG, Integer.parseInt(br.readLine()));
//        Dog dog4 = new Dog(br.readLine(), BULLDOG, Integer.parseInt(br.readLine()));
//        Dog dog5 = new Dog(br.readLine(), BULLDOG, Integer.parseInt(br.readLine()));

        Dog dogs[] = new Dog[]{dog, dog2, dog3};
        int maxAge = dogs[0].getAge();
        int iMaxAge = 0;
        boolean b = false;
        for (int k = 0; k < dogs.length; k++) {
            if (maxAge < dogs[k].getAge()) {
                maxAge = dogs[k].getAge();
                iMaxAge = k;
            }
            for (int i = 0; i < dogs.length - 1; i++) {
                for (int j = 1; j < dogs.length; j++) {
                    if (dogs[i].getName().equals(dogs[j].getName()) && !dogs[i].equals(dogs[j])) {
                        b = true;
                    }
                }
            }
        }
            if (b = true) {
                System.out.println("We found a match for the names");
            }
        System.out.println("The oldest dog's name is " + dogs[iMaxAge].getName() + " and it breed is " + dogs[iMaxAge].getBreed());
    }
    public static void main(String[] args) throws IOException {
        createDogs();
    }
}


