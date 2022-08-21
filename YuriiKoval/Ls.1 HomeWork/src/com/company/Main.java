package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calculate();

        HowAreYou howAreYouQuestion = new HowAreYou();
        howAreYouQuestion.answer();

        Circle myCircle = new Circle();
        myCircle.setRadius();
        myCircle.getCirclePerimeter();
        myCircle.getCircleArea();

        AddressBook myAddressBook = new AddressBook();
        myAddressBook.setName();
        myAddressBook.setAddress();
        myAddressBook.getAllInformation();

        PhoneCall phoneCalls = new PhoneCall();
        phoneCalls.setCostPerMinute();
        phoneCalls.setTime();
        phoneCalls.calculatePriceOfCall();
        }
    }