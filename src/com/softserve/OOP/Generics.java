package com.softserve.OOP;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List<Integer> x = new ArrayList<>();
        int a = 5;
        x.add(a);
        x.add(a + 2);
        x.add(a + 4);
        x.add((int)2.9);

        int y = x.get(3);
        System.out.println(y);

        int r = 23;
        Integer e = r;
        int f = e;


        List u = new ArrayList();
        u.add(a);
        u.add(a + 2);
        u.add(a + 4);
        u.add(2.9);

        int k = (int) u.get(2);
        System.out.println(k);



    }


}