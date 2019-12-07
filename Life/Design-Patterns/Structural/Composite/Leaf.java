package com.dp.composite;

public class Leaf implements Component {

	private String name;
	private double price;
	
	public Leaf(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public void showPrice() {
		// TODO Auto-generated method stub
		System.out.println("Name of Component "+name+" and its price: "+price);
	}

}
