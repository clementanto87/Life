package com.designpattern.observer;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IBM ibm = new IBM();
		Infosys infosys = new Infosys();
		
		Mobile mobile = new Mobile();
		DeskTop desktop = new DeskTop();
		
		ibm.registerObserver(mobile);
		ibm.registerObserver(desktop);
		
		infosys.registerObserver(mobile);
		infosys.registerObserver(desktop);
		
		
		for(int i=0; i<3; i++){
			ibm.updateStockPrice((int)(Math.random()*101)+1);
			infosys.updateStockPrice((int)(Math.random()*101)+1);
		}
	}

}
