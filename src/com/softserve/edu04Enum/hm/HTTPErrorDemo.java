package com.softserve.edu04Enum.hm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.softserve.edu04Enum.hm.HTTPError.*;
// READY !!
public class HTTPErrorDemo {
    public static void runMyApp() throws IOException {
        checkHTTPError(returnErrorNumber());
    }

    public static void checkHTTPError(int n) throws IOException {
        HTTPError httpError[] = new HTTPError[]{Error400, Error401, Error402, Error403,
                Error404, Error405, Error406, Error407, Error408, Error409, Error410};
        int i;
        boolean b = true;
        boolean b1 = false;
        for (i = 0; i < httpError.length; i++) {
            if (n == httpError[i].getNumber()) {
                System.out.println(httpError[i].getName());
                System.exit(0);
            }
        }
        System.out.println("You entered a wrong error number or there is no such error");
    }

    public static int returnErrorNumber() throws IOException {
        System.out.println("Enter the error number");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        System.out.println("Error number = " + number);
        return number;
    }

    public static void main(String[] args) throws IOException {
        runMyApp();
    }
}
