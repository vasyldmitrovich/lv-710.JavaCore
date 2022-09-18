package com.softserve.hw06.tasks;

import com.softserve.IO.Output;
import com.softserve.hw06.tasks.classes.firstTaskCalsses.*;

public class Task1 {

    public static void runFirstTask() {

        // Task. 1 Develop abstract class Bird with attributes feathers and layEggs and an abstract method fly().
        //Develop classes FlyingBird and NonFlyingBird. Create class Eagle, Swallow, Penguin and Chicken.
        //Create array Bird and add different birds to it.
        //Call fly() method for all of it. Output the
        //information about each type of created bird.

        Kiwi kiwi = new Kiwi("Kiwi", true, false, true, (byte) 3);
        Eagle eagle = new Eagle("Eagle", true, true, false, (byte) 1);
        Swallow swallow = new Swallow("Swallow", true, true, false, (byte) 3);
        Penguin penguin = new Penguin("Penguin", false, true, false, (byte) 4);
        Chicken chicken = new Chicken("Chicken", true, true, true, (byte) 2);

        //Create array Bird and add different birds to it.

        Bird[] birds = new Bird[] {kiwi, eagle, swallow, penguin, chicken};

        //Call fly() method for all of it. Output the information about each type of created bird.

        for (Bird template : birds){
            Output.print(template.toString());
        }

    }

}
