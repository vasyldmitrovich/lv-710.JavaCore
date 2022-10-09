package com.softserve.hw10.tasks;

import com.softserve.IO.Input;
import com.softserve.IO.Output;

public class Task1 {

    static public void runFirstTask(){

        //Enter in the console sentence of five words.
        //  -display the longest word in the sentence

        String sentence = Input.inputString("Please, enter sentence of five words");
        Output.print( "The longest word is: " + "\"" + returnLongestWord(sentence) + "\"");

        //  -determine the number of its letters

        Output.print("It consist of " + returnLongestWord(sentence).length() + " letters");

        //  -bring the second word in reverse order

        Output.print("The reverse of second word is: " + "\"" + getSecondWord(sentence) + "\"");


    }

    private static String returnLongestWord(String sentence){
        String result = "";
        sentence = sentence.strip().replaceAll("\\p{Punct}", "")
                .replaceAll("\\s{2,}", " ") + " ";
        int wordLength = 0;
        for (int i = countOf(sentence, ' '); i > 0; i--){
            String word = sentence.substring(0, sentence.indexOf(' ')).strip();
            if (wordLength < word.length()){
                result = word;
                wordLength = word.length();
            }
            sentence = sentence.substring(sentence.indexOf(' ') + 1);
        }
        return result;
    }

    private static int countOf(String string, char ch){
        int result = 0;
        char[] chars = string.toCharArray();
        for (char template : chars){
            if (template == ch)
                result++;
        }
        return result;
    }

    private static String getSecondWord(String sentence){
        sentence = sentence.strip().replaceAll("\\p{Punct}", "")
                .replaceAll("\\s{2,}", " ") + " ";
        StringBuilder builder = new StringBuilder();
        builder.append(sentence.substring(sentence.indexOf(' ') + 1).
                substring(0, sentence.substring(sentence.indexOf(' ') + 1).indexOf(' ')).strip()).reverse();
        return builder.toString();
    }
}
