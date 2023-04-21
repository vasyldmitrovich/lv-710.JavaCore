package com.softserve.edu07.hw.Emploees;

import java.util.Comparator;

public class SortBySalary extends Employee implements Comparator<Employee> {

    @Override
    public int calculatePay() {
        return 0;
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getSalary() + o2.getSalary();
    }
}
