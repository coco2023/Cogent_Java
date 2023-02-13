package com.cogent.inheriMachine;

public class Tester {
	public static void main(String[] args) {
	
		Machine m = new Machine();
		m.switchOn();
		
		WashingMachine wm = new WashingMachine();
		wm.switchOn();
		wm.washCLothes();
		
		AC ac = new AC();
		ac.switchOn();
		ac.tempControl();
	
	}
}
