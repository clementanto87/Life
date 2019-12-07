package com.dp.adapter;

//Class leved adaptior
public class GenetateVolt extends Volt implements VoltAdapter{
	
	//Object level adapter - composite relationship 
	//private Volt volt;

	@Override
	public Volt get120Volt() {
		// TODO Auto-generated method stub
		return createVolt(1);
	}

	@Override
	public Volt get30Volt() {
		// TODO Auto-generated method stub
		return createVolt(4);
	}

	@Override
	public Volt get10Volt() {
		// TODO Auto-generated method stub
		return createVolt(12);
	}
	
	public Volt createVolt(int n){
		
		//int data = new Volt().getVolt();
		int data = getVolt();
		
		return new Volt(data/n);
	}

}
