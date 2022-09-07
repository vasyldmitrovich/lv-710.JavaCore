package com.softserve.edu04.tasks;

import com.softserve.edu04.Product;

public class Task4 {
    public static void main(String[] args) {
        Product phone1 = new Product("phoneSamsung", 4567, 560);
        Product phone2 = new Product("iphone", 50683, 300);
        Product phone3 = new Product("xiaomi", 2357, 689);
        Product phone4 = new Product("iphone14", 93450, 344);

        Product[] products = new Product[]{phone1, phone2, phone3, phone4};

        Product mostExpenciveItem = null;
        for (int i = 0; i < products.length; i++) {

            Product product = products[i];
            if (mostExpenciveItem == null
                    || product.getPrice() > mostExpenciveItem.getPrice()) {

                mostExpenciveItem = product;
            }


        }

        System.out.println("The most expencive item = " + mostExpenciveItem);


        Product theBiggestQuantity = null;
        for (int i = 0; i < products.length; i++) {

            Product product = products[i];
            if (theBiggestQuantity == null
                    || product.getQuantity() > theBiggestQuantity.getQuantity()) {

                theBiggestQuantity = product;
            }

            }

        System.out.println("The biggest quantity = " + theBiggestQuantity);

        }

    }
