package com.softserve.edu04;

import java.util.Scanner;

public enum Сontinent  {
	ASIA ("Asia "),
	AFRICA ("Africa "),
	EUROPE ("Europe " ),
	NORTHAMERICA ("North America "),
	SOUTHAMERICA ("South America "),
	AUSTRALIA ("Australia "),
	ANTARCTICA ("Antarctica ");
	
	private final String name;
  
   
    

    private Сontinent(String name) {
        this.name = name;
       
    }
    
    @Override
    public String toString() {
        return getName();
    }
        
        public String getName() {
            return name;
        }


        //TODO make reformat code and move all following code to main method, because that code should not be here


    //TODO following code do not work
        public static void country() { 
        	  
        	Сontinent name = Сontinent.ASIA;

        	System.out.print("Country? ");
            Scanner input = new Scanner(System.in);
            String Country = input.nextLine();


            switch (Country) {
            case "China": name = Сontinent.ASIA ; break;
            case "Niger": name = Сontinent.AFRICA ; break;
            case "Ukraine": name = Сontinent.EUROPE; break;
            case "USA" : name = Сontinent.NORTHAMERICA; break;
            case "Brasil" : name = Сontinent.SOUTHAMERICA; break;
            case "Australia" : name = Сontinent.AUSTRALIA ; break;
            case "Vernadsky Research Base" : name = Сontinent.ANTARCTICA ; break;   
            default: System.out.println("Incorrect input"); return;
          }
            System.out.println(name);
        }
        		 public static void main(String[] args) {
        			 country();	 
        		 }


        }



	

	


