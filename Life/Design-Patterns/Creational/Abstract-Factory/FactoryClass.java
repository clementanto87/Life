package com.dp.abstractfactory;

public class FactoryClass {
	
	public static Computer getInstance(CreateComputer comp){
		return comp.createInstance();
	}

}
