package com.softserve.hv06.Classes;

public abstract class Bird {
	
	String feathers;
	int layEggs;
	
	Bird (){	
	}
	
    Bird (String feathers, int layEggs){	
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
	
	public abstract void fly();
}
