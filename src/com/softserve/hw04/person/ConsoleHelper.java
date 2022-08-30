package com.softserve.hw04.person;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleHelper {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    @SneakyThrows
    protected static String getDataFromConsole() {
        return reader.readLine();
    }
}
