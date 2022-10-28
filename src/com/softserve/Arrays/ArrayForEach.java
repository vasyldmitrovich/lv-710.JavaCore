package com.softserve.Arrays;

public class ArrayForEach {
    public static void main(String[] args) {
        int[] grades = {3, 9, 7};
        for (int num : grades) {
            System.out.print(num + " | ");
        }
        System.out.println();
//    }

//    public static int midGrade(int[] grades) {
        int sum = 0;
        for (int num : grades) {
            sum = num + sum;
        }
//            return sum;
        System.out.println((double) sum / grades.length);

//        return (sum/grades.length);


        int maxGrade = grades[0];
        for (int num : grades) {
            if (num > maxGrade) {
                maxGrade = num;
            }
        }
        System.out.println(maxGrade);
    }

}
