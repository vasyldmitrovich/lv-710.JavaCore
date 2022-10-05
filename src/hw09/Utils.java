package hw09;

import java.util.HashSet;
import java.util.Set;

public class Utils {
public static Set union(Set set1, Set set2) {

    Set set = new HashSet<>();

    set.addAll(set1);
    set.addAll(set2);

    return set;
}

}
