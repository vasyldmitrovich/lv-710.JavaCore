package com.softserve.edu04.Practical04;

public class Oddnumbers {
    public static void main(String [] args)
    {
        int a = 4;
        int b = 2;
        int c = 2;

        if ( a%2 > 0 && b%2 > 0 && c%2 > 0)
        {System.out.println( "три числа є непарними" );}
        if (a%2 > 0 && b%2 > 0 && c%2 <= 0)
        {System.out.println( "два числа є непарними" );}
        if (a%2 > 0 && b%2 <= 0 && c%2 > 0)
        {System.out.println( "два числа є непарними2" );}
        if (a%2 <= 0 && b%2 > 0 && c%2 > 0)
        {System.out.println( "два числа є непарними3" );}
        if ( a%2 > 0 && b%2 <= 0 && c%2 <= 0)
        {System.out.println( "Одне число є непарним" );}
        if ( a%2 <= 0 && b%2 > 0 && c%2 <= 0)
        {System.out.println( "Одне число є непарним1" );}
        if ( a%2 <= 0 && b%2 <= 0 && c%2 > 0)
        {System.out.println( "Одне число є непарним2" );}
        else{System.out.println("Три  числа є парними");}



    }


}