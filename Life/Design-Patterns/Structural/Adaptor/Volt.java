package com.dp.adapter;

public class Volt {
	
	private int volt;	

	public Volt(){
		
	}
	public Volt(int volt){
		this.volt = volt;
	}
	
	public int getVolt(){
		return (120);
	}
	@Override
	public String toString() {
		return "Volt [volt=" + volt + "]";
	}

}
