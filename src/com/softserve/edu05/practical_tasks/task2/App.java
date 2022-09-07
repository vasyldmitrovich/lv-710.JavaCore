package com.softserve.edu05.practical_tasks.task2;


import com.softserve.edu05.practical_tasks.task2.entities.Department;
import com.softserve.edu05.practical_tasks.task2.entities.Employee;
import com.softserve.edu05.practical_tasks.task2.exceptions.NonExistingDepartmentException;
import com.softserve.edu05.practical_tasks.task2.factorys.AbstractFactory;
import com.softserve.edu05.practical_tasks.task2.factorys.FactoryEmployee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static com.softserve.hw01.MessageHelper.readIntMessage;
import static com.softserve.hw01.MessageHelper.writeMessage;

/**
 * Create a class Employee with fields name, department number, salary. Create five objects of class Employee. Display
 * - all employees of a certain department (enter department number in the console);
 * - arrange workers by the field salary in descending order.
 */

public class App {
    public static void main(String[] args) {
        App app = new App();
        List<Employee> employees = new ArrayList<>();
        app.fillListEmployees(employees);
        app.display(employees);
    }

    private void fillListEmployees(List<Employee> employees) {
        try {
            AbstractFactory factory = FactoryEmployee.getFactory(1);
            employees.add(factory.getEmployee("Jaidan Sharma", 2500));

            factory = FactoryEmployee.getFactory(2);
            employees.add(factory.getEmployee("Alanah Benton", 2000));
            employees.add(factory.getEmployee("Cassius Frazier", 2100));

            factory = FactoryEmployee.getFactory(3);
            employees.add(factory.getEmployee("Cordelia Carson", 3000));

            factory = FactoryEmployee.getFactory(4);
            employees.add(factory.getEmployee("Emeli Sutherland", 2800));

        } catch (NonExistingDepartmentException e) {
            e.printStackTrace();
        }
    }

    private void display(List<Employee> employees) {
        Arrays.stream(Department.values()).forEach(department ->
                writeMessage(department.departmentNumber + " - " + department.name()));

        writeMessage("Enter department number:");

        int departmentNumber = readIntMessage();
        employees.stream()
                .filter(employee -> employee.getDepartmentNumber() == departmentNumber)
                .forEach(System.out::println);

        writeMessage("_______________________________________");

        writeMessage("Workers list descending order by salary:");
        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .forEach(System.out::println);
    }

}
