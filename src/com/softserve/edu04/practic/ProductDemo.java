package com.softserve.edu04.practic;

// READY !! Have a question!
public class ProductDemo {
    public static void print() {
        Product[] products = new Product[]{
                new Product("bread", 25.5, 50),
                new Product("phone", 5540, 3),
                new Product("jeans", 2205, 15),
                new Product("book", 564, 20)};

        Product mostExpensive = products[0];
        Product largestAmount = products[0];
        for (int i = products.length-1; i >= 0; i--) {
            if (products[i].getQuantity() > mostExpensive.getQuantity()) {
                largestAmount = products[i];
            }
        }
        for (int j = products.length - 1; j >= 0; j--) {
            if (products[j].getPrice() > mostExpensive.getPrice()) {
                mostExpensive = products[j];
            }
        }

        System.out.println("most expensive item in quantity of '" + mostExpensive.getQuantity()
                + "' and it's called '" + mostExpensive.getName() + "'");
        System.out.println("the largest amount of goods has name '" + largestAmount.getName()
                + "' and it's worth '" + largestAmount.getPrice() + "'");
    }

    public static void main(String[] args) {
        print();
    }
}
