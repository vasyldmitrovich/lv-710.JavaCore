package com.softserve.ex1;

public class Lamps {
    public static void main(String[] args) {

        int chetnost = -432 & 1;
        int umnNa2 = -5 << 1;
        int delNa2 = 9 >> 1;
        System.out.println("деление на 2 = " + Integer.toBinaryString(delNa2)); // цикл

        int XOR = 560 ^ 12;
        int XOR2 = 12 ^ 572;
        int bit = 001001;
        int proverka = 100111 & 000111;
        int i = 46466;
        byte h = (byte) i;
        int u1;
        u1 = 555;
        byte r = (byte) (u1 << 1);
        u1 &= i;
        System.out.println("qq" + u1);

        System.out.println(Integer.toBinaryString(h));
        System.out.println(h);


        int a = i >> 1;
        System.out.println(Integer.toBinaryString(a));

        int t = i << 1;
        System.out.println(Integer.toBinaryString(t));

        byte b = (byte) t;
        System.out.println("rr " + Integer.toBinaryString(b));
        System.out.println(b);

        System.out.println(Integer.toBinaryString(chetnost));
        System.out.println(Integer.toBinaryString(umnNa2));
        System.out.println(umnNa2);
        System.out.println(delNa2);
        System.out.println("пробел");

        System.out.println(XOR);
        System.out.println(XOR2);
        System.out.println(bit);
        System.out.println("proverka = " + Integer.toBinaryString(proverka));
        System.out.println("proverka = " + proverka);

    }
}
