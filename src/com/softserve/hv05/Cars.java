package com.softserve.hv05;

public class Cars {
	
	private  String type ;
	protected int yearOfProduction;
	private double engineCapacity;
	
	Cars (){
		
	}
	
	Cars (String type, int yearOfProduction, double engineCapacity){
		  this.type = type;
	      this.yearOfProduction = yearOfProduction;
	      this.engineCapacity = engineCapacity;
	}
	
	 public String getType() {
	       return type;
	   }

	   public double getYearOfProduction() {
	       return yearOfProduction;
	   }
	   
	   public double getEngineCapacity() {
	       return engineCapacity;
	   }
	   
	   public void setType(String type) {
	       this.type = type;
	   }
	   
	   public void setYearOfProduction(int yearOfProduction) {
	       this.yearOfProduction = yearOfProduction;
	   }

	     public void setEngineCapacity(double engineCapacity) {
	       this.engineCapacity = engineCapacity;
	   }
	     
	   @Override
		    public String toString() {
		        return this.type + "  Production in " + this.yearOfProduction + " with engine v "  + this.engineCapacity;
		    }
	     
	     

}
