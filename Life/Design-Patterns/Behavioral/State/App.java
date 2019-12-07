package com.designpattern.state;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context = new Context();
		TVOnState onState = new TVOnState();
		TVOffState offState = new TVOffState();
		
		context.setState(onState);
		context.setState(offState);
		
		context.doAction();
	}

}
