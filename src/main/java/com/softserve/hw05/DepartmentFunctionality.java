package com.softserve.hw05;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DepartmentFunctionality {

    public void printDepEmp(Employee... employees) {
        System.out.println("Please input department number...");
        Scanner sc = new Scanner(System.in);
        int depNumber = sc.nextInt();
        Stream<Employee> employeeStream = Arrays.stream(employees)
                .filter((emp -> emp.getDepNumber() == depNumber));
        System.out.println(employeeStream.collect(Collectors.toList()));
    }
}
