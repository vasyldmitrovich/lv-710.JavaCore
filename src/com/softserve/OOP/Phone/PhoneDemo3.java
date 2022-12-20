package com.softserve.OOP.Phone;

import com.softserve.OOP.Phone.Phone;

public class PhoneDemo3 {
    public static void main(String[] args) {

        Phone myPhone = new Phone();
        myPhone.receiveCall("Mama");
        myPhone.receiveCall("Петя", "38079650");

        System.out.println(myPhone.getNumber());

    }
}