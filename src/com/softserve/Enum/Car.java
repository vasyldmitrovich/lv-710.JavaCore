package com.softserve.Enum;

public enum Car {
    VOLVO(12),
    AUDI(15) {
        public String getColor() {
            return "white";
        }
    },
    BMW(20);

    private int price;

    Car(int price) {
        this.price = price;
    }


    public int getPrice() {
        return price;
    }

    public String getColor() {
        return "black";
    }

}