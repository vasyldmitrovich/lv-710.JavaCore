package com.softserve.hw04;


public class DogsUtil {
    public static boolean hasSameName(Dog dog1, Dog dog2) {
        return dog1.getName().equals(dog2.getName());
    }

    public static Dog findOldestDog(Dog[] dogs) {
        Dog oldestDog = null;


        for (int i = 0; i < dogs.length; i++) {

            Dog dog = dogs[i];
            if (oldestDog == null
                    || dog.getAge() > oldestDog.getAge()) {

                oldestDog = dog;
            }
        }
        return oldestDog;
    }

}