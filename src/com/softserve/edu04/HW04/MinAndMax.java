package com.softserve.edu04.HW04;

public class MinAndMax {
    public static void main(String[] args) {
        int x = 1000;
        int y = 444;
        int z = 1005;
        if (x > y && x > z) {
            System.out.println( x + " - найбільше число ");
        }
        if (y > x && y > z) {
            System.out.println( y + "- найбільше число ");
        }
        if (z>x && z>y) {
            System.out.println( z + " - найбільше число ");
        }if (z<x && z<y) {
            System.out.println( z + " - найменше число ");
        }
        if (x < y && x < z) {
            System.out.println(x + " - найменше число ");
        }
        if (y < x && y < z) {
            System.out.println(y + "- найменше число ");
        }
    }
    };