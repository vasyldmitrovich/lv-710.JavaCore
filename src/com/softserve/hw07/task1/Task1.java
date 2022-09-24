package com.softserve.hw07.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Create Payment interface with the method calculatePay(), the base class Employee with a string variable employeeID.
 * Create two classes SalariedEmployee and ContractEmployee, which implement
 * interface and are inherited from the base class.
 *  - Describe hourly paid workers in the relevant classes (one of the children), and fixed paid workers (second child).
 *  - Describe the string variable socialSecurityNumber in the class SalariedEmployee .
 *  - Include a description of federalTaxIdMember in the class of ContractEmployee.
 *  - The calculation formula for the "time-worker“ is:
 *  the average monthly salary = hourly rate * number of hours worked
 *  - For employees with a fixed payment the formula is: the average monthly salary = fixed monthly payment
 *  - Create an array of employees and add the employees with different form of payment.
 *  - Arrange the entire sequence of workers descending the average monthly wage. Output the
 *  employee ID, name, and the average monthly wage for all elements of the list.
 */
public class Task1 {
    public void run() {
        List<Employee> employees = new ArrayList<>() {{
           add(new SalariedEmployee("1", "Bob", "313423", 2000.00));
           add(new SalariedEmployee("2", "Tom", "498460", 3000.00));
           add(new SalariedEmployee("3", "Sara", "005774", 8250.00));
           add(new SalariedEmployee("4", "Poul", "9782054", 4800.00));
           add(new ContractEmployee("5", "Sam", 56, 120, 20));
           add(new ContractEmployee("6", "Andy", 74, 150, 22));
           add(new ContractEmployee("7", "Tod", 12, 180, 19));
        }};

        Collections.sort(employees);

        employees.forEach(employee -> System.out.printf("\nemployee ID %s, name: %s, average monthly wage - %.2f",
                    employee.getEmployeeID(),
                    employee.getName(),
                    employee.calculatePay()));
    }
}
