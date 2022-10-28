package com.softserve.ex1;

public class Continue {
//  Continue  public static void main(String[] args) {
//        for (int i = 1; i < 10; i++) {
//            if (i % 2 != 0) {
//                continue;
//
//            }
//            System.out.println(i);
//        }
//
//
//    }
//}

    //class Test {
    public static void main(String[] args) {
        int i = 0;
        outer:
        while (true) {
            i++;
            inner:
            for (int j = 0; j < 10; j++) {
                i += j;
                if (j == 3) {
//                    continue inner;

                    break outer;
                }
                continue outer;
            }
            System.out.println(i);
        }
    }
}