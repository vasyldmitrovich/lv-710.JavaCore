package com.softserve.AbstractClass;

public class Cat extends Animal implements TestInt, NewInt {
    int i;

    @Override
    public void makeSound() {
        System.out.println("meow");
    }

    public static class Wool {
        static int r;

        public void rolling() {
            System.out.println(r + "Cat is roll a wool");
        }
    }

    @Override
    public void sleep() {
        final int w = 0;

        class Newclass {
            public void someMethod() {
                System.out.println(w + i);
            }
        }
        System.out.println(w + "I am sleeping");
        Newclass oc = new Newclass();
        Method(oc);
    }

    public void Method(Object object) {
    }
}
