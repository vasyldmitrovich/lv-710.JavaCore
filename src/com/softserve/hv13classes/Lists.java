package hv13classes;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Lists {



    public static void doLists (){

        Predicate<String> predicate = (s) -> s.length() < 5;
        List<String> list1 = Arrays.asList("abc", "", "bc", "abcdds", "1", "jklsds", "abcd", "ad*");

        List<String> list2  = (List<String>) list1.stream()
                .filter(predicate)
                .collect(Collectors.toList());

        System.out.println(list1);
        System.out.println("Updated: " + list2 );
    }
}
