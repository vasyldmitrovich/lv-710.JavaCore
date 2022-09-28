package com.softserve.hw04;

public enum HTTPError {

    _400(400, "Bad Request"),
    _401(401, "Unauthorized"),
    _402(402, "Payment Required"),
    _403(403, "Forbidden"),
    _404(404, "Not Found"),
    _405(405, "Method Not Allowed"),
    _406(406, "Not Acceptable"),
    _407(407, "Proxy Authentication Required"),
    _408(408, "Request Timeout"),
    _409(409, "Conflict"),
    _410(410, "Gone"),
    _411(411, "Length Required"),
    _412(412, "Precondition Failed"),
    _413(413, "Payload Too Large"),
    _414(414, "URI Too Long"),
    _415(415, "Unsupported Media Type"),
    _416(416, "Range Not Satisfiable"),
    _417(417, "Expectation Failed"),
    _418(418, "I'm a Teapot"),
    _421(421, "Misdirected Request"),
    _422(422, "Unprocessable Entity"),
    _423(423, "Locked"),
    _424(424, "Failed Dependency"),
    _425(425, "Too Early"),
    _426(426, "Upgrade Required"),
    _428(428, "Precondition Required"),
    _429(429, "Too Many Requests"),
    _431(431, "Request Header Fields Too Large"),
    _451(451, "Unavailable For Legal Reasons"),
    _497(497, "HTTP Request Sent to HTTPS Port"),
    _498(498, "Token expired/invalid"),
    _499(499, "Client Closed Request");

    private final int value;
    private final String description;

    HTTPError(int code, String description) {
        this.value = code;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int getValue() {
        return value;
    }

}
