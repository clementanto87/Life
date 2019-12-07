package com.dp.bridge;

public class Car implements Vehicle{

	private WorkShop workShop1;
	private WorkShop workShop2;
	
	
	public Car(WorkShop workShop1, WorkShop workShop2) {
		super();
		this.workShop1 = workShop1;
		this.workShop2 = workShop2;
	}


	@Override
	public void createVehicle() {
		// TODO Auto-generated method stub
		workShop1.build();
		workShop2.build();
		
	}
	
	
}
