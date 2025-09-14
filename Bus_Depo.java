package com.nit.hk.vehicle;

public class Bus_Depo {
	public static void main(String[] args) {
		
		Driver praveen = new Driver();
		
		//praveen.driver(new RedBus());     //TC[Tight Coupling]
		//praveen.driver(new Express());    //TC
		//praveen.driver(new Orange());     //TC
		//praveen.driver(new Volvo());      //TC
		//praveen.drive(???);               //How can we make LC[Loose Coupling]
	}

}
