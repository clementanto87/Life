package com.dp.Factory;

public class ServerComputer implements Computer{


	private int id;
	private String brand;
	private double price;
	
	public ServerComputer(int id, String brand, double price) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ServerComputer [id=" + id + ", brand=" + brand + ", price=" + price + "]";
	}


}