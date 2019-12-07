package com.dp.abstractfactory;

public class ServerAbstract implements CreateComputer {

	private String brand;
	private double price;
	private int id;
	
	
	public ServerAbstract(String brand, double price, int id) {
		super();
		this.brand = brand;
		this.price = price;
		this.id = id;
	}


	@Override
	public Computer createInstance() {
		// TODO Auto-generated method stub
		return new Server(brand, price, id);
	}

}
