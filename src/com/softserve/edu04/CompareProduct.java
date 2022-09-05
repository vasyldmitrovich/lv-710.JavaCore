package com.softserve.edu04;

import java.util.ArrayList;

public class CompareProduct {
    private static ArrayList<Product> products = new ArrayList<>();
    public static void createProducts() {
        products.add(0, new Product("table", 50, 11));
        products.add(1, new Product("lamp", 18, 34));
        products.add(2, new Product("sofa", 300, 7));
        products.add(3, new Product("chair", 20, 14));
    }

    public static void showAllProducts() {
        createProducts();
        System.out.println("\nShow all instances of Product:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public static void mostExpensive() {
        int max = 0;
        int quantity = 0;
        String name = null;

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getPrice() > max) {
                max = products.get(i).getPrice();
                quantity = products.get(i).getQuantity();
                name = products.get(i).getName();
            }
        }
        System.out.println("\nMost expensive intem: " + name +
                ", quantity: " + quantity + ";");
    }

    public static void biggestQuantity() {
        int max = 0;
        String name = null;

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getQuantity() > max) {
                max = products.get(i).getQuantity();
                name = products.get(i).getName();
            }
        }
        System.out.println("\nItem with biggest quantity: " +
                name + ";");
    }

    public static void demonstration() {
        showAllProducts();
        mostExpensive();
        biggestQuantity();
    }

}
