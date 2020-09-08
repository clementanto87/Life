package com;

public class Test {

    Node head;

    public void add(int data) {
        head = addData(head, data);
    }

    public Node addData(Node n, int data) {
        if (n == null) {
            return n = new Node(data);
        }
        if (data < n.data) {
            n.left = addData(n.left, data);
        } else if (data > n.data) {
            n.right = addData(n.right, data);
        }

        return n;
    }

    public void show() {
        display(head);
    }

    public void display(Node n) {
        if (n == null) {
            return;
        }

        display(n.left);
        System.out.println(n.data);
        display(n.right);
    }

    public static void main(String[] args) {
        Test test = new Test();

        test.head = new Node(4);
        test.head.left = new Node(2);
        test.head.left.right = new Node(1);
        test.head.right = new Node(5);
        test.head.left.right = new Node(3);

        test.show();
    }
}


class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }


}
