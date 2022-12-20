package com.app.datastructure.model;

public class Node {

	private int value;
	private Node next;

	public Node() {
	}

	public Node(int value, Node node) {
		this.value = value;
		this.next = node;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
