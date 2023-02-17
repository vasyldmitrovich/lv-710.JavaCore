package com.softserve.edu05.hw.Cars;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// READY!!
public class CarsArrayDemo {

    public static void sortCars(int year) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String typ1 = br.readLine();
        int yearOfProduction1 = Integer.parseInt(br.readLine());
        double engineCapacity1 = Double.parseDouble(br.readLine());

        String typ2 = br.readLine();
        int yearOfProduction2 = Integer.parseInt(br.readLine());
        double engineCapacity2 = Double.parseDouble((br.readLine()));

        String typ3 = br.readLine();
        int yearOfProduction3 = Integer.parseInt(br.readLine());
        double engineCapacity3 = Double.parseDouble(br.readLine());

        String typ4 = br.readLine();
        int yearOfProduction4 = Integer.parseInt(br.readLine());
        double engineCapacity4 = Double.parseDouble(br.readLine());

//        String typ5 = br.readLine();
//        int yearOfProduction5 = Integer.parseInt(br.readLine());
//        double engineCapacity5 = Double.parseDouble((br.readLine()));


        Car car1 = new Car(typ1, yearOfProduction1, engineCapacity1);
        Car car2 = new Car(typ2, yearOfProduction2, engineCapacity2);
        Car car3 = new Car(typ3, yearOfProduction3, engineCapacity3);
        Car car4 = new Car(typ4, yearOfProduction4, engineCapacity4);
//        Car car5 = new Car(typ5, yearOfProduction5, engineCapacity5);

        Car[] car = new Car[]{car1, car2, car3, car4};
        int i;
        boolean b = false;
        Car tmp;
        int e = 0;

        while (b == false) {
            b = true;
            for (i = 0; i < car.length - 1; i++) {
                if (car[i].getYearOfProduction() > car[i + 1].getYearOfProduction()) {
                    b = false;
                    if (b == false) {
                        tmp = car[i];
                        car[i] = car[i + 1];
                        car[i + 1] = tmp;
                    }
                }
            }
        }
        System.out.println(Arrays.asList(car));

        for (i = 0; i < car.length; i++) {
            {
                if (year == car[i].getYearOfProduction()) {
                    e = car[i].getYearOfProduction();
                    System.out.println(car[i]);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        sortCars(1989);

        int a = 8;
        int b = 1;
        a = a + b - (b = a);
        System.out.println(a);
        System.out.println(b);
    }
}

