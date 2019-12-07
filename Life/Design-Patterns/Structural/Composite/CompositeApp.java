package com.dp.composite;

public class CompositeApp {

	public static void main(String[] args){
		Component monitor = new Leaf("Monitor", 325.60);
		Component keyBoard = new Leaf("KeyBoard", 500.00);
		Component mouse = new Leaf("Mouse",402.36);
		Component hardDisk = new Leaf("Hard-Disk",6000);
		Component motherBoard = new Leaf("Mother-Board",5489.32);
		
		Composite externalDevice = new Composite("External Device");
		externalDevice.addComponent(mouse);
		externalDevice.addComponent(keyBoard);
		externalDevice.addComponent(monitor);
		
		Composite internalDevice = new Composite("Internal Device");
		internalDevice.addComponent(hardDisk);
		internalDevice.addComponent(motherBoard);
		
		externalDevice.showPrice();
		internalDevice.showPrice();
		
	}
}
