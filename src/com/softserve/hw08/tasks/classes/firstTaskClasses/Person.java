package com.softserve.hw08.tasks.classes.firstTaskClasses;

abstract public class Person {

    private FullName fullName = new FullName();
    private int age;

    public Person (String firstName, String lastName, int age){
        fullName.firstName = firstName;
        fullName.lastName = lastName;
        this.age = age;
    }

    public String info(){
        return String.format("First name: %s, Last name: %s, Age: %d ", this.fullName.getFirstName(),
                this.fullName.getLastName(), this.age);
    }

    abstract public String activity();

     private class FullName{
        private String firstName;
        private String lastName;

        private FullName(){

        }

        private FullName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }

}
