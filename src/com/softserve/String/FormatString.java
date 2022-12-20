package com.softserve.String;

import java.util.Formatter;

import static java.lang.String.format;

public class FormatString {
    public static void main(String[] args) {
        double x = 1000.0/3.0;
        System.out.println("без форматирования: " + x);

        Formatter f = new Formatter();
        f.format("с форматированием:  %f\n", x);
        f.format("с форматированием:  %.2f\n", x);
        f.format("с форматированием:  %8.2f\n", x);
        f.format("с форматированием:  %50.2f\n", x);
        System.out.println(f);

        System.out.printf("%,.2f\n", 10000.0/3.0);




        formatMetodh("like", "Ukraine", '!');
    }

    private static void formatMetodh(String s, String s1, char c1) {
        System.out.println(format("I %4s my motherland %S %nso much%-4c", s, s1, c1));
        System.out.printf("I %4s my motherland %S %nso much%4c", s, s1, c1);

    }
}
