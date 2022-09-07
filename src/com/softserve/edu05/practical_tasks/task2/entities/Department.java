package com.softserve.edu05.practical_tasks.task2.entities;

public enum Department {
    SALES(1),
    DEVELOPMENT(2),
    ANALYTICS(3),
    HUMAN_RESOURCES(4);

    public final int departmentNumber;

    Department(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }
}
