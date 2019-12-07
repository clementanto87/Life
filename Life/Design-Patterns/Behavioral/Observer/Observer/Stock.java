package com.designpattern.observer;

import java.util.*;

public class Stock implements Observerable{
	
	private List<Observer> observers;
	private String name;
	private int price;
	
	Stock(){
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer observer) {
		if(observer!=null)
		{
			this.observers.add(observer);
		}
		
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		observers.forEach((i) -> {
			i.update(this);
		});
		
	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		if(observers!=null)
		{
			observers.remove(observer);
		}
		
	}

	public void updateStockPrice(int updatePrice){
		this.price = updatePrice;
		this.notifyObserver();
	}
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

}
