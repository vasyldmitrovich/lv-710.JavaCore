package com.softserve.edu05.practical_tasks.task2.factorys;

import com.softserve.edu05.practical_tasks.task2.entities.Employee;
import com.softserve.edu05.practical_tasks.task2.entities.HR;

public class FactoryHR implements AbstractFactory {
    @Override
    public Employee getEmployee(String name, double salary) {
        return new HR(name, salary);
    }
}
