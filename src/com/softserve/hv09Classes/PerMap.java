package com.softserve.hv09Classes;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PerMap {
	
	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public PerMap(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public static void doMap () {
	
	Map <String, String> personMap  = new HashMap<String, String>();
    	
	personMap.put("Alex", "Aloha");
	personMap.put("SMITH", "BROWN");
	personMap.put("WILSON", "WOOD");
	personMap.put("CRAIG", "THOMSON");
	personMap.put("STEWART", "ROBERTSON");
	personMap.put("SCOTT", "MACDONALD");
	personMap.put("TAYLOR", "MURRAY");
	personMap.put("SCOTT", "MACDONALD");
	personMap.put("Orest", "Huk");
	personMap.put("ROSS", "WALKER");
	
	//System.out.println("next map = " + personMap);
	for(Map.Entry<String, String> entry: personMap.entrySet())
        System.out.println(entry.getKey() + " - " + entry.getValue());
	
	personMap.remove("Orest");
	
	System.out.println("------------------------------------------------Remove Orest");
	for(Map.Entry<String, String> entry: personMap.entrySet())
		
        System.out.println(entry.getKey() + " - " + entry.getValue());
	
	}

}
