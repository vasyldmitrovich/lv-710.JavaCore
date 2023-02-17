package com.softserve.edu04.hm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.softserve.edu04.hm.HTTPError.*;
// я роблю все в статичному методі, це ок?
// READY !!
public class HTTPErrorDemo {

    public static void checkHTTPError() throws IOException {

        System.out.println("Enter the error number");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HTTPError error400 = Error400;
        HTTPError error401 = Error401;
        HTTPError error402 = Error402;
        HTTPError error403 = Error403;
        HTTPError error404 = Error404;
        HTTPError error405 = Error405;
        HTTPError error406 = Error406;
        HTTPError error407 = Error407;
        HTTPError error408 = Error408;
        HTTPError error409 = Error409;
        HTTPError error410 = Error410;

        HTTPError httpError[] = new HTTPError[]{
                error400, error401, error402, error403, error404, error405, error406, error407, error408, error409, error410};

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

    public static void main(String[] args) throws IOException {
        checkHTTPError();
    }
}
