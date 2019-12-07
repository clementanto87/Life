package com.dp.abstractfactory;

public class Server implements Computer{
	private String brand;
	private double price;
	private int id;
	
	public Server(String brand, double price, int id) {
		super();
		this.brand = brand;
		this.price = price;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Server [brand=" + brand + ", price=" + price + ", id=" + id + "]";
	}
	
	

}
