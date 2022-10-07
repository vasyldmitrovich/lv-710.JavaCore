package com.softserve.hv10.Classes;

import java.util.Scanner;

public class FiveFWords {
	
	 static String reverseWord;
	
	public static void fiveWords () {
		
	
	Scanner in = new Scanner(System.in);
    System.out.println ("Insert sentence of five words");
	String str[] = new String[5];
	for(int i=0; i<5; i++){
		 System.out.println("Enter word "+ (i+1));
		 str[i] = in.nextLine();
		 
	}
	
	in.close();
	
	StringBuilder sb = new StringBuilder(str[1]);
    	
	String maxword = "";
	for(int i=0; i<5; i++){
		
		if (str[i].length() > maxword.length()){
		
		maxword=str[i];
		}
	}
		
	System.out.println ("the longest word in the sentence is " + maxword + " Its lenght=" + maxword.length() );
	System.out.println ("second word in reverse order " + sb.reverse());
	}

	@Override
	public String toString() {
		return "FiveFWords []";
	}
	
	
	
	
}

