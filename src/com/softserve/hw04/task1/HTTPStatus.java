package com.softserve.hw04.task1;

import java.util.List;

public enum HTTPStatus {
    INFORMATIONAL_RESPONSE(),

    SUCCESS(),

    REDIRECTION(),

    CLIENT_ERRORS(
            new Status(400,
                    "Bad Request",
                    "The server cannot or will not process the request due to an apparent client error (e.g., malformed request syntax, size too large, invalid request message framing, or deceptive request routing).)"),

            new Status(401,
                    "Unauthorized (RFC 7235)",
                    "Similar to 403 Forbidden, but specifically for use when authentication is required and has failed or has not yet been provided. The response must include a WWW-Authenticate header field containing a challenge applicable to the requested resource. See Basic access authentication and Digest access authentication.[31] 401 semantically means \"unauthorised\", the user does not have valid authentication credentials for the target resource. Note: Some sites incorrectly issue HTTP 401 when an IP address is banned from the website (usually the website domain) and that specific address is refused permission to access a website.)"),

            new Status(402,
                    "Payment Required",
                    "Reserved for future use. The original intention was that this code might be used as part of some form of digital cash or micropayment scheme, as proposed, for example, by GNU Taler,[33] but that has not yet happened, and this code is not widely used. Google Developers API uses this status if a particular developer has exceeded the daily limit on requests.[34] Sipgate uses this code if an account does not have sufficient funds to start a call.[35] Shopify uses this code when the store has not paid their fees and is temporarily disabled.[36] Stripe uses this code for failed payments where parameters were correct, for example blocked fraudulent payments."),

            new Status(403,
                    "Forbidden",
                    "The request contained valid data and was understood by the server, but the server is refusing action. This may be due to the user not having the necessary permissions for a resource or needing an account of some sort, or attempting a prohibited action (e.g. creating a duplicate record where only one is allowed). This code is also typically used if the request provided authentication by answering the WWW-Authenticate header field challenge, but the server did not accept that authentication. The request should not be repeated."),

            new Status(404,
                    "Not Found",
                    "The requested resource could not be found but may be available in the future. Subsequent requests by the client are permissible."),

            new Status(405,
                    "Method Not Allowed",
                    "A request method is not supported for the requested resource; for example, a GET request on a form that requires data to be presented via POST, or a PUT request on a read-only resource."),

            new Status(406,
                    "Not Acceptable",
                    "The requested resource is capable of generating only content not acceptable according to the Accept headers sent in the request. See Content negotiation."),

            new Status(407,
                    "Proxy Authentication Required (RFC 7235)",
                    "The client must first authenticate itself with the proxy."),

            new Status(408,
                    "Request Timeout",
                    "The server timed out waiting for the request. According to HTTP specifications: \"The client did not produce a request within the time that the server was prepared to wait. The client MAY repeat the request without modifications at any later time.\""),

            new Status(409,
                    "Conflict",
                    "Indicates that the request could not be processed because of conflict in the current state of the resource, such as an edit conflict between multiple simultaneous updates."),

            new Status(410,
                    "Gone",
                    "Indicates that the resource requested was previously in use but is no longer available and will not be available again. This should be used when a resource has been intentionally removed and the resource should be purged. Upon receiving a 410 status code, the client should not request the resource in the future. Clients such as search engines should remove the resource from their indices. Most use cases do not require clients and search engines to purge the resource, and a \"404 Not Found\" may be used instead."),

            new Status(411,
                    "Length Required",
                    "The request did not specify the length of its content, which is required by the requested resource."),

            new Status(412,
                    "Precondition Failed (RFC 7232)",
                    "The server does not meet one of the preconditions that the requester put on the request header fields."),

            new Status(413,
                    "Payload Too Large (RFC 7231)",
                    "The request is larger than the server is willing or able to process. Previously called \"Request Entity Too Large\"."),

            new Status(414,
                    "URI Too Long (RFC 7231)",
                    "The URI provided was too long for the server to process. Often the result of too much data being encoded as a query-string of a GET request, in which case it should be converted to a POST request. Called \"Request-URI Too Long\" previously."),

            new Status(415,
                    "Unsupported Media Type (RFC 7231)",
                    "The request entity has a media type which the server or resource does not support. For example, the client uploads an image as image/svg+xml, but the server requires that images use a different format."),

            new Status(416,
                    "Range Not Satisfiable (RFC 7233)",
                    "The client has asked for a portion of the file (byte serving), but the server cannot supply that portion. For example, if the client asked for a part of the file that lies beyond the end of the file. Called \"Requested Range Not Satisfiable\" previously."),

            new Status(417,
                    "Expectation Failed",
                    "The server cannot meet the requirements of the Expect request-header field."),

            new Status(418,
                    "I'm a teapot (RFC 2324, RFC 7168)",
                    "This code was defined in 1998 as one of the traditional IETF April Fools' jokes, in RFC 2324, Hyper Text Coffee Pot Control Protocol, and is not expected to be implemented by actual HTTP servers. The RFC specifies this code should be returned by teapots requested to brew coffee. This HTTP status is used as an Easter egg in some websites, such as Google.com's \"I'm a teapot\" easter egg."),

            new Status(421,
                    "Misdirected Request (RFC 7540)",
                    "The request was directed at a server that is not able to produce a response (for example because of connection reuse)."),

            new Status(422,
                    "Unprocessable Entity (WebDAV; RFC 4918)",
                    "The request was well-formed but was unable to be followed due to semantic errors."),

            new Status(423,
                    "Locked (WebDAV; RFC 4918)",
                    "The resource that is being accessed is locked."),

            new Status(424,
                    "Failed Dependency (WebDAV; RFC 4918)",
                    "The request failed because it depended on another request and that request failed (e.g., a PROPPATCH)."),

            new Status(425,
                    "Too Early (RFC 8470)",
                    "Indicates that the server is unwilling to risk processing a request that might be replayed."),

            new Status(426,
                    "Upgrade Required",
                    "The client should switch to a different protocol such as TLS/1.3, given in the Upgrade header field."),

            new Status(428,
                    "Precondition Required (RFC 6585)",
                    "The origin server requires the request to be conditional. Intended to prevent the 'lost update' problem, where a client GETs a resource's state, modifies it, and PUTs it back to the server, when meanwhile a third party has modified the state on the server, leading to a conflict."),

            new Status(429,
                    "Too Many Requests (RFC 6585)",
                    "The user has sent too many requests in a given amount of time. Intended for use with rate-limiting schemes."),

            new Status(431,
                    "Request Header Fields Too Large (RFC 6585)",
                    "The server is unwilling to process the request because either an individual header field, or all the header fields collectively, are too large."),

            new Status(451,
                    "Unavailable For Legal Reasons (RFC 7725)",
                    "A server operator has received a legal demand to deny access to a resource or to a set of resources that includes the requested resource. The code 451 was chosen as a reference to the novel Fahrenheit 451 (see the Acknowledgements in the RFC).")
    ),

