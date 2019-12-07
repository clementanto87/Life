package com.ds.stack;

import java.util.Arrays;

public class Stack {

	int capacity = 5;
	int[] stack = new int[capacity];
	int size = 0;

	public void add(int data) {
		if (isFull()) {
			increaseCapacity();
		}
		stack[size] = data;
		size++;
	}

	public void increaseCapacity() {
		capacity = capacity * 2;
		stack = Arrays.copyOf(stack, capacity);
	}

	public void show() {
		Arrays.stream(stack).forEach(System.out::println);
	}

	public void peek() {
		if (getSize() <= 0) {
			System.out.println("Stack is Empty");
			return;
		}
		int data = 0;
		data = stack[size - 1];
		System.out.println("Peek Value: " + data);
	}

	public void pop() {
		if (getSize() <= 0) {
			System.out.println("Stack is Empty");
			return;
		}
		int data = 0;
		data = stack[size - 1];
		stack[size - 1] = 0;
		size--;
		System.out.println("Pop Value: " + data);
	}

	public int getSize() {
		return size;
	}

	public boolean isFull() {
		if (getSize() == capacity) {
			return true;
		} else
			return false;
	}
}
