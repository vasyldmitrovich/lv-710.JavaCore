package com.softserve.IO;

import java.util.List;
import java.util.Map;

public class Output {

    public static void print(String outputMessage){
        System.out.println(outputMessage);
    }

    public static void print(int outputMessage){
        System.out.println(outputMessage);
    }

    public static void print(List<Integer> list){
        System.out.println(list);
    }

    public static void print(Map<Integer, String> map){
        System.out.println(map);
    }

}
