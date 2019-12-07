package com.ds.linkedlist;

public class App {
	
	public static void main(String[] args){
		LinkedList list = new LinkedList();
		list.add(101);
		list.add(102);
		list.add(103);
		list.add(104);
		list.add(105);
		
		//list.insert(1, 1002);
		list.remove(1);
		
		list.show();
	}

}
