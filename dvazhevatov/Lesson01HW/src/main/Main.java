package main;

import bio.Bio;
import calls.Calls;
import circle.Circle;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String readInputString() {
        try {
            return br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Double readInputDouble() {
        try {
            return Double.parseDouble(br.readLine());
        } catch (NumberFormatException e) {
            System.out.println("try again");
            return readInputDouble();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static int readInputInt() {
        try {
            return Integer.parseInt(br.readLine());
        } catch (NumberFormatException e) {
            System.out.println("try again");
            return readInputInt();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Bio.getBio();

        Circle.getCircle();

        Calls.getCallReport();

    }
}
