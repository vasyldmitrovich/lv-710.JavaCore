package com.softserve.hw13.Tasks;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void run() {
        List<String> list1 = new ArrayList<>();

        list1.add("efgregr");
        list1.add("sdfbdgnbtn");
        list1.add("rebtb");
        list1.add("rgbrt");
        list1.add("rfbv");
        list1.add("evrbrgbgb");
        list1.add("refv");
        list1.add("eb");
        list1.add("ebbee");
        list1.add("err");
        List<String> list2 = new ArrayList<>(list1);
        list2.removeIf(o -> o.length() > 5);
        System.out.println(list1);
        System.out.println(list2);
    }
}
