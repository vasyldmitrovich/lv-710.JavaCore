package com.softserve.edu10Regex.practik;

public class SubstringDemo {
    public static void main(String[] args) {
        System.out.println(checkStrings("SoftServe Academy", "SoftServe"));
    }

    public static Boolean checkStrings(String s1, String s2) {
        Boolean result = s1.contains(s2);
        System.out.print("The first line has a second line in it: ");
        return result;
    }
}
