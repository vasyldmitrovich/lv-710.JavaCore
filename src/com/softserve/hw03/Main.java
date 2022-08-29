package com.softserve.hw03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static Person newPerson() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first name:");
        String tempFirstName = br.readLine();
        System.out.println("Enter last name:");
        String tempLastName = br.readLine();
        System.out.println("Enter birth year:");
        int tempBirthYear = Integer.parseInt(br.readLine());
        Person tempP = new Person(tempFirstName,tempLastName);
        tempP.setBirthYear(tempBirthYear);
        return tempP;
    }
    public static void main(String[] args) throws IOException {
        Person p1 = new Person();
        p1.input();
        Person p2 = new Person();
        p2.input();
        Person p3 = newPerson();
        Person p4 = newPerson();
        Person p5 = newPerson();
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
