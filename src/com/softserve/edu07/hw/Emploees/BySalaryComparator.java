package com.softserve.edu07.hw.Emploees;

import java.util.Comparator;

public class BySalaryComparator implements Comparator<Employee> {

    Comparator comparator = new BySalaryComparator();
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getSalary(), o2.getSalary());
    }
}
