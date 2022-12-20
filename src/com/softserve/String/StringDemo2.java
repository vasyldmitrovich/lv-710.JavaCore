package com.softserve.String;

import static java.lang.String.join;
import static java.lang.String.valueOf;

public class StringDemo2 {
    public static void main(String[] args) {
        char ch = "abc".charAt(2);
        System.out.println(ch);

        System.out.println("I like Java!!!".indexOf("a"));
        System.out.println("I like Java!!!".lastIndexOf("a"));
        System.out.println("I like Java!!!".concat(" Do you like?"));
        System.out.println("I like Java!!!".replace('i', 'e'));
        System.out.println("I like Java!!!".replaceFirst("i", "a"));
        System.out.println("I like Java!!!".toLowerCase());
        System.out.println("I like Java!!!".toUpperCase());
        System.out.println("   I like Java!!!   ".trim() + "rrr");
        System.out.println("I like Java!!!   ".substring(6));
        System.out.println("   I like Java!!!   ".isEmpty());
        System.out.println("   I like Java!!!   ".isBlank());
        System.out.println(valueOf(3) + "rrr");
        System.out.println(join("...", "rrr", "ttt", "yyy"));

        String r = "eeee";
        r.toUpperCase();
        System.out.println(r.replace("E","e"));

        String s = new String("rrr");
        s.toUpperCase();
        System.out.println(s);

        Integer i = new Integer(5);
        Integer.valueOf("6");
        System.out.println(i);



    }
}