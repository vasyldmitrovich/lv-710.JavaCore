package com.softserve.edu04Enum.hm;

public enum HTTPError {
    Error400("Bad Request", 400),
    Error401("Unauthorized", 401),
    Error402("Payment Required", 402),
    Error403("Forbidden", 403),
    Error404("Not Found", 404),
    Error405("Method Not Allowed", 405),
    Error406("Not Acceptable", 406),
    Error407("Proxy Authentication Required", 407),
    Error408("Request Timeout", 408),
    Error409("Conflict", 409),
    Error410("Gone", 410);

    private String name;
    private int number;

    HTTPError(String name, int n) {
        this.name = name;
        this.number = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "HTTPError{" +
                "name='" + name + '\'' +
                '}';
    }
}
