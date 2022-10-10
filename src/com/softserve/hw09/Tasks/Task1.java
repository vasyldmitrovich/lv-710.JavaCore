package com.softserve.hw09.Tasks;

import java.util.*;

public class Task1 {
    public static void run(){
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s2.add(3);
        s2.add(4);
        System.out.println(union(s1,s2));
        System.out.println(intersect(s1,s2));
    }
    static Set<Integer> union(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> result = new HashSet<>();
        result.addAll(set1);
        result.addAll(set2);
        return result;
    }

    static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> result = new HashSet<>();
        for (int i:set2) {
            if (set1.contains(i)) result.add(i);
        }
        return result;
    }
    
}
