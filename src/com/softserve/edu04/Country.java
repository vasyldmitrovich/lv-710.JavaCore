package com.softserve.edu04;

import java.util.Arrays;
import java.util.Scanner;



public class Country {
    private String name;
    private Continents continent;
    private static final Scanner input = new Scanner(System.in);



    public Country(){
        this.name = input.nextLine();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void countryIsSituatedOnContinent(){

        if (Arrays.stream(Continents.AFRICA.getCountryName()).toList().contains(name)){
            this.continent = Continents.AFRICA;
        } else if(Arrays.stream(Continents.EURASIA.getCountryName()).toList().contains(name)){
            this.continent = Continents.EURASIA;
        } else if(Arrays.stream(Continents.NORTH_AMERICA.getCountryName()).toList().contains(name)){
            this.continent = Continents.NORTH_AMERICA;
        } else if(Arrays.stream(Continents.SOUTH_AMERICA.getCountryName()).toList().contains(name)){
            this.continent = Continents.SOUTH_AMERICA;
        } else if(Arrays.stream(Continents.ANTARCTICA.getCountryName()).toList().contains(name)){
            this.continent = Continents.ANTARCTICA;
        } else if(Arrays.stream(Continents.AUSTRALIA.getCountryName()).toList().contains(name)){
            this.continent = Continents.AUSTRALIA;
        }
        switch (continent){
            case AFRICA -> System.out.println(this.name + " is situated on Africa");
            case EURASIA -> System.out.println(this.name + " is situated on Eurasia");
            case NORTH_AMERICA -> System.out.println(this.name + " is situated on North America");
            case SOUTH_AMERICA -> System.out.println(this.name + " is situated on South America");
            case ANTARCTICA -> System.out.println(this.name + " is situated on Antarctica");
            case AUSTRALIA -> System.out.println(this.name + " is situated on Australia");
        }
    }
}
