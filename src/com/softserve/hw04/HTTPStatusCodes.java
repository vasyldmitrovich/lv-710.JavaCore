package com.softserve.hw04;

public enum HTTPStatusCodes {

    HTTP_STATUS_CODE100(100),
    HTTP_STATUS_CODE200(200),
    HTTP_STATUS_CODE300(300),
    HTTP_STATUS_CODE400(400),
    HTTP_STATUS_CODE500(500);

    private int statusCode;

    private HTTPStatusCodes(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getStatusCodes() {
        return this.statusCode;
    }
}
