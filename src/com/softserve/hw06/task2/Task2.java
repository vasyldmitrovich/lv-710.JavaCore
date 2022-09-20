package com.softserve.hw06.task2;

/**
 * Support we have a class Employee
 * Create a Developer class that extends the Employee class. Creates a
 * String field and a constructor to initialize all fields in the Developer class.
 * Also in the Developer class, override the method report() so that it returns a string
 * with information about the developer, for example:
 * Name: Taras, Age: 32 years, Position: Average Java developer, Salary: 32735.35
 * If necessary, modify the employee's class so that it meets the principles of
 * encapsulation and inheritance. Create an instance of the Employee and Developer
 * class and print in the console information about them using report() method.
 */
public class Task2 {
    public void run() {
        Employee developer = new Developer("Taras", "Average Java developer", 32, 5000);
        Employee employee = new Employee("Taras", 32, 5000);
        System.out.println(developer.report());
        System.out.println(employee.report());
    }
}
