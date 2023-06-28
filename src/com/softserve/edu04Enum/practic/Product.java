package com.softserve.edu04Enum.practic;

public class Product {
    /*If this code in next fourth lines do not needed, del unneeded lines*/
//    BREAD("baguette", 25666.5, 11),
//    PHONE("samsung", 5000, 3),
//    JEANS("levi's", 2000,5),
//    BOOK("Oldman and sea", 500, 20);
    private String name;
    private double price;
    private int quantity;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
