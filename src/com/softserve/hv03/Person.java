package com.softserve.hv03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.YearMonth;

public class Person {
   
   private String firstName;
   private String lastName;
   private int birthYear;
   
   
  
   Person() {
   }
   
   Person( String firstName, String lastName) {
       this.firstName = firstName;
       this.lastName = lastName;
   }


   public String getfirstName() {
       return firstName;
   }

   public String getlastName() {
       return lastName;
   }
   
   public int getbirthYear() {
       return birthYear;
   }
      
   public void setfirstName (String firstName) {
       this.firstName = firstName;
   }
   
   public void setlastName (String lastName) {
       this.lastName = lastName;
   }
   
   public void setbirthYear (int birthYear) {
       this.birthYear = birthYear;
   }

     
   public int getAge() {
    		   int year = YearMonth.now().getYear();
		   return year - birthYear;
   }
    	   
   public void input () throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   System.out.println ("firstName of Person=");
	   String firstName = br.readLine();
	   System.out.println ("lastName of Person=");
	   String lastName = br.readLine();
	   System.out.println ("birthYear of Person=");
	   int birthYear = Integer.parseInt(br.readLine());
	   this.firstName = firstName;
       this.lastName = lastName;
       this.birthYear = birthYear;
   }
   
   public void output () {
	   System.out.println ("firstName of Person= " + firstName + "lastName of Person= " + lastName + "birthYear of Person=" + birthYear);  
   }
   
   /*public String changeName (String firstName, String lastName) {
       setfirstName(firstName);
       return firstName;
       setlastName(lastName);
       return lastName;
   }*/
}
    

