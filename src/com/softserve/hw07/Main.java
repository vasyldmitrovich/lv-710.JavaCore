package com.softserve.hw07;

import com.softserve.hw07.task1.ContractEmployee;
import com.softserve.hw07.task1.Employee;
import com.softserve.hw07.task1.SalariedEmployee;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Task1
        Employee emp[]=new Employee[4];

        emp[0]=new ContractEmployee("01","Kate",123-456-7890, 13.5, 38);
        emp[1]=new ContractEmployee("02","James",234-567-8901, 14.75, 40);
        emp[2]=new SalariedEmployee("03","Flavia",123-45-6789, 1750);
        emp[3]=new SalariedEmployee("04","Sam",234-56-7890, 750);

        Arrays.sort(emp);
        for(Employee a : emp){
            System.out.println(a.toString());
        }

        //Task 2
    }
}
