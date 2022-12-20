package com.softserve.OOP.Static;

public class Test {
    int a = 3;
    static int b = 4;

    public static void test(int a) {
        System.out.println("статический метод " + a);
    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.a + " " + b);
        test(8);
    }
}

