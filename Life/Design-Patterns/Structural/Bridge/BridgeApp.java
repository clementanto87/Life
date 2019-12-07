package com.dp.bridge;

public class BridgeApp {

	public static void main(String[] args){
		Vehicle vehicle = new Car(new Produce(), new Assemble());
		vehicle.createVehicle();
	}
}
