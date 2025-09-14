package com.nit.hk.vehicle;

//abstraction +  inheritance + encapsulation + polymorphism
//(partial abstraction)

abstract class Bus implements Vehicle {
	
	@Override
	public void breaks() {
		System.out.println("Bus has normal breaks");
	}
}
