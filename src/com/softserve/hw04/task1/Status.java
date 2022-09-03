package com.softserve.hw04.task1;

public class Status {
    private int code;
    private String name;
    private String description;

    public Status() {
    }

    public Status(int code, String name, String description) {
        this.code = code;
        this.name = name;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


    @Override
    public String toString() {
        return "Status{" +
                "code = " + code +
                ", description: " + description + '}';
    }
}
