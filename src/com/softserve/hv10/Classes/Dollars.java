package com.softserve.hv10.Classes;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Dollars {
	
	public static void dollars () {
   
	    Scanner in = new Scanner(System.in);
		System.out.println ("Insert sentence with dollars");
		String dol = in.nextLine();
		in.close();
		       
		Pattern pattern = Pattern.compile("\\$(\\d*)(\\.\\d{2})");
		Matcher matcher = pattern.matcher(dol);
		while(matcher.find())
		System.out.println(matcher.group());
	}   
		
		
	// String dol = "100 EUR its	$98.146, 500 EUR its	$490.7301, 1000 EUR	will be $981.4602 and finally 2500 EUR =	$2453.6504"

	}
	

