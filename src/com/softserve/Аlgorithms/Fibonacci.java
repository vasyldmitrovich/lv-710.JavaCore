package com.softserve.Аlgorithms;

public class Fibonacci {
    public static void main(String[] args) {


//        public static long calculateWithFor( int n) {
        long n;
        n = 10;
        long first = 0;
        long second = 1;
        long result = n;
        for (int i = 0; i < n; i++) {
            result = first + second;
            first = second;
            second = result;
//        return result;
            System.out.println(result);
        }
    }
}
