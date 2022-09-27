package com.softserve.edu04.Practical04.ContinentsTask;

public class ContinentApp {
    public  static void main(String[] args) {
        Country country1 = new Country("South Africa");
        Country country2 = new Country("Bouvet Island");
        Country country3 = new Country("India");
        Country country4 = new Country("Australia");
        Country country5 = new Country("Ukraine");
        Country country6 = new Country("United States");
        Country country7 = new Country("Chile");
        Country country8 = new Country("qq");

        System.out.println("The name of " + country1.getName() + "'s continent is " + country1.cont());
        System.out.println("The name of " + country2.getName() + "'s continent is " + country2.cont());
        System.out.println("The name of " + country3.getName() + "'s continent is " + country3.cont());
        System.out.println("The name of " + country4.getName() + "'s continent is " + country4.cont());
        System.out.println("The name of " + country5.getName() + "'s continent is " + country5.cont());
        System.out.println("The name of " + country6.getName() + "'s continent is " + country6.cont());
        System.out.println("The name of " + country7.getName() + "'s continent is " + country7.cont());
        System.out.println("The name of " + country8.getName() + "'s continent is " + country8.cont());
} }
