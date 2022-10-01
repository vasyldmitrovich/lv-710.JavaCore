package com.softserve.hw04;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.NoSuchElementException;

import static com.softserve.hw04.HTTPStatusCodes.HTTP_STATUS_CODE100;

public class Main {

    private static final Calculations calculations = new Calculations();
    private static final HTTPFunctionality f = new HTTPFunctionality();

    private static int[] values = {23, 12, 13, 17, 12, 23, 19, 11};

    public static void main(String[] args) {
        task1();
        task2();
        System.out.println(methodName(4, 3));
    }

    public static Integer methodName(Integer x, Integer y) {
        return y != 0 ? x + methodName(x, y - 1) : 0;
    }


    public static void task1() {
        // Float value belongs to the range [-5;5]
        calculations.range(6.2f, 3.3f, -6.2f);

        //Maximum integer value
        calculations.maxInt(2, 3, 4, 6, 1, 6, 9);

        System.out.println("Minimum value in the array is equal to: " + Arrays.stream(values).min().getAsInt());

        f.readError(HTTP_STATUS_CODE100);
    }

    public static void task2() {
        //Good
        Dog d = new Dog();
        Dog dog1 = new Dog("Rogger", Breed.LABRADOR_RETRIEVER, 1);
        Dog dog2 = new Dog("Ice", Breed.GERMAN_SHEPHERD, 4);
        Dog dog3 = new Dog("Collin", Breed.HUSKY, 6);
        Dog dog4 = new Dog("Ice", Breed.GERMAN_SHEPHERD, 3);

        //Duplicate element from array
        d.getDuplicates(dog1, dog2, dog3, dog4);

        // Duplicates with Streams
        System.out.println("Duplicated element in the array is: " + d.findDuplicates(d.dogsCollection(dog1.getBreed(), dog2.getBreed(), dog3.getBreed(), dog4.getBreed())));

        // Oldest dog
        Map<String, Integer> map = d.dogsToMap(dog1, dog2, dog3, dog4);
        System.out.println("The oldest dog is: " + d.maxUsingIteration(map));

        // Oldest dog with Streams
        Dog maxAge = d.dogsCollection(dog1, dog2, dog3, dog4)
                .stream()
                .max(Comparator.comparing(Dog::getAge))
                .orElseThrow(NoSuchElementException::new);
        System.out.println("The oldest dog is: " + maxAge.getName() + " - " + maxAge.getAge());
    }
}
