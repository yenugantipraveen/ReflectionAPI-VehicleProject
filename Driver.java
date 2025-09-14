package com.nit.hk.vehicle;

//LC-RP

public class Driver {
	
	void driver(Vehicle v) {
		//Runtime polymorphism
		v.engine();
		v.breaks();
	}
}
