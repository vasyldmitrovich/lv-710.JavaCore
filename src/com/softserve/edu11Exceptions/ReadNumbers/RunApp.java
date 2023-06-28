package com.softserve.edu11Exceptions.ReadNumbers;

import java.io.IOException;

import static com.softserve.edu11Exceptions.ReadNumbers.ReadNumber.iterNumber;

public class RunApp {
    public static void main(String[] args) throws IOException, NumberOutOfBoardsException {
        iterNumber(10);
    }
}
