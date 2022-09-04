package com.softserve.hw04;

import com.softserve.edu04.Main;

public class HomeWork3Main {

    public static void main(String[] args) {

        // Task 1.1 Read 3 float numbers and check: are they all belong to the range [-5,5];

        FloatNumbers floatNumbers = new FloatNumbers(new float[3]);
        floatNumbers.setNumbers();
        floatNumbers.checkNumbers();

        // Task 1.2 Read 3 integer numbers and write max and min of them;

        IntegerNumbers integerNumbers = new IntegerNumbers(new int[3]);
        integerNumbers.setNumbers();
        integerNumbers.displayResult();

        // Task 1.3 read number of HTTP Error (400, 401,402, ...) and write the name of this error
        //          (Declare enum HTTPError)

        HTTPError.findErrorName();

        // Task 2. Create class Dog with fields name, breed, age.
        //         -Declare enum for field breed.
        //         -Create 3 instances of type Dog.
        //         -Check if there is no two dogs with the same name.
        //         -Display the name and the kind of the oldest dog.

        task2Realization();

    }

     static void task2Realization() {
        Dog luna = new Dog("Luna", DogsBreeds.LABRADOR_RETRIEVER, 5);
        Dog charlie = new Dog("Charlie", DogsBreeds.GERMAN_SHEPHERD_DOG, 7);
        Dog daisy = new Dog("Daisy", DogsBreeds.POODLE, 3);

        // In next code, i'm comparing dog names

        Dog[] dogs = {luna, charlie, daisy};
        int counter = 0;
        for (int i = 0; i < dogs.length; i++){
            for (int j = 0; j < dogs.length; j++){
                if (dogs[i].getName().equals(dogs[j].getName())){
                    counter++;
                }
            }
        }
        if (counter != dogs.length){
            System.out.println("There are dogs with the same names");
        } else {System.out.println("There are no dogs with the same names");}

         // In next code, i'm displaying the name and the kind of the oldest dog.

         Dog template = new Dog("", DogsBreeds.POODLE, 0);
         for (int i = 0; i < dogs.length; i++){
             if (template.getAge() < dogs[i].getAge()){
                 template = dogs[i];
             }
         }
         System.out.println("The oldest dog name is " + template.getName() + ", his breed is " +
                 DogsBreeds.getBreedName(template.getBreed().toString()));

    }
}