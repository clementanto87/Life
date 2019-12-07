package com.dp.abstractfactory;

public class PC implements Computer{
	private String brand;
	private double price;
	private int id;
	public String getBrand() {
		return brand;
	}
	public PC(String brand, double price, int id) {
		super();
		this.brand = brand;
		this.price = price;
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public int getId() {
		return id;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "PC [brand=" + brand + ", price=" + price + ", id=" + id + "]";
	}

}
