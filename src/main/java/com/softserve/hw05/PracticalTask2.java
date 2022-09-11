package com.softserve.hw05;

public class PracticalTask2 {

    public static void main(String[] args) {

        DepartmentFunctionality depF = new DepartmentFunctionality();

        Employee emp1 = new Employee("Steve Jobs", Department.PROJECT_MANAGEMENT_DEPARTMENT, 10000);
        Employee emp2 = new Employee("Marco Polo", Department.QUALITY_ASSURANCE_DEPARTMENT, 8000);
        Employee emp3 = new Employee("Cho CHang", Department.QUALITY_ASSURANCE_DEPARTMENT, 9000);
        Employee emp4 = new Employee("Robert Stark", Department.DEVELOPMENT_DEPARTMENT, 9500);
        Employee emp5 = new Employee("Mad Max", Department.DEVELOPMENT_DEPARTMENT, 8500);

        depF.printDepEmp(emp1, emp2, emp3, emp4, emp5);
    }
}
