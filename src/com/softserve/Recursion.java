package com.softserve;

public class Recursion {
    public static void main(String[] args) {
        counter(17);
    }

    private static void counter(int n) {
        System.out.println(n);
        if (n == 0){
            return;
        }
        counter(n-1);
    }
}

