package com.softserve.FileAndException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/com/softserve/FileAndException/TextFile");
        System.out.println(file);
        PrintWriter pw = new PrintWriter(file);
        pw.println("row one");
        pw.close();

    }
}
