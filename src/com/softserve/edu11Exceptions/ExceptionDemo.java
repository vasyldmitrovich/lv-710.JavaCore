package com.softserve.edu11Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            System.out.println(div((returnDoubleValue("Input double number")), returnDoubleValue("Input double number")));
        } catch (ArithmeticException e) {
            throw new ArithmeticException("div by zero");
        } catch (RuntimeException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(" same error");
        } finally {
            System.out.println("finish method");
        }
    }

    public static double div(double d1, double d2) throws ArithmeticException {
        return d1 / d2;
    }

    public static Double returnDoubleValue(String s) throws IOException {
        System.out.println(s);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Double result = 0.0;
        try {
            result = Double.valueOf(((br.readLine())));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("You input wrong data, you need to enter digital double values");
            System.exit(2);
        }
        return result;
    }
}
