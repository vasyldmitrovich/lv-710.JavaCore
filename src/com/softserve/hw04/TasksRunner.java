package com.softserve.hw04;

public class TasksRunner {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        float minRange = -5.0F;
        float maxRange = 5.0F;
        float checkNumber1 = 6.0F;
        float checkNumber2 = -7.0F;
        float checkNumber3 = 4.2F;
        boolean result1 = NumbersUtil.isBelongToTheRange(checkNumber1, minRange, maxRange);
        boolean result2 = NumbersUtil.isBelongToTheRange(checkNumber2, minRange, maxRange);
        boolean result3 = NumbersUtil.isBelongToTheRange(checkNumber3, minRange, maxRange);


        String msg  = "This number: %s is belong to the range [%s,%s] is %s";
        System.out.println(msg.formatted(checkNumber1, minRange, maxRange, result1));
        System.out.println(msg.formatted(checkNumber2, minRange, maxRange, result2));
        System.out.println(msg.formatted(checkNumber3, minRange, maxRange, result3));


    }
    public static void task2() {

    }
    public static void task3() {

    }
    public static void task4() {

    }
}
