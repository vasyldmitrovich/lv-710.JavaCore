package hw03;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    static int age;

    public static int count = 0;

    public Person() {
        count++;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        count++;
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

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String input(){
        System.out.println("Please enter your first name: ");
        Scanner sc1 = new Scanner(System.in);
        firstName = sc1.nextLine();

        System.out.println("Please enter your last name: ");
        Scanner sc2 = new Scanner(System.in);
        lastName = sc2.nextLine();

        System.out.println("Please enter your birth year: ");
        Scanner sc3 = new Scanner(System.in);
        birthYear = sc3.nextInt();
        count++;
       return firstName + lastName + birthYear ;
    }

    public int getAge() {

        age = 2022 - getBirthYear();
        return age;
    }

    public String output(){
        String info = "Name: " + getFirstName() + " " + getLastName() + " \n" + "Age: " + getAge();
        System.out.println(info);
        count++;
        return "Name: " + firstName + " " + lastName + " \n" + "Age: " + age ;
    }
    
    public void changeName(String fn, String ln){
        setFirstName(fn);
        setLastName(ln);


    }
}