    SERVER_ERRORS(
            new Status(500,
                    "Internal Server Error",
                    "A generic error message, given when an unexpected condition was encountered and no more specific message is suitable."),

            new Status(501,
                    "Not Implemented",
                    "The server either does not recognize the request method, or it lacks the ability to fulfil the request. Usually this implies future availability (e.g., a new feature of a web-service API)."),

            new Status(502,
                    "Bad Gateway",
                    "The server was acting as a gateway or proxy and received an invalid response from the upstream server."),

            new Status(503,
                    "Service Unavailable",
                    "The server cannot handle the request (because it is overloaded or down for maintenance). Generally, this is a temporary state."),

            new Status(504,
                    "Gateway Timeout",
                    "The server was acting as a gateway or proxy and did not receive a timely response from the upstream server."),

            new Status(505,
                    "HTTP Version Not Supported",
                    "The server does not support the HTTP protocol version used in the request."),

            new Status(506,
                    "Variant Also Negotiates (RFC 2295)",
                    "Transparent content negotiation for the request results in a circular reference."),

            new Status(507,
                    "Insufficient Storage (WebDAV; RFC 4918)",
                    "The server is unable to store the representation needed to complete the request."),

            new Status(508,
                    "Loop Detected (WebDAV; RFC 5842)",
                    "The server detected an infinite loop while processing the request (sent instead of 208 Already Reported)."),

            new Status(510,
                    "Not Extended (RFC 2774)",
                    "Further extensions to the request are required for the server to fulfil it."),

            new Status(511,
                    "Network Authentication Required (RFC 6585)",
                    "The client needs to authenticate to gain network access. Intended for use by intercepting proxies used to control access to the network (e.g., \"captive portals\" used to require agreement to Terms of Service before granting full Internet access via a Wi-Fi hotspot).")
    ),

    UNOFFICIAL_CODES(),

    CLOUDFLARE(),

    AWS_ELASTIC_LOAD_BALANCER(
            new Status(460,
                    "Amazon's Elastic Load Balancing",
                    "Client closed the connection with the load balancer before the idle timeout" +
                            " period elapsed. Typically when client timeout is sooner than the " +
                            "Elastic Load Balancer's timeout."),

            new Status(463,
                    "Amazon's Elastic Load Balancing",
                    "The load balancer received an X-Forwarded-For request header with more than 30 IP addresses."),

            new Status(561,
                    "Unauthorized",
                    "An error around authentication returned by a server registered with a load balancer. You configured " +
                            "a listener rule to authenticate users, but the identity provider (IdP) returned an error code when " +
                            "authenticating the user.")
    ),

    CACHING_WARNING_CODES(
            new Status(110,
                    "Response is Stale",
                    "The response provided by a cache " +
                            "is stale (the content's age exceeds a maximum age set by a Cache-Control " +
                            "header or heuristically chosen lifetime)."),

            new Status(111,
                    "Revalidation Failed",
                    "The cache was unable to validate the response, due to an inability " +
                            "to reach the origin server."),

            new Status(112,
                    "Disconnected Operation",
                    "The cache is intentionally disconnected from the rest of the network."),

            new Status(113,
                    "Heuristic Expiration",
                    "The cache heuristically chose a freshness lifetime greater than 24 hours and " +
                            "the response's age is greater than 24 hours."),

            new Status(199,
                    "Miscellaneous Warning",
                    "Arbitrary, non - specific warning.The warning text may be logged or presented to the user."),

            new Status(214,
                    "Transformation Applied",
                    "Added by a proxy if it applies any transformation to the representation, such as" +
                            "changing the content encoding, media type or the like."),

            new Status(299,
                    "Miscellaneous Persistent",
                    "Warning Same as 199, but indicating a persistent warning."));

    private final List<Status> statuses;

    HTTPStatus(Status... statuses) {
        this.statuses = List.of(statuses);
    }

    public List<Status> getStatuses() {
        return statuses;
    }
}
