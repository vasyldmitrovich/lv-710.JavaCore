package com.softserve.edu11.tasks;

import com.softserve.IO.Output;
import com.softserve.edu11.tasks.calsses.Plant;

public class Task2 {

    public static void runSecondTask(){

        Plant[] plants = new Plant[0];
            plants = new Plant[]{

                    new Plant( 5, Plant.Color.GREEN, Plant.Type.TREE),
                    new Plant(2, Plant.Color.BLUE, Plant.Type.BUSH),
                    new Plant(7, Plant.Color.GREEN, Plant.Type.TREE),
                    new Plant(3, Plant.Color.BLUE, Plant.Type.BUSH),
                    new Plant(4, Plant.Color.GREEN, Plant.Type.GRASS)
            };

        for (Plant template : plants){
            Output.print(template.toString());
        }

    }

}
