package com.nit.hk.vehicle;

class Orange extends Bus{
	@Override
	public void engine() {
		System.out.println("Orange engine capacity 80 KMPH");
	}
	
	@Override
	public void breaks() {
		System.out.println("Orange disc breaks");
	}
}
