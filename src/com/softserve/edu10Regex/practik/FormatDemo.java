package com.softserve.edu10Regex.practik;

public class FormatDemo {
        public static void main(String[] args) {
         modifyNames("Serhii", "Evgeniyovich", "Lun'ov");
        }

        public static void modifyNames(String name, String middleName, String surName) {
            System.out.println("Write your name, middlename, and surname");
            name = name.substring(0,1).toUpperCase()+name.substring(1);
            middleName = middleName.substring(0,1).toUpperCase()+middleName.substring(1);
            surName = surName.substring(0,1).toUpperCase()+surName.substring(1);
            System.out.printf("%s %s. %s. \n",surName, name.substring(0,1),middleName.substring(0,1));
            System.out.printf("%s\n",name);
            System.out.printf("Name: %s, Middle name: %s, Surname: %s", name,middleName,surName);

        }
    }

