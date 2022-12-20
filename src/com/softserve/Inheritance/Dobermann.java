package com.softserve.Inheritance;

public class Dobermann extends Dog {
    public static void main(String[] args) {
        String name;
        Dobermann Doby = new Dobermann();
        Dog Jack = new Dobermann();
//        Dobermann Bob = (Dobermann) new Dog();
        Doby.eat();
        Doby.dogVoice();
        Doby.voice();
        Doby.name();
        System.out.println();
//        Jack.byte1();
        Doby.byte1();
        Jack.dogVoice();

        test(Doby);
        test(Jack);
    }


    public void name() {
        name.append(" some dobermann");
        System.out.println(name);
    }

    public void eat() {
        super.eat();
        System.out.println("I am eating meat\n");
    }

    public void byte1() {
        System.out.println("I am byting meat\n");
    }

    public static void test(Animal animal) {
animal.eat();
    }


}
