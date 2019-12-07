package com.dp.abstractfactory;

public class ClientApp {

	public static void main(String[] args){
		Computer c = FactoryClass.getInstance(new ServerAbstract("DELL", 25361.00, 101));
		System.out.println(c);
	}
}
