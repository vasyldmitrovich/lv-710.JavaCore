package com.softserve.OOP.Phone;

import java.util.Objects;

public class Phone{
    String number = "+38096000000";
    String model = "Apple";
    double weight = 100.5;

//        Phone(String n, String m, double w) {
//        this(n, m);
//        weight = w;
//    }
    Phone(String n, String m) {
        super();
        number = n;
        model = m;
    }

    Phone() {
    }

    public Phone(String number) {
        this.number = number;
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    double weight2() {
        return weight * weight;
    }

    void setDim(String n, String m, double w) {
        number = n;
        model = m;
        weight = w;
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + "c номера " + number);
    }

    String getNumber() {
        return number;
    }

    static void sendMessage(String message, String... numbers) {
        for (String number : numbers
        ) {
            System.out.println("номер " + number + " прислал следующее сообщение: " + message);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Double.compare(phone.weight, weight) == 0 && number.equals(phone.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, model, weight);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}

