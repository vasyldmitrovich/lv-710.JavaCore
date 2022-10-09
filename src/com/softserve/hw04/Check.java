package com.softserve.hw04;

import java.util.Scanner;
public class Check {

    //Task 1.1
    public void check() {
        Scanner sc = new Scanner(System.in);
        float[] arr = new float[3];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter float number: ");
            arr[i] = sc.nextFloat();
        }
        // return arr;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] >= -5 && arr[j] <= 5) {
                count += 1;
            }
        }
        if (count == arr.length) {
            System.out.println("All numbers are in range [-5; 5]");
        }else {
            System.out.println("Some numbers are out of range [-5; 5]");
        }

    }

    //Task 1.2
    public void maxmin(){
        int[] array = new int[3];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter an Integer: ");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i]>max) {
                max = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Maximum number is: " + max + "\n" + "Minimum number is: " + min);
    }

    //Task 1.3
    static void errorCode(){
        System.out.println("Please enter an error code: ");
        Scanner sc = new Scanner(System.in);
        int code = sc.nextInt();

        switch (code){
            case 400:
                HTTPError badRequest = HTTPError.BAD_REQUEST;
                System.out.println(badRequest);
                break;
            case 401:
                HTTPError unauthorazied = HTTPError.UNAUTHORAZIED;
                System.out.println(unauthorazied);
                break;
            case 402:
                HTTPError paymentRequired = HTTPError.PAYMENT_REQUIRED;
                System.out.println(paymentRequired);
                break;
            case 403:
                HTTPError forbidden = HTTPError.FORBIDDEN;
                System.out.println(forbidden);
                break;
            case 404:
                HTTPError notFound = HTTPError.NOT_FOUND;
                System.out.println(notFound);
                break;
            case 405:
                HTTPError methodNotAllowed = HTTPError.METHOD_NOT_ALLOWED;
                System.out.println(methodNotAllowed);
                break;
            case 406:
                HTTPError notAcceptable = HTTPError.NOT_ACCEPTABLE;
                System.out.println(notAcceptable);
                break;
            case 407:
                HTTPError proxyAuthentificationRequired = HTTPError.PROXY_AUTHENTICATION_REQUIRED;
                System.out.println(proxyAuthentificationRequired);
                break;
            case 408:
                HTTPError requestTimeout = HTTPError.REQUEST_TIMEOUT;
                System.out.println(requestTimeout);
                break;
            case 409:
                HTTPError conflict = HTTPError.CONFLICT;
                System.out.println(conflict);
                break;
            case 410:
                HTTPError gone = HTTPError.GONE;
                System.out.println(gone);
                break;
            case 411:
                HTTPError lengthRequired = HTTPError.LENGTH_REQUIRED;
                System.out.println(lengthRequired);
                break;
            case 412:
                HTTPError preconditionFailed = HTTPError.PRECONDITION_FAILED;
                System.out.println(preconditionFailed);
                break;
            case 413:
                HTTPError payloadTooLarge = HTTPError.PAYLOAD_TOO_LARGE;
                System.out.println(payloadTooLarge);
                break;
            case 414:
                HTTPError URItooLong = HTTPError.URI_TOO_LONG;
                System.out.println(URItooLong);
                break;
            case 415:
                HTTPError unsupportedMediType = HTTPError.UNSUPPORTED_MEDIA_TYPE;
                System.out.println(unsupportedMediType);
                break;
            case 416:
                HTTPError rangeNotSatisfiable = HTTPError.RANGE_NOT_SATISFIABLE;
                System.out.println(rangeNotSatisfiable);
                break;
            case 417:
                HTTPError expectationFailed = HTTPError.EXPECTATION_FAILED;
                System.out.println(expectationFailed);
                break;
            case 418:
                HTTPError iAmATeapot = HTTPError.I_AM_A_TEAPOT;
                System.out.println(iAmATeapot);
                break;
            case 421:
                HTTPError misdirectedRequest = HTTPError.MISDIRECTED_REQUEST;
                System.out.println(misdirectedRequest);
                break;
            case 422:
                HTTPError unprocessableEntity = HTTPError.UNPROCESSABLE_ENTITY;
                System.out.println(unprocessableEntity);
                break;
            case 423:
                HTTPError locked = HTTPError.LOCKED;
                System.out.println(locked);
                break;
            case 424:
                HTTPError failedDependency = HTTPError.FAILED_DEPENDENCY;
                System.out.println(failedDependency);
                break;
            case 425:
                HTTPError tooEarly = HTTPError.TOO_EARLY;
                System.out.println(tooEarly);
                break;
            case 426:
                HTTPError upgradeRequired = HTTPError.UPGRADE_REQUIRED;
                System.out.println(upgradeRequired);
                break;
            case 428:
                HTTPError preconditionRequired = HTTPError.PRECONDITION_REQUIRED;
                System.out.println(preconditionRequired);
                break;
            case 429:
                HTTPError tooManyRequests = HTTPError.TOO_MANY_REQUESTS;
                System.out.println(tooManyRequests);
                break;
            case 431:
                HTTPError requestHeaderFieldsTooLarge = HTTPError.REQUEST_HEADER_FIELDS_TOO_LARGE;
                System.out.println(requestHeaderFieldsTooLarge);
                break;
            case 451:
                HTTPError unavailableForLeagalReasons = HTTPError.UNAVAILABLE_FOR_LEGAL_REASONS;
                System.out.println(unavailableForLeagalReasons);
                break;
        }

    }

}


