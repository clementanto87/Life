package com.ds.Queue;

import java.util.Arrays;

public class Queue {
	
	private int capacity = 5;
	private int queue[] = new int[capacity];
	private int front = 0;
	private int rear = 0;
	private int size = 0;
	
	public void add(int data){
		if(isFull()) increaseCapacity();
		queue[rear] = data;
		//rear = (rear + 1)%capacity;
		rear++;
		size++;
	}
	
	public void increaseCapacity(){
		queue = Arrays.copyOf(queue, capacity*2);
	}
	public void show(){
		for(int i=0;i<size;i++){
			//System.out.println(queue[(i+front)%capacity]);
			System.out.println(queue[(i+front)]);
		}
	}
	
	public void peek(){
		if(getSize() == 0){System.out.println("Queue Empty"); return; }
		int data = 0;
		data = queue[front];
		System.out.println("Peek Data: "+ data);
	}

	public void pop(){
		if(getSize() == 0){System.out.println("Queue Empty"); return; }
		int data = 0;
		data = queue[front];
		//front = (front+1)%capacity;
		front++;
		size--;
		System.out.println("Pop Data: "+data);
	}
	
	public int getSize(){
		return size;
	}
	public boolean isFull(){
		if(getSize() == capacity){
			return true;
		}
		else return false;
	}
	
}
