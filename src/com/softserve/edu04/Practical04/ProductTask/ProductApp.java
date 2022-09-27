package com.softserve.edu04.Practical04.ProductTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ProductApp {
        public static void main(String[] args) {

            Product product1 = new Product("bread", 7.80, 450);
            Product product2 = new Product("butter", 24.20, 120);
            Product product3 = new Product("cheese", 125.80, 28);
            Product product4 = new Product("sausage", 95.40, 155);
            Product product5 = new Product("creame cheese", 45.60, 273);

            List<Product> list = new ArrayList<>();
            list.add(product1);
            list.add(product2);
            list.add(product3);
            list.add(product4);
            list.add(product5);

            System.out.println("Price sorting:");
            Collections.sort(list, Product.ProductPrice);
            for (Product in1 : list) {
                System.out.println(in1);
            }

            System.out.println("The highest price of product is:");
            Collections.sort(list, Product.ProductQuantity);
            System.out.println(list.get(list.size() - 1));



            System.out.println("Quantity Sorting:");
            Collections.sort(list, Product.ProductQuantity);
            for (Product in : list) {
                System.out.println(in);
            }

            System.out.println("The largest quantity of product is:");
            Collections.sort(list, Product.ProductPrice);
            System.out.println(list.get(list.size() - 1));

            System.out.println("Name of the product Sorting:");
            Collections.sort(list, Product.ProductNameComparator);
            for (Product in : list) {
                System.out.println(in);

            }
        }
}
