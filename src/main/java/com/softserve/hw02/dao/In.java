package com.softserve.hw02.dao;

public interface In {

    int readInt(String... msg);

    float readFloat(String... msg);
    void close();
}
