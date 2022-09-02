package com.softserve.hw04.Controller;

public enum HTTPError {
    BAD_REQUEST(400, "bad request"),
    UNAUTHORIZED(401, "unauthorized"),
    PAYMENT_REQUIRED(402, "payment required"),
    FORBIDDEN(403, "forbidden"),
    NOT_FOUND(404, "not found"),
    METHOD_NOT_ALLOWED(405, "method not allowed"),
    NOT_ACCEPTABLE(406, "not acceptable"),
    PROXY_AUTHENTICATION_REQUIRED(407, "proxy authentication required"),
    REQUEST_TIMEOUT(408, "request timeout"),
    CONFLICT(409, "conflict"),
    GONE(410, "gone"),
    LENGTH_REQUIRED(411, "length required"),
    PRECONDITION_FAILED(412, "precondition failed"),
    REQUEST_ENTITY_TOO_LARGE(413, "request entity too large"),
    REQUEST_URI_TOO_LONG(414, "request-uri too long"),
    UNSUPPORTED_MEDIA_TYPE(415, "unsupported media type"),
    REQUESTED_RANGE_NOT_SATISFIABLE(416, "requested range not satisfiable"),
    EXPECTATION_FAILED(417, "expectation failed");
    private final int code;
    private final String statusCode;
    HTTPError(int code, String statusCode) {
        this.code=code;
        this.statusCode=statusCode;
    }

    public int getCode() {
        return code;
    }
    public String getStatusCode() {
        return statusCode;
    }
    public static String getStatusCode(int codeErr) {
        for (HTTPError err : HTTPError.values()) if (err.code == codeErr) return err.statusCode;
        return "No Code "+codeErr;
    }
}
