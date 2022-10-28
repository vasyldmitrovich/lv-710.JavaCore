package com.softserve.ex1;

public class BreakDemo {
    public static void main(String[] args) {
//        for (int i = 0, t = 7; (t <= 10 | i <= 20); i = i +3, t++) {
        out:
        for (int i = 1; i <= 5; i++) {
            System.out.print("столбец" + i + " ");
            for (int j = 1; j <= 10; j++) {
                if (j == 10) {
                    break out;
//            System.out.println(i + " " + t);
                }
                System.out.print(j + " ");
            }
                System.out.println();
            }
        System.out.println("конец цикла");
        }
    }
