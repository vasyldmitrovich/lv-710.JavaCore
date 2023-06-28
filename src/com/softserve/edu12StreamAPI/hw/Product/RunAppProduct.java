package com.softserve.edu12StreamAPI.hw.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RunAppProduct {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("OnePlus 9 Pro", "Phones", LocalDate.of(2022, 7, 10), 3500));
        productList.add(new Product("Sony PlayStation 5", "Gaming", LocalDate.of(2021, 6, 2), 4500));
        productList.add(new Product("Apple MacBook Pro", "Laptops", LocalDate.of(2023, 4, 15), 3000));
        productList.add(new Product("Samsung 4K Smart TV", "TVs", LocalDate.of(2022, 3, 18), 1500));
        productList.add(new Product("Samsung Galaxy S21", "Phones", LocalDate.of(2021, 8, 25), 1800));
        productList.add(new Product("Canon EOS R5", "Cameras", LocalDate.of(2020, 2, 20), 3500));
        productList.add(new Product("Fitbit Charge 5", "Wearables", LocalDate.of(2023, 1, 10), 2000));
        productList.add(new Product("Dell XPS 15", "Laptops", LocalDate.of(2022, 12, 5), 2500));
        productList.add(new Product("Google Pixel 6", "Phones", LocalDate.of(2021, 9, 17), 2000));
        productList.add(new Product("LG OLED TV", "TVs", LocalDate.of(2022, 11, 25), 2500));
        productList.add(new Product("Nikon D850", "Cameras", LocalDate.of(2020, 10, 18), 4000));
        productList.add(new Product("Apple Watch Series 7", "Wearables", LocalDate.of(2021, 9, 12), 4000));
        productList.add(new Product("Xiaomi Mi 12", "Phones", LocalDate.of(2019, 11, 5), 2200));
        productList.add(new Product("Samsung Galaxy Tab S7", "Tablets", LocalDate.of(2022, 8, 7), 8000));
        productList.add(new Product("Sony WH-1000XM4", "Headphones", LocalDate.of(2021, 7, 1), 3500));
        productList.add(new Product("LG Gram", "Laptops", LocalDate.of(2020, 6, 20), 1800));
        productList.add(new Product("IPhone X", "Phones", LocalDate.of(2022, 10, 13), 5500));
        productList.add(new Product("Fitbit Versa 3", "Wearables", LocalDate.of(2023, 4, 9), 2500));
        productList.add(new Product("Google Nest Hub", "Smart Home", LocalDate.of(2020, 3, 3), 1800));
        productList.add(new Product("Amazon Echo Dot", "Smart Speakers", LocalDate.of(2019, 2, 1), 5000));

        LocalDate localDateOneYearAgo = LocalDate.now().minusYears(1);
        List<Product> newProductList = productList.stream()
                .filter(product -> product.getManufactureCategory() == "Phones" && product.getPrice() > 3000)
                .filter(product -> product.getDateOfManufacture().isAfter(localDateOneYearAgo)
                        || product.getDateOfManufacture().isEqual(localDateOneYearAgo))
                .collect(Collectors.toList());
        newProductList.forEach(System.out::println);
    }
}