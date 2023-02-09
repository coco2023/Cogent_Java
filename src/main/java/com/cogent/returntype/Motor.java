package com.cogent.returntype;

public class Motor {

	int motorspeed = 10;
	
	int speed(int accelerator) {
		// process
		motorspeed = motorspeed * accelerator;
		
		return motorspeed;
	}
	
}
