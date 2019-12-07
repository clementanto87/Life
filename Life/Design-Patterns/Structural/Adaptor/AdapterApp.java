package com.dp.adapter;

public class AdapterApp {
	public static void main(String[] args){
		GenetateVolt genetateVolt = new GenetateVolt();
		Volt volt = genetateVolt.get30Volt();
		System.out.println(volt);
	}

}
