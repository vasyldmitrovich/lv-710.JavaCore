package com.softserve.OOP.Phone;

import com.softserve.OOP.Phone.Phone;

public class PhoneDemo2 {
    public static void main(String[] args) {
        Phone myPhone1 = new Phone();
        Phone myPhone2 = new Phone();

        myPhone1.setDim("+2069696", "eee", 70.56);
        myPhone2.setDim(null, null, 0.56);

        System.out.println("вес в квадрате myPhone1 = " + myPhone1.weight2());
        System.out.println("вес в квадрате myPhone2 = " + myPhone2.weight2());
    }
}
