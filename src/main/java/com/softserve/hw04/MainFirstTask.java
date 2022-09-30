package com.softserve.hw04;

import static com.softserve.hw04.HTTPStatusCodes.HTTP_STATUS_CODE100;

public class MainFirstTask {

    public static void main(String[] args) {

        Calculations calculations = new Calculations();
        HTTPFunctionality f = new HTTPFunctionality();

        // Float value belongs to the range [-5;5]
        calculations.range(6.2f, 3.3f, -6.2f);

        //Maximum integer value
        calculations.maxInt(2, 3, 4, 6, 1, 6, 9);

        //TODO Did not write min value
        //HTTP status code
        //TODO Do not include 401 402 403 status code
        f.readError(HTTP_STATUS_CODE100);

        int[] values = {23, 12, 13, 17, 12, 23, 19, 11};

        Sorting sort = new Sorting();
        sort.sorting(values);
    }
}
