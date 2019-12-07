package com.dp.Factory;

public class FactoryClass {

	public static Computer getInstance(int id,String name, double price,String type){
		
		if(type.equals("PC"))
			return new PCComputer(id, name, price);
		else return new ServerComputer(id, name, price);
		
		}
}
