package com.softserve.hv06.Classes;

public class Chicken extends NonFlyingBird {

	public Chicken(String feathers, int layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void fly() {
		
		System.out.println("The Chicken cant flying with " + feathers +" "+ layEggs);
	}

}
