package com.softserve.hw05;

import com.softserve.hw05.input.InputReader;

import java.io.IOException;
import java.util.ArrayList;

public class Testing {

    private static void comp5Numb() throws IOException {
        ArrayList<Integer> nm5 = new ArrayList<>();
        ArrayList<Integer> evenNm = new ArrayList<>();

        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            nm5.add(InputReader.getInputInt());
        }


        System.out.println("Find position of second positive number:");
        int count = 0;
        int scndPositive = 0;
        for (int i = 0; i < nm5.size(); i++) {
            if (nm5.get(i) > 0) {
                count++;
                if (count == 2) scndPositive = nm5.get(i);
            }
        }
        if (count < 2) System.out.println("Array has only one positive number");
        System.out.println("Second positive number: " + scndPositive);




        System.out.println("Find minimum and its position in the array:");
        int min = nm5.get(0);
        for (int i = 0; i < nm5.size(); i++) {
            if (nm5.get(i) < min) min = nm5.get(i);
        }

        int minPosition = nm5.indexOf(min);
        System.out.println(minPosition);


        System.out.println("Find even numbers:");
        for(int i = 0; i < nm5.size(); i++){
            if (nm5.get(i) % 2 == 0){
                evenNm.add(nm5.get(i));
            }
        }
        for (int i = 0; i < evenNm.size(); i++) {
            System.out.println(evenNm.get(i));
        }
        int prodOfAllEven = 1;
        for (int i = 0; i < evenNm.size(); i++) {
            prodOfAllEven *= evenNm.get(i);
        }
        System.out.println(prodOfAllEven);

    }


    public static void main(String[] args) throws IOException {

        comp5Numb();

    }

}
