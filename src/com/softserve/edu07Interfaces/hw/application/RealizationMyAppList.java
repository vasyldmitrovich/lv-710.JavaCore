package com.softserve.edu07Interfaces.hw.application;

public class RealizationMyAppList {
    /*public static void createEmploees() {
        *//*List<Employee> employees = new ArrayList<>();
        employees.add(new ContractEmployee(InputData("Write name"), InputData("Write Federal TaxId Member"),
                Integer.parseInt(InputData("Write Fixed Monthly Salary"))));
        employees.add(new ContractEmployee(InputData("Write name"), InputData("Write Federal TaxId Member"),
                Integer.parseInt(InputData("Write Fixed Monthly Salary"))));
        employees.add(new SalariedEmployee(InputData("Write name"), InputData("Write Social Security Number"),
                Integer.parseInt(InputData("Write Hourly Rate")), Integer.parseInt(InputData("Write Number Of Hours"))));
        employees.add(new SalariedEmployee(InputData("Write name"), InputData("Write Social Security Number"),
                Integer.parseInt(InputData("Write Hourly Rate")), Integer.parseInt(InputData("Write Number Of Hours"))));
        for (Payment employee :
                employees) {
            System.out.println(employee);
        }
//        System.out.println(Arrays.toString(employees)+ "\n");
//        sort(employees);
//        System.out.println(Arrays.toString(employees)+ "\n");
        employees.sort(new SortBySalary());
        for (Payment employee :
                employees) {
            System.out.println();
            System.out.println(employee);
        }*//*
    }

    public static String InputData(String s) {
        System.out.println(s);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        try {
            result = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("You input wrong data");
        }
        return result;
    }

    public static void main(String[] args) {
        createEmploees();
    }*/
}
