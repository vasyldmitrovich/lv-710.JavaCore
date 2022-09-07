package com.softserve.edu05.practical_tasks.task2.factorys;

import com.softserve.edu05.practical_tasks.task2.entities.Department;
import com.softserve.edu05.practical_tasks.task2.exceptions.NonExistingDepartmentException;

import java.util.Objects;

public class FactoryEmployee {
    public static AbstractFactory getFactory(int departmentNumber) throws NonExistingDepartmentException {
        Objects.checkIndex(departmentNumber, Department.values().length + 1);
        switch (departmentNumber) {
            case 1:
                return new FactorySeller();
            case 2:
                return new FactoryDeveloper();
            case 3:
                return new FactoryAnalyst();
            case 4:
                return new FactoryHR();
            default:
                throw new NonExistingDepartmentException();
        }
    }
}
