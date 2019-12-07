package com.dp.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
	
	private String name;
	private List<Component> components = new ArrayList<>();

	public Composite(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void showPrice() {
		// TODO Auto-generated method stub
		System.out.println("Name of the Component: "+name);
		components.stream().forEach(Composite::callShowPriceMethod);
	}
	
	public static void callShowPriceMethod(Component components){
		components.showPrice();
	}


	public void addComponent(Component component){
		components.add(component);
	}
}
