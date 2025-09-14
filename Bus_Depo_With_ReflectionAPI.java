package com.nit.hk.vehicle;

import java.util.Scanner;

public class Bus_Depo_With_ReflectionAPI {
	
	public static void main(String[] args)
	                           throws ClassNotFoundException,
	                                  InstantiationException,
	                                  IllegalAccessException{
		try {
		
		Driver praveen = new Driver();
		//praveen.driver(new RedBus());     
		//praveen.driver(new Express());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Vehicle name:  ");
		String VehicleName = sc.nextLine();
		
		try {
		//Reflection API
		Class cs = Class.forName(VehicleName);
		Object obj = cs.newInstance();
		
		//Type casting the loaded class object to it's super class type
		
		if(obj instanceof Vehicle) {
			Vehicle vehicle = (Vehicle)obj;
			praveen.driver(vehicle);
			
			//passing object as argument to driver() method
			}else {
			System.out.println(VehicleName + "is not a Vehicle");
			}
		
		}catch(ClassNotFoundException e) {
		System.out.println(VehicleName + " class not found!");
		}
		
		}catch(Exception e) {
	     e.printStackTrace();
	    }
	}
}
		
