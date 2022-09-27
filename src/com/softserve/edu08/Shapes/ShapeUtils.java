package com.softserve.edu08.Shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapeUtils {
    public static void run() {
        List<Wrapper<Shape>> list = new ArrayList<>();
        Wrapper<Shape> squareWrapper = new Wrapper<>(new Square());
        list.add(squareWrapper);
        list.add(new Wrapper<>(new Circle()));
        System.out.println(list);
    }
}
