package com.softserve.edu05.practic.Employee;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// READY!!
public class EmployeeBisLogic implements interfaceSortEmployee, interfaceCheckEmployee, interfaceRunMethod{
    public void runMethod(String s) {
        System.out.println(s);
        Employee[] empl = {createEmployee(), createEmployee(), createEmployee(), createEmployee(), createEmployee()};
        checkEmployee(empl, Integer.parseInt(showMessageAndReturnInputData
                ("Input department number of employee for sorting")));
        sortEmployee(empl);
    }
    public String showMessageAndReturnInputData(String s) {
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
    public Employee createEmployee() {
        Employee employee = new Employee(showMessageAndReturnInputData("Input name of employee"),
                Integer.parseInt(showMessageAndReturnInputData("Input department number of employee")),
                Integer.parseInt(showMessageAndReturnInputData("Input engine salary of employee")));
        System.out.println(employee);
        return employee;
    }
    public void checkEmployee(Employee[] e, int depNumber) {
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        for (int i = 0; i < e.length; i++) {
            if (e[i].getDepartmentNumber() == depNumber) {
                employeeArrayList.add(e[i]);
            }
        }
        if (employeeArrayList.size() == 0) {
            System.out.println("Employees of this department are not found");
        }
        if (employeeArrayList.size() != 0) {
            System.out.println("Employees with the department number you are looking for:");
            System.out.println(employeeArrayList);
        }
    }

    public void sortEmployee(Employee[] e) {
        System.out.println("Sorting employees by salary decrease: ");
        for (int i = 0; i < e.length; i++) {
            int pos = i;
            int max = e[i].getSalary();
            Employee obMax = e[i];
            for (int j = i + 1; j < e.length; j++) {
                if (e[j].getSalary() > max) {
                    max = e[j].getSalary();
                    pos = j;
                    obMax = e[j];
                }
            }
            e[pos] = e[i];
            e[i] = obMax;
        }
        for (Employee em :
                e) {
            System.out.println(em);
        }
    }
}
