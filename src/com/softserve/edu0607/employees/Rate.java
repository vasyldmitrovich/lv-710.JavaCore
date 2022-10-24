package com.softserve.edu0607.employees;

public enum Rate {
    RATE_20(20),
    RATE_30(30),
    RATE_40(40);

    public int rate;

    Rate(int rate) {
        this.rate = rate;
    }
}
