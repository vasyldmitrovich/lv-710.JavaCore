package com.softserve.ex1;

public class Return {
    public static void main(String[] args) {
        double d = 0;
        int i;
        for (i = 0; i < 5; i++) {
            d = getRandomValue();
            System.out.println(d);
            System.out.println(i);
        }


    }

    static double getRandomValue() {
        return Math.random() * 3;
    }
}

//            for (int i = 0; i < 7; i++) {
//                System.out.println("Do job inside for loop");
//                return;

//        }
//    }
//}