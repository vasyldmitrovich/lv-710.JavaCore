package com.softserve.edu03;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Person {
    private String name;
    private int birtYear;

    public void setName (String name){
        this.name = name;
    }

    public String getName (){
        return name;
    }

    public void setBirtYear(int birtYear) {
        this.birtYear = birtYear;
    }

    public int getBirtYear() {
        return birtYear;
    }

    public Person(){
        creationMessage();
    }

    public Person(String name, int birtYear){
        this.name = name;
        this.birtYear =birtYear;
        creationMessage();
    }

    private void creationMessage() {
        System.out.println("person.Person " + name + " created\n");
    }

    int age(){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - getBirtYear();
    }

    public void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter name for person " + name);
        setName(br.readLine());

        System.out.println("Enter " + name + "\'s year of birth");
        setBirtYear(Integer.parseInt(br.readLine()));

    }

    @Override
    public String toString() {
        return getName() + " has " + age() + " years old";
    }

    private void changeName() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\nEnter new name for person " + name);
        setName(br.readLine());
        System.out.println("person.Person " + name + " updated\n");
    }

    public static void main(String[] args) {

    }
}
