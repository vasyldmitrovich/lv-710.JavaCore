package com.softserve.edu04;

import java.util.Scanner;

public enum Week  {
	MONDAY ("Monday ","Montag ","Lunes"),
	TUESDAY ("Tuesday ","Dienstag ", "Martes"),
	WEDNESDAY ("Wednesday ", "Mittwoch	", "Miércoles"),
	THURSDAY ("Thursday ","Donnerstag ","Jueves"),
	FRIDAY ("Friday ","Freitag ", "Viernes"),
	SATURDAY ("Saturday ","Samstag ","Sábado"),
	SUNDAY ("Sunday ","Sonntag ","Domingo");
	
	private final String en;
    private final String de;
    private final String sp;
    
    private Week(String en, String de, String sp) {
        this.en = en;
        this.de = de;
        this.sp= sp;
    }
    
    @Override
    public String toString() {
        return getEn()+getDe()+getSp();
    }
        
        public String getEn() {
            return en;
        }

        public String getDe() {
            return de;
        }

        public String getSp() {
            return sp;
        }
		
		 public static void main(String[] args) {
			 
				Week week = Week.MONDAY;

				System.out.print("Number of day (Week) = ");
			    Scanner input = new Scanner(System.in);
			    int numWeek = input.nextInt();


			    switch (numWeek) {
			    case 1: week = Week.MONDAY; break;
			    case 2: week = Week.TUESDAY; break;
			    case 3: week = Week.WEDNESDAY; break;
			    case 4: week = Week.THURSDAY; break;
			    case 5: week = Week.FRIDAY; break;
			    case 6: week = Week.SATURDAY; break;
			    case 7: week = Week.SUNDAY; break;   
			    default: System.out.println("Incorrect input"); return;
			  }
			    System.out.println(week);
			}
			
		 }





