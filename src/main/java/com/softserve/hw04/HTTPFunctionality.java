package com.softserve.hw04;

import static com.softserve.hw04.HTTPStatusCodes.*;

public class HTTPFunctionality {

    public void readError(HTTPStatusCodes error) {
        switch (error) {
            case HTTP_STATUS_CODE100:
                System.out.println(HTTP_STATUS_CODE100.getStatusCodes() + " - Informational responses");
                break;
            case HTTP_STATUS_CODE200:
                System.out.println(HTTP_STATUS_CODE200.getStatusCodes() + " - Successful responses");
                break;
            case HTTP_STATUS_CODE300:
                System.out.println(HTTP_STATUS_CODE300.getStatusCodes() + " - Redirection message");
                break;
            case HTTP_STATUS_CODE400:
                System.out.println(HTTP_STATUS_CODE400.getStatusCodes() + " - Client error responses");
                break;
            case HTTP_STATUS_CODE500:
                System.out.println(HTTP_STATUS_CODE500.getStatusCodes() + " - Server error responses");
                break;
        }
    }
}
