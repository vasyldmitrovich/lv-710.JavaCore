package com.softserve.OOP;


public class StringBuilder1 {
    public static void main(String[] args) {


//    StringBuilder sb = new StringBuilder();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("hello ");
        stringBuilder.append("world");
        System.out.println(stringBuilder + " ee");
        System.out.printf("String %10s", "10.5");
        System.out.println();
        System.out.printf("String %f \n", 10000000000.5);
        System.out.printf("String %.1f", 10000000000.5);

    }
}
