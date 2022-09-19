package com.softserve.edu15.Tasks;

import java.util.Arrays;

//        In England the currency is made up of pound, £, and pence, p, and there are eight coins
//        in general circulation: 1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).
//        It is possible to make £2 in the following way: 1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p.
//        How many different ways can £2 be made using any number of coins?
public class Task14 {
    public static void run(){
        int target  = 200;
        int ways = 0;

        for (int a = target; a >= 0; a -= 200) {
            for (int b = a; b >= 0; b -= 100) {
                for (int c = b; c >= 0; c -= 50) {
                    for (int d = c; d >= 0; d -= 20) {
                        for (int e = d; e >= 0; e -= 10) {
                            for (int f = e; f >= 0; f -= 5) {
                                for (int g = f; g >= 0; g -= 2) {
                                    ways++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ways);

        int[] coinSizes = { 1, 2, 5, 10, 20, 50, 100, 200 };
        int[] wayss = new int[target+1];
        wayss[0] = 1;

        for (int i = 0; i < 8; i++) {
            for (int j = coinSizes[i]; j <= target; j++) {
                wayss[j] += wayss[j - coinSizes[i]];
            }
        }
        System.out.println(Arrays.toString(wayss));

    }
}
