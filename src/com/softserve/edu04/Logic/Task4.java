package com.softserve.edu04.Logic;

import java.util.ArrayList;

public class Task4 {
    public static void run() {
        ArrayList<Product> arr = new ArrayList<>();
/*        In myIn = new Input();
        String name;
        double price;
        int quantity;
        for (int i=1; i<=4; i++){
            arr.add(new Product(myIn.readString("New name: "),
                    myIn.readDouble("New price: "),
                    myIn.readInt("New quantity: ")));
        }*/
        arr.add(new Product("Beer", 32.50, 8));
        arr.add(new Product("Milk", 57.40, 10));
        arr.add(new Product("Potato", 10.0, 2));
        arr.add(new Product("Fish", 110.00, 6));
        Product biggestQuantity = arr.get(0);
        Product mostExpensive = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i).quantity > biggestQuantity.quantity) biggestQuantity = arr.get(i);
            if (arr.get(i).price > mostExpensive.price) mostExpensive = arr.get(i);
        }
        System.out.println("Most expensive item is " + mostExpensive.name + ", quantity " + mostExpensive.quantity);
        System.out.println("Biggest quantity has " + biggestQuantity.name);
    }
}

