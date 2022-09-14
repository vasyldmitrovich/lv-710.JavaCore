package edu05;

import java.util.ArrayList;
import java.util.List;

public class EmployeeUtil {
    public static List<Employee> findEmployeesByDepartment(
            List<Employee> employeeList, int departmentNumber) {

        List<Employee> employees = new ArrayList<>();
        for (Employee employee : employeeList) {
            if (employee.getDepartmentNumber() == departmentNumber) {
                employees.add(employee);

            }

        }
        return employees;
    }

}
