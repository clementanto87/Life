package com.designpattern.observer;

public class Mobile implements Observer {

	@Override
	public void update(Stock s) {
		// TODO Auto-generated method stub
		System.out.println("Mobile-Price of the stock "+s.getPrice()+" has changed for the "+s.getName());

	}

}
