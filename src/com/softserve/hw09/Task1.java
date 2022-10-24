package com.softserve.hw09;
import java.util.*;

public class Task1 {
        public void set() {
            Set <String> set1 = new HashSet <>();
            Set <String> set2 = new HashSet <>();

            set1.add("Germany");
            set1.add("France");
            set1.add("Italy");

            set2.add("Poland");
            set2.add("Ukraine");
            set2.add("Germany");
            System.out.println("Set1: " + set1);
            System.out.println("Set2: " + set2);
            System.out.println("Union: " + union(set1, set2));
            System.out.println("Intersect: " + intersect(set1, set2));
        }

        static Set<String> union(Set<String> s1, Set<String> s2){
            Set <String> union=new HashSet <>();
            union.addAll(s1);
            union.addAll(s2);
            return union;
        }

        static Set<String> intersect(Set<String> s1, Set<String> s2){
            Set <String> intersect=new HashSet <>(s1);//копія s1
            intersect.retainAll(s2);
            return intersect;
        }
    }


