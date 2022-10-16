package com.softserve.IO;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Output {

    public static void print(String outputMessage){
        System.out.println(outputMessage);
    }

    public static void print(int outputMessage){
        System.out.println(outputMessage);
    }

    public static void print(double outputMessage){
        System.out.println(outputMessage);
    }

    public static <T> void print(List<T> list){
        System.out.println(list);
    }

    public static <T> void printMap(Map<T, T> map){
        System.out.println(map);
    }

    public static <T> void print(Set<T> set){
        System.out.println(set);
    }

    public static void printMap1(Map<Integer, String> map) {
        System.out.println(map);
    }
}
