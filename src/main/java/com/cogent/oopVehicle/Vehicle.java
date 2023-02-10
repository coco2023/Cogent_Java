package com.cogent.oopVehicle;

public class Vehicle {
	String model;
	String type;
	int cost;
		
	Vehicle() {
		System.out.println("Default Method");
	}
	
	Vehicle(String model, String type, int cost) {
		super();
		this.model = model;
		this.type = type;
		this.cost = cost;
		
		System.out.println("model: " + this.model);
		System.out.println("type: " + this.type);
		System.out.println("cost: " + this.cost);
		
	}

	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", type=" + type + ", cost=" + cost + "]";
	}
	

}
