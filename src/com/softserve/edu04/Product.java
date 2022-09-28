package com.softserve.edu04;

public class Product {

    private String name;
    private int price;
    private int quantity;

    public Product() {
    }

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        if (name != null) this.name = name;
        else System.out.println("wrong data");
    }

    public void setPrice(int price) {
        if (price > 0) this.price = price;
        else System.out.println("wrong data");
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) this.quantity = quantity;
        else System.out.println("wrong data");
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
