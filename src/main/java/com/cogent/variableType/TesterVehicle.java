package com.cogent.variableType;

public class TesterVehicle {

	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle();
		vehicle.speed = 300;
		
		Vehicle v2 = new Vehicle();
		Vehicle.speed = 200;

		// local
		vehicle.startOn(150);
		Vehicle.speed = 1001;
		
		// static instance variable
		System.out.println("static instance variable");
		System.out.println("vehicle " + vehicle.speed);
		System.out.println("v2 " + v2.speed);
		
		// instance variable
		System.out.println("instance variable");
		System.out.println("vehicle " + vehicle.engine);
		System.out.println("v2 " + v2.engine);

	}

}
