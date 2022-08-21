package com.company;

import java.util.Scanner;

public class AddressBook {
    String name, address;
    Scanner input = new Scanner(System.in);

    public String setName(){
        System.out.println("What is your name?");
        this.name = input.nextLine();
        return name;
    }

    public String setAddress(){
        System.out.println("Where do you live " + name + "?");
        this.address = input.nextLine();
        return address;
    }

    public void getAllInformation(){
        System.out.println(name + " is living in " + address);
    }
}
