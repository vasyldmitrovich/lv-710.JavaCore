package com.softserve.hw04;

import java.util.Scanner;

public enum HTTPError {
    ERROR_400 ("Bad Request", 400),
    ERROR_401 ("Unauthorized ", 401),
    ERROR_402 ("Payment Required", 402),
    ERROR_403 ("Forbidden", 403),
    ERROR_404 ("Not Found ", 404),
    ERROR_405 ("Method Not Allowed", 405),
    ERROR_406 ("Not Acceptable", 406),
    ERROR_407 ("Proxy Authentication Required", 407),
    ERROR_408 ("Request Timeout", 408),
    ERROR_409 ("Conflict", 409),
    ERROR_410 ("Gone", 410),
    ERROR_411 ("Length Required", 411),
    ERROR_412 ("Precondition Failed", 412),
    ERROR_413 ("Request Entity Too Large", 413),
    ERROR_414 ("Request-URI Too Long", 414),
    ERROR_415 ("Unsupported Media Type", 415),
    ERROR_416 ("Requested Range Not Satisfiable", 416),
    ERROR_417 ("Expectation Failed", 417),
    ERROR_418 ("I'm a teapot", 418),
    ERROR_419 ("Authentication Timeout", 419),
    ERROR_420 ("Method Failure", 420),
    NO_ERROR ("NO_ERROR", 1000);

    private final String name;
    private final int number;

    HTTPError(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName(){
        return this.name;
    }

    public static void findErrorName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the error number ");
        int inputNumber;
        while (true){
            try {
                 inputNumber = Integer.parseInt(input.nextLine());
                break;
            } catch (NumberFormatException e){
                System.out.println("You need to enter error number like a number, 418 for example");
            }
        }
        for (HTTPError template : HTTPError.values()){
                    if (template.number == inputNumber) {
                        System.out.println("The name of error " + template.number + " is «" + template.name + "»");
                        break;
            } else if (template.number == 1000){
                        System.out.println("There is no such error in our list =(");
                    }
        }
    }

}
