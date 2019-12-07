package com.ds.Tree;

public class Tree {

	private Node head;

	public void add(int data) {
		Node node = new Node();
		node.data = data;
		node.left = null;
		node.right = null;

		if (head == null) {
			head = node;
			return;
		}

		Node n = head;
		while (true) {
			if (n.data < data) {
				if (n.left == null) {
					n.left = node;
					break;
				} else {
					n = n.left;
				}
			} else {
				if (n.right == null) {
					n.right = node;
					break;
				} else {
					n = n.right;
				}
			}
		}

	}

	public void showValue(Node n) {

		if (n == null)
			return;
		
		showValue(n.right);
		System.out.println(n.data);
		showValue(n.left);

	}

	public void show() {
		showValue(head);
	}
}
