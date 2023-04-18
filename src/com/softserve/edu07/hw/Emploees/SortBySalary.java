package com.softserve.edu07.hw.Emploees;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getSalary(), o2.getSalary());
    }
}
