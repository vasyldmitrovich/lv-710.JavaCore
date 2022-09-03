package com.softserve.edu04.practical_tasks.task4;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Create class Product with fields name,price and quantity.
 * 1 - Create four instances of type Product.
 * 2 - Display the name and quantity of the most expensive item.
 * 3 - Display the name of the items, which has the biggest quantity.
 */

public class App {
    public static void main(String[] args) {
        // #1
        var products = new ArrayList<Product>() {{
            add(new Product("Boat", 1200.00, 10));
            add(new Product("Hat", 15.50, 24));
            add(new Product("Boots", 42.20, 41));
            add(new Product("Fishing rod", 170.00, 180));
        }};

        // #2
        Product mostExpensiveProduct = getMostExpensiveProduct(products);
        System.out.println(mostExpensiveProduct.getName() + " - " +
                mostExpensiveProduct.getQuantity() + " quantity available.");

        // #3
        Product mostBiggestQuantityProduct = getMostBiggestQuantityProduct(products);
        System.out.println(mostBiggestQuantityProduct.getName() + " has the biggest quantity");
    }

    private static Product getMostExpensiveProduct(List<Product> products) {
        return products.stream()
                .sorted(Comparator.comparing(Product::getPrice).reversed())
                .collect(Collectors.toList())
                .get(0);
    }

    private static Product getMostBiggestQuantityProduct(List<Product> products) {
        return products.stream()
                .reduce((product1, product2) -> product1.getQuantity() >= product2.getQuantity() ? product1 : product2)
                .get();
    }
}
