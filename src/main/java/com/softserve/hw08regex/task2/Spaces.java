package com.softserve.hw08regex.task2;

import java.util.Scanner;

public class Spaces {

    public void coverSpaces(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence");
        String s = sc.nextLine();
        s = s.replaceAll("( )+", " ");
        System.out.println(s);
    }
}
