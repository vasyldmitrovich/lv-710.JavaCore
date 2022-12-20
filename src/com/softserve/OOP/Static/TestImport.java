package com.softserve.OOP.Static;

import static com.softserve.OOP.Static.Test.test;
import static com.softserve.OOP.Static.Test.b;

public class TestImport {
    public static void main(String[] args) throws CloneNotSupportedException {
        test(6);
        System.out.println(b);

        TestImport testImport = new TestImport();
        System.out.println(testImport.toString());

        System.out.println(testImport.clone().toString());
    }
}

