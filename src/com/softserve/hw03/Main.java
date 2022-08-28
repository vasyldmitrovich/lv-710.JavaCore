package com.softserve.hw03;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Person p1 = new Person();
        p1.input();
        Person p2 = new Person();
        p2.input();
        Person p3 = new Person("Ivan", "Pupkin");
        Person p4 = new Person("Jason", "Stathem");
        Person p5 = new Person("Some", "Body");
        System.out.println(p1);
        System.out.println("His age is: " + p1.getAge());
        System.out.println(p2);
        System.out.println("His age is: " + p2.getAge());
        System.out.println(p3);
        System.out.println("His age is: " + p3.getAge());
        System.out.println(p4);
        System.out.println("His age is: " + p4.getAge());
        p5.changeName("Ivan", "");
        System.out.println(p5);
        p5.changeName("", "Pyatochkin");
        System.out.println(p5);
        System.out.println("His age is: " + p5.getAge());
    }
}
