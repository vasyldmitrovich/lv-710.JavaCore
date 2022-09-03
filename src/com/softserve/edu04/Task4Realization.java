package com.softserve.edu04;

public class Task4Realization {

    private  Product bread = new Product("Bread", 13.6f, 13);
    private  Product bottleOfWater = new Product("Bottle of water", 5.3f, 6);
    private  Product cookies = new Product("Cookies", 9.9f, 21);
    private  Product chocolate = new Product("Chocolate", 20f, 7);
    private Product[] products = {bread, bottleOfWater, cookies, chocolate};

    public void displayMaxPrice(){
        Product template = new Product("", 0, 0);
        for ( int i = 0; i < products.length; i++) {
            if (template.getPrice() < products[i].getPrice()){
                template = products[i];
            }
        }
        System.out.println("The most expansive product is - " + template.getName() + ", with price - " +
                template.getPrice() + " USD");
    }

    public void displayMaxQuantity(){
        Product template = new Product("", 0, 0);
        for ( int i = 0; i < products.length; i++) {
            if (template.getQuantity() < products[i].getQuantity()){
                template = products[i];
            }
        }
        System.out.println("The most numerous product is - " + template.getName() + ", with quantity - " +
                template.getQuantity() + " pcs");
    }
}
