package com.softserve.String;

public class StringDemo {
    public static void main(String[] args) {

        String str1 = new String();
        System.out.println("str1: [" + str1 + "]");

        char [] ch1 = {'a', 'b', 'c'};
        String str2 = new String(ch1);
        System.out.println("str2: " + str2);

        char [] ch2 = {'a', 'b', 'c','d','e'};
        String str3 = new String(ch2,2,3);
        System.out.println("str3: " + str3);

        String str4 = "x y z";
        System.out.println("str4: " + str4);
        System.out.println(str4.length());
        System.out.println("x y z".length());

        String str5 = new String(str4);
        System.out.println("str5: " + str5);
        System.out.println(str5==str4);
        System.out.println(str5.equals(str4));

        String str6 = "x y z!";
        String str7 = "x y z!";
        System.out.println(str6==str7);

        String w = null;
        System.out.println(w);
    }
}
