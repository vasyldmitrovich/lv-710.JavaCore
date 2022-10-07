package com.softserve.hv06.Classes;

public class Penguin extends NonFlyingBird {

	public Penguin(String feathers, int layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void fly() {
		
		System.out.println("The Penguin cant flying with " + feathers +" "+ layEggs);
	}

}
