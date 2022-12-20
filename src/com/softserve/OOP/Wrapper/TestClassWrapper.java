package com.softserve.OOP.Wrapper;

public class TestClassWrapper {
    public static void main(String[] args) {


        Integer iOb = 300;
        int i = iOb;
        System.out.println(iOb + " " + i);
        Double d = new Double("19.5") + new Double(12.5);
        Double d1 = new Double(4.3);
        System.out.println(d);
        System.out.println();
        Boolean b = new Boolean("ffjnfjrn");
        System.out.println(b);
        Byte by = new Byte("4");
        Byte by1 = new Byte((byte) 6);
        System.out.println(by1);

        Long l = Long.parseLong("100");
        Long l1 = Long.valueOf("100");
        System.out.println();

        System.out.println("toString");
        String string = Double.toString(10.44);
        System.out.println(string);
        String string1 = Long.toString(252,16);
        System.out.println(string1);
        System.out.println();

        String string2 = Long.toOctalString(45);
        System.out.println(string2);

        System.out.println(l + " " + l1);

        System.out.println(Double.valueOf("10.5"));
        System.out.println(Byte.valueOf(String.valueOf(10),16));


    }


}