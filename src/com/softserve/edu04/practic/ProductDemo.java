package com.softserve.edu04.practic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// READY !!
public class ProductDemo {
    public static void checkProducts() {
        Product[] products = new Product[]{
                new Product(returnInputName(), returnInputPrice(), returnInputQuantity()),
                new Product(returnInputName(), returnInputPrice(), returnInputQuantity()),
                new Product(returnInputName(), returnInputPrice(), returnInputQuantity()),
                new Product(returnInputName(), returnInputPrice(), returnInputQuantity())};
        Product mostExpensive = products[0];
        Product largestAmount = products[0];
        for (int i = products.length - 1; i >= 0; i--) {
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

    public static String returnInputName() {
        System.out.println("Input name of product");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        try {
            result = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("You input wrong data");
        }
        return result;
    }

    public static double returnInputPrice() {
        System.out.println("Input price of product");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double result = 0;
        try {
            result = Double.parseDouble((br.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("You input wrong data");
        }
        return result;
    }

    public static int returnInputQuantity() {
        System.out.println("Input quantity of product");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        try {
            result = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("You input wrong data");
        }
        return result;
    }

    public static void main(String[] args) {
        checkProducts();
    }
}
