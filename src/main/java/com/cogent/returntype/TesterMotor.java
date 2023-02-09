package com.cogent.returntype;

public class TesterMotor {

	public static void main(String[] args) {
		Motor motor1 = new Motor();
//		
//		System.out.println("current speed: " + motor1.speed(5));
//		
//		motor1.motorspeed = 10;
//		motor1.speed(5);
		
		System.out.println(motor1.speed(4));
		System.out.println(motor1.speed(3));
		System.out.println(motor1.speed(2));
		
		int result = motor1.speed(7);
		System.out.println(result);
		
	}
}
