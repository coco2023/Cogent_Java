package com.cogent.interfacePrac;

public interface PayRoll {
	default void payRoleCal() {
		System.out.println("This is PayRoll interface");
	}

	void add();

}
