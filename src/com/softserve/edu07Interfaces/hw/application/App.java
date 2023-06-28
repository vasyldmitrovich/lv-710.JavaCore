package com.softserve.edu07Interfaces.hw.application;

import com.softserve.edu07Interfaces.hw.class_structure.ContractEmp;
import com.softserve.edu07Interfaces.hw.class_structure.Employee;
import com.softserve.edu07Interfaces.hw.class_structure.StaffEmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        sortArray();
        sortList();
    }

    public static void sortArray() {
        Employee[] employees = getArrEmp();
        System.out.println("----- Original array Employee -----");
        for (Employee e: employees
        ) {
            System.out.println(e);
        }
        System.out.println("-------------");
        System.out.println("----- Array Employee after sorting -----");
        Arrays.sort(employees);
        for (Employee e: employees
        ) {
            System.out.println(e);
        }
    }

    public static void sortList() {
        List<Employee> list = getListEmp();
        System.out.println("----- Original list Employee -----");
        for (Employee e: list
        ) {
            System.out.println(e);
        }
        System.out.println("-------------");
        System.out.println("----- List Employee after sorting -----");
        list.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
//                return o1.getSalary() - o2.getSalary();
                return o1.getId() - o2.getId();
            }
        });
        for (Employee e: list
        ) {
            System.out.println(e);
        }
    }

    public static String InputData(String s) {
        System.out.println(s);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        try {
            result = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("You input wrong data");
        }
        return result;
    }

    public static Employee[] getArrEmp() {
        Employee[] employees = new Employee[5];
        employees[0] = new ContractEmp(1,1000,"Bla", 3000);
        employees[1] = new ContractEmp(2,1500,"Bla1", 1500);
        employees[2] = new ContractEmp(3,1100,"Bla2", 1700);
        employees[3] = new StaffEmp(1,3000,"NumbSoc1",60,70);
        employees[4] = new StaffEmp(2,1200,"NumbSoc2",90,40);
        return employees;
    }

    public static List<Employee> getListEmp() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new ContractEmp(1,1000,"Bla", 3000));
        employees.add(new ContractEmp(2,1500,"Bla2", 1700));
        employees.add(new ContractEmp(3,1100,"Bla2", 1700));
        employees.add(new StaffEmp(1,3000,"NumbSoc1",60,70));
        employees.add(new StaffEmp(2,1200,"NumbSoc2",90,40));
        return employees;
    }
}
