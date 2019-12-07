package com.designpattern.observer;

public interface Observerable {

	public void registerObserver(Observer observer);
	public void notifyObserver();
	public void removeObserver(Observer observer);
}
