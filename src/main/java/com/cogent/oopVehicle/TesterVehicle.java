package com.cogent.oopVehicle;

public class TesterVehicle {

	public static void main(String[] args) {
		Vehicle v = new Vehicle("car", "small car", 100);
		System.out.println(v.toString());
		
		Vehicle v2 = new Vehicle();
		System.out.println(v2.toString());

	}
}
