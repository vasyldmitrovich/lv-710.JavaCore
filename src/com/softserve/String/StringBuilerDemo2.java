package com.softserve.String;

public class StringBuilerDemo2 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("I Ukraine!!!");
        StringBuilder stringBuilder2 = new StringBuilder("0123456789");
        System.out.println(stringBuilder.insert(1, " like"));
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder2.delete(1,5));
        System.out.println(stringBuilder2.deleteCharAt(5));

        StringBuilder stringBuilder3 = new StringBuilder("I like Ukraine!!!");
        System.out.println(stringBuilder3.replace(0,1, "You"));

        StringDemo();

    }
    private static void StringDemo (){
        StringBuilder stringBuilder3 = new StringBuilder("2 + 3 = 5");
        stringBuilder3.deleteCharAt(6);
        stringBuilder3.insert(6, "равно");
        System.out.println(stringBuilder3);

    }
}
