package com.softserve.hw04;

import com.softserve.hw04.dog.Breed;
import com.softserve.hw04.dog.Dog;
import com.softserve.hw04.dog.DogsUtil;

public class TasksRunner {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        float minRange = -5.0F;
        float maxRange = 5.0F;
        float checkNumber1 = 6.0F;
        float checkNumber2 = -7.0F;
        float checkNumber3 = 4.2F;
        boolean result1 = NumbersUtil.isBelongToTheRange(checkNumber1, minRange, maxRange);
        boolean result2 = NumbersUtil.isBelongToTheRange(checkNumber2, minRange, maxRange);
        boolean result3 = NumbersUtil.isBelongToTheRange(checkNumber3, minRange, maxRange);


        String msg  = "This number: %s is belong to the range [%s,%s] is %s";
        System.out.println(msg.formatted(checkNumber1, minRange, maxRange, result1));
        System.out.println(msg.formatted(checkNumber2, minRange, maxRange, result2));
        System.out.println(msg.formatted(checkNumber3, minRange, maxRange, result3));


    }
    public static void task2() {
        Integer[] numbers1 = new Integer[]{67, 9, -6, 44};

        System.out.println("Max number is: " + NumbersUtil.findMaxNumber(numbers1));
        System.out.println("Min number is: " + NumbersUtil.findMinNumber(numbers1));

    }
    public static void task3() {
        int errorNumber1 = 400;
        int errorNumber2 = 401;
        int errorNumber3 = 402;
        String msg = "HTTP error is: %s. Number is %s";
        System.out.println(msg.formatted(HTTPError.getByNumber(errorNumber1).getName(), errorNumber1));
        System.out.println(msg.formatted(HTTPError.getByNumber(errorNumber2).getName(), errorNumber2));
        System.out.println(msg.formatted(HTTPError.getByNumber(errorNumber3).getName(), errorNumber3));

    }

    public static void task4() {
        Dog dog1 = new Dog("Toby", Breed.MALTIPOO, 2);
        Dog dog2 = new Dog("Barsik", Breed.PITBULLTERRIER, 4);
        Dog dog3 = new Dog("Lord", Breed.LABRADOR, 1);

      Dog[] dogs = new Dog[]{dog1, dog2, dog3};

      boolean result = DogsUtil.hasSameName(dog1, dog2);
      Dog oldestDog = DogsUtil.findOldestDog(dogs);
        System.out.println("This dogs %s and %s have same name  ".formatted(dog1, dog2) + result);
        System.out.println("The oldest com.softserve.hw04.dog is " + oldestDog);
    }

}
