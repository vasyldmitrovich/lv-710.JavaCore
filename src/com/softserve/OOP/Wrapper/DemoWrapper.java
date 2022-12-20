package com.softserve.OOP.Wrapper;

import com.sun.jdi.LongValue;

public class DemoWrapper {
    public static void go(Long x) {
        System.out.println(x);
    }

    String s(short sh) {
        System.out.println();
        return null;
    }

    short s(String sh) {
        System.out.println();
        return 0;
    }

    public static void goB(Byte x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        byte b = 18;
        Byte b1 = b;
        long l = 16;

        go(b1.longValue());
        go((long) b);
        goB((byte) l);


        Byte bOb = 12;
        long lPr = bOb.longValue();
        Long lOb = lPr;
        System.out.println(bOb.equals(lOb));
    }
}

