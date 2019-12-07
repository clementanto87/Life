package com.dp.abstractfactory;

public class PCAbstract implements CreateComputer{

	
	private String brand;
	private double price;
	private int id;
	
	
	public PCAbstract(String brand, double price, int id) {
		super();
		this.brand = brand;
		this.price = price;
		this.id = id;
	}
	
	@Override
	public Computer createInstance() {
		// TODO Auto-generated method stub
		return new PC(brand, price, id);
	}

}
