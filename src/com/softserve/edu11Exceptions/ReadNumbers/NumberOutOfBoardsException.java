package com.softserve.edu11Exceptions.ReadNumbers;

public class NumberOutOfBoardsException extends RuntimeException {
    private static final long serialVersionUID = 2L;

    public NumberOutOfBoardsException(String message) {
        super(message);
    }
}
