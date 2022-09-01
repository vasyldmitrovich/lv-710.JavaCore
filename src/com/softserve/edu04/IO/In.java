package com.softserve.edu04.IO;

public interface In {
    int readInt(String... msg);

    String readString(String... msg);

    double readDouble(String... msg);
    void close();
}
