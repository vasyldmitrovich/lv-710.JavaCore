package com.softserve.edu05.tasks;

import com.softserve.IO.Input;
import com.softserve.edu05.tasks.classes.Employee;

public class Task2 {

    public static void runSecondTask(){
        // Task 2. Create a class Employee with fields name, department number, salary. Create five objects
        //         of class Employee.

        Employee devOpsEngineer = new Employee("DevOps Engineer", 1, 3000);
        Employee softwareEngineer = new Employee("Software Engineer", 1, 3200);
        Employee fullStackDeveloper = new Employee("Full Stack Developer", 2, 4000);
        Employee projectManager = new Employee("Project Manager", 3, 2000);
        Employee qaEngineer = new Employee("QA Engineer", 1, 2400);
        Employee[] professionsList = new Employee[] {devOpsEngineer, softwareEngineer, fullStackDeveloper,
                projectManager, qaEngineer};

        // display all employees of a certain department (enter department number in the console);

        System.out.println("Please, enter the number of employee department");
        int departmentNumber = Input.inputInt("You need to enter number of employee department," +
                " 1 or 2, for example");
        for (Employee template : professionsList){
            if (template.getDepartmentNumber() == departmentNumber){
                System.out.println(template.getName() + " belongs to " + template.getDepartmentNumber() + " department");
            }
        }
        // Display arrange workers by the field salary in descending order.

        boolean isSorted = false;
        while (!isSorted){
            for (int i = 1; i < professionsList.length; i++){
                isSorted = true;
                if (professionsList[i].getSalary() > professionsList[i - 1].getSalary()){
                    Employee template = professionsList[i - 1];
                    professionsList[i - 1] = professionsList[i];
                    professionsList[i] = template;
                    isSorted = false;
                }
            }
        }
        for (Employee template : professionsList){
            System.out.println(template.getName() + " salary is " + template.getSalary());
        }

            }
        }

