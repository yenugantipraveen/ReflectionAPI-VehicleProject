package com.nit.hk.vehicle;

//inheritance + encapsulation + polymorphism
//full implementation

class Volvo extends Bus{
	
	@Override
	public void engine() {
		System.out.println("Volvo engine capacity 110 KMPH");
	}
	
	@Override
	public void breaks() {
		System.out.println("Volvo needs powerfull breaks");
	}
}
