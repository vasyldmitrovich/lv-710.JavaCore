package com.softserve.hw08regex.task1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class DisplayLongestWordLength {

    public static void main(String[] args)
    {
        longestWordLength();
    }

    public static void longestWordLength(){
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence");
        s = sc.nextLine();
        s = s.trim();
        s = s+" ";
        String longest = Arrays.stream(s.split(" "))
                .max(Comparator.comparingInt(String::length)).orElse(null);
        System.out.println(longest);
    }
}
