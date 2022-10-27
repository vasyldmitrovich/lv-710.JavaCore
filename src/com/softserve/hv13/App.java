package hv13;

import hv13classes.Cipher;
import hv13classes.Lists;
import java.awt.*;



public class App {

    public static void main (String [] args){
    Lists.doLists();
        System.out.println(Cipher.encrypt("ABC", 3));
        System.out.println(Cipher.decrypt("XYZ", 3));
    }
}
