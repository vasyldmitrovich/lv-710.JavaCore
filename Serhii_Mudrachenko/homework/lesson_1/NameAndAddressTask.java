package homework.lesson_1;

import static homework.lesson_1.MessageHelper.*;

/**
 * Define String variables name and address. Output question "What is your name?"
 * Read the value name and output next question: "Where are you live, (name)?".
 * Read address and write whole information.
 */

public class NameAndAddressTask {
    protected static void defineNameAndAddress(){
        writeMessage("What is your name?");
        String name = readStringMessage();

        writeMessage("Where are you live, " + name + "?");
        String address = readStringMessage();

        writeMessage("name - " + name);
        writeMessage("address - " + address);
    }
}
