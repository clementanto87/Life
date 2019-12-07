package com.designpattern.observer;

public class BillBoard implements Observer {

	@Override
	public void update(Stock s) {
		// TODO Auto-generated method stub
		System.out.println("BillBoard-Price of the stock "+s.getPrice()+" has changed for the "+s.getName());
	}

}
