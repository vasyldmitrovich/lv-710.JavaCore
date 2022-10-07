package com.softserve.hv06.Classes;

public class Eagle extends FlyingBird {

	
	
	public Eagle(String feathers, int layEggs) {
		// TODO Auto-generated constructor stub
		this.feathers = feathers;
		this.layEggs = layEggs;
	}

	public String getFeathers() {
	       return feathers;
	   }

	public int getLayEggs() {
	       return layEggs;
	   }
	   
	public void setFeathers(String feathers) {
	       this.feathers = feathers;
	   }
	public void setLayEggs(int layEggs) {
	       this.layEggs = layEggs;
	   }
	
	@Override
	public void fly() {
		
		System.out.println("The Eagle flying with " + feathers +" "+ layEggs);
	}
	
    
}
