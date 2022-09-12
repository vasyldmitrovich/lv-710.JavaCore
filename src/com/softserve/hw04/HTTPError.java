package com.softserve.hw04;

public enum HTTPError {
    ERROR_400("Bad Request"),
    ERROR_401("Unauthorized"),
    ERROR_402("Payment Required");
    private String name;

    HTTPError(String name) {
        this.name = name;

    }
    public static HTTPError getByNumber(int errorNumber) {
        switch(errorNumber){
            case 400 : return ERROR_400;
            case 401 : return ERROR_401;
            case 402 : return ERROR_402;
        }

        return null;
    }

    public String getName() {
        return name;
    }
}
