package com.softserve.edu09.practik;

import java.util.*;

public class TenIntegersListDemo {
    public static void main(String[] args) {
        sortCollection(setElementsOfCollection(checkCollection(createCollection())));
    }

    public static List createCollection() {
        System.out.println("Start create of collection");
        List<Integer> myCollections = new LinkedList<>();
        Set<Integer> mySet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            mySet.add((int) (Math.random() * 25));
        }
        myCollections.addAll(mySet);
        System.out.println("My collection before the changes: " + myCollections);
        System.out.println("---------");
        return myCollections;
    }

    public static List checkCollection(List list) {
        System.out.println("Start check of collection");
        Iterator<Integer> iterator = list.iterator();
        List<Integer> newCollection = new LinkedList<>();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element > 5) {
                newCollection.add(list.indexOf(element));
            }
            if (element > 20) {
                iterator.remove();
            }
        }
        System.out.println("My collection after removing elents that are more than 20: " + list);
        System.out.println("List of element indices that are greater than 5: " + newCollection);
        System.out.println("---------");
        return list;
    }

    public static List setElementsOfCollection(List list) {
        System.out.println("Start set elements of collection");
        list.set(2, 1);
        if (list.size() > 8) {
            list.set(8, -3);
        }
        if (list.size() > 5) {
            list.set(5, -4);
        }
        System.out.println("My collection after replacing elements: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("position - " + i + ", value of element - " + list.get(i));
        }
        System.out.println("---------");
        return list;
    }

    public static void sortCollection(List list) {
        System.out.println("Start sort of collection");
        list.sort(Comparator.naturalOrder());
        System.out.println("My collection after sorting: " + list);
    }
}
