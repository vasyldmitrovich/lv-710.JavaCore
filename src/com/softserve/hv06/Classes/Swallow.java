package com.softserve.hv06.Classes;

public class Swallow extends FlyingBird {

	public Swallow(String feathers, int layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void fly() {
		
		System.out.println("The Swallow flying with " + feathers +" "+ layEggs);
	}
}
