package com.dp.Factory;

public class App {
	
	public static void main(String[] args){
		Computer c = FactoryClass.getInstance(101, "DELL", 325486.32, "PC");
		
		System.out.println("Computer Instance: "+c);
	}

}
