package com.softserve.String;

public class ComparisonSubstring {
    public static void main(String[] args) {
        System.out.println("Football".endsWith("all"));
        System.out.println("Football".startsWith("Foo"));
        System.out.println("Hello, Football".contains("tb"));
        System.out.println("Hello, Football".regionMatches(6, " Footvett", 0, 5));

        substring("I like Java!!!");
    }

    public static void substring(String str1) {
        String str2 = "Dnipro";
        System.out.println("start method 'substring'");
        System.out.println(str1.endsWith("!!!"));
        System.out.println(str1.startsWith("I like"));
        System.out.println(str1.contains("Java"));
        System.out.println(str1.compareTo(str2));

    }
}
