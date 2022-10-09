package com.softserve.hw04;

public class Main {
    public static void main(String[] args) {
        Check first = new Check();

/*        first.check();
        first.maxmin();
        first.errorCode();*/

        Dog dog1 = new Dog("Lee", Dog.Breed.AKITA, 2);
        Dog dog2 = new Dog("Charlie", Dog.Breed.SPANIEL, 4);
        Dog dog3 = new Dog("Jackie", Dog.Breed.FRENCH_BULLDOG, 3);

        sameName(dog1, dog2, dog3);
        olderDog(dog1, dog2, dog3);
    }

    private static void sameName(Dog d1, Dog d2, Dog d3) {
        if (d1.name.equals(d2.name)|| d1.name.equals(d3.name) || d2.name.equals(d3.name))
        System.out.println("Name is the same");
        else{
            System.out.println("There are no dogs with the same name");
        }
    }

    private static void olderDog(Dog d1, Dog d2, Dog d3) {
        if (d1.age > d2.age && d1.age > d3.age)
            System.out.println("The oldest dog is: " + d1.name);
        else {
            if (d2.age > d1.age && d2.age > d3.age)
                System.out.println("The oldest dog is: " + d2.name);
            else
                System.out.println("The oldest dog is: " + d3.name);
        }
    }
}




