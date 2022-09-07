package com.softserve.edu05.practical_tasks.task2.factorys;

import com.softserve.edu05.practical_tasks.task2.entities.Employee;

public interface AbstractFactory {
    Employee getEmployee(String name, double salary);
}
