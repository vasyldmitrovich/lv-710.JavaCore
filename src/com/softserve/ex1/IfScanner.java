package com.softserve.ex1;

import java.io.IOException;

public class IfScanner
{

        public static void main(String[] args) throws IOException {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.println("введите ваше  число");
            if (scanner.hasNextInt()) {
//            System.out.println("больше 100");
                newMethod(scanner);
            } else {
                System.out.println("не целое");
            }
        }
        private static void newMethod(java.util.Scanner scanner) {
            int numb = scanner.nextInt();
            if (numb > 500 && numb < 1000) {
                System.out.println("между 500 и 1000");
            } else {
                System.out.println("больше 1000");
            }
        }
    }
