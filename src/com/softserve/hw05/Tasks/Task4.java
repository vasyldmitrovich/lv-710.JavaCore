package com.softserve.hw05.Tasks;

import com.softserve.hw04.IO.In;
import com.softserve.hw04.IO.Input;

import java.util.Arrays;
import java.util.Comparator;

public class Task4 {
    public static void run(){
        Car car1 = new Car("bmw",2015,3.0);
        Car car2 = new Car("Mersedes",2018,2.7);
        Car car3 = new Car("Renault",2010,1.5);
        Car[] carArray ={car1,car2,car3};
        System.out.println("Not sorted:"+'\n'+Arrays.toString(carArray));
        In myIn = new Input();
        int year = myIn.readInt("Enter year: ");
        System.out.println("Cars of "+year+':');
        for (Car car:carArray){
            if (car.getYearOfProduction()==year) System.out.println(car);
        }
//        Car tempCar;
//        for (int i=0;i<carArray.length-1;i++) {
//            for (int j = i + 1; j < carArray.length; j++)
//                if (carArray[i].getYearOfProduction()>carArray[j].getYearOfProduction()){
//                    tempCar=carArray[i];
//                    carArray[i]=carArray[j];
//                    carArray[j]=tempCar;
//                }
//        }
        Arrays.sort(carArray, Comparator.comparing(Car ::getYearOfProduction));
        System.out.println("Sorted:"+'\n'+Arrays.toString(carArray));

    }
}
