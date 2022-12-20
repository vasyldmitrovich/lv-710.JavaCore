package com.softserve.ex1;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;


public class Scanner {
    public Scanner(InputStream in) {
    }

    public Scanner(File file) {
    }

    public static void main(String[] args) throws IOException {
        String r = "ddd";
        String t = "ddd";
        System.out.println(r.equals((t)));
        System.out.println(Objects.equals(r, t));
        System.out.println(r.length());
        int g = 888;
        System.out.println(Integer.toBinaryString(g));

        int a = 1;
        int b = 10;
        if (a == 1 ^ b != 10) {
            int i = -4;
            var k = i > 0 ? i : -i;

            char x = 'a';
            x++;
            System.out.println("модуль числа = ");
            System.out.println(b);
        }
//
        Scanner scanner = new Scanner(System.in);
        int x = System.in.read();
        char y = (char) x;
        System.out.println("число = " + y + x);
//        scanner.close();
//
//            Scanner scanner = new Scanner(System.in);
//        String str = scanner.next();
//
//            System.out.println("Положительное число больше 10 или отрицательное");
//
//            if (scanner.hasNextInt()) {
//                int x = scanner.nextInt();
//                int y = scanner.nextInt();
//                System.out.println("спасибо, вот ваше число: " + x);
//            } else
//                System.out.println("ошибка, ви ввели не целое число");
//
//            Scanner systemInScanner = new Scanner(System.in);
//
//            int integerValue = systemInScanner.nextInt();
//            long longValue = systemInScanner.nextLong();
//            float floatValue = systemInScanner.nextFloat();
//            double doubleVar = systemInScanner.nextDouble();
//
//            String stringValue = systemInScanner.next();
//            systemInScanner.close();
//
//            System.out.print("Example of test input:");
//
//            System.out.println("integerValue:" + integerValue);
//            System.out.println("longValue:" + longValue);
//            System.out.println("floatValue:" + floatValue);
//            System.out.println("doubleVar:" + doubleVar);
//            System.out.println("stringValue:" + stringValue);
//        }
    }

}
