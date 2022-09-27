package com.softserve.hw08.task1;

public abstract class Person {
    private FullName fullName;
    private int age;

    public FullName getFullName() {
        return fullName;
    }

    public Person(String firstName, String lastName, int age) {
        this.fullName = new FullName(firstName, lastName);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String info() {
        return String.format("First name: %s, Last name: %s, Age: %d",
                fullName.getFirstName(), fullName.getLastName(), age);
    }
    public abstract String activity();


    public static class FullName {
        private String firstName;
        private String lastName;

        public FullName() {
        }

        public FullName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }
}
