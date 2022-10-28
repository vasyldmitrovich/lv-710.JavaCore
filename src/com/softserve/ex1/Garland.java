package com.softserve.ex1;


public class Garland {
    public static void main(String[] args) {

//        Scanner scanner1 = new Scanner(System.in);
//        String n = scanner1.next
//        System.out.println();
        int girlanda = 3791;
//        System.out.println("какие лампы включены = " + Integer.toBinaryString(girlanda)); // цикл

        int girlanda1 = ~girlanda;
        System.out.println("мигают лампочки = " + girlanda1); // цикл
        for (int i = 0; i < 10; i++) {
            {
                if (i % 2 == 0) {
                    System.out.println(girlanda1);
                } else {
                    System.out.println(girlanda);
                }
            }


        }


        var miganie = girlanda >> 2;
        var miganieobr = miganie << 1;
        for (int i = 0; i < 10; i++) {
            {
                if (i % 2 == 0) {
                    System.out.println(miganie);
                } else {
                    System.out.println(miganieobr);
//
//        int maska = girlanda & 1;
//        int provPervStr = girlanda & 1;
//        int result = girlanda & maska;  // маска с помощью &
//        System.out.println("значение 1 лампочки в 2ной: " + Integer.toBinaryString(maska));
//        System.out.println("значение 1 лампочки в 10ной: " + maska);


                }
            }
        }
    }
}