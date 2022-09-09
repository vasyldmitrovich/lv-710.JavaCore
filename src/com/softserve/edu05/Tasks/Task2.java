package com.softserve.edu05.Tasks;

import com.softserve.hw04.IO.In;
import com.softserve.hw04.IO.Input;

public class Task2 {
    public static void run() {
        Employee[] arrayEmployee = new Employee[5];
        In myIn = new Input();
        arrayEmployee[0] = new Employee("Bogdan", 3, 150);
        arrayEmployee[1] = new Employee("Ihor", 2, 100);
        arrayEmployee[2] = new Employee("Vadim", 1, 100);
        arrayEmployee[3] = new Employee("Petro", 2, 100);
        arrayEmployee[4] = new Employee("Ivan", 1, 100);
        int department = myIn.readInt("Enter department number(1-3): ");
        System.out.println("Employees from department " + department + " :");
        for (int i = 0; i < 5; i++)
            if (arrayEmployee[i].getDepartmentNumber() == department) System.out.println(arrayEmployee[i]);

        // Arrays.sort(arrayEmployee, Comparator.comparing(Employee::getSalary));
        Employee temp;
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (arrayEmployee[i].getSalary() > arrayEmployee[j].getSalary()) {
                    temp = arrayEmployee[i];
                    arrayEmployee[i] = arrayEmployee[j];
                    arrayEmployee[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Sorted list of employee :");
        for (Employee emp : arrayEmployee) {
            System.out.println(emp);
        }
    }
}
