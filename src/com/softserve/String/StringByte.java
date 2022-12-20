package com.softserve.String;

public class StringByte {
    public static void main(String[] args) {
        byte[] bytes = {45, 46, 47, 48};
        String string1 = new String(bytes);
        System.out.println(string1);

        String string2 = new String(bytes,1,2);
        System.out.println(string2);
    }
}
