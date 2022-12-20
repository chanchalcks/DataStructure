package com.app.datastructure.model;

public class Nodes {

	private int data;
	private Nodes next;
	private Nodes previous;

	public Nodes() {
	}

	public Nodes(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Nodes getNext() {
		return next;
	}

	public void setNext(Nodes next) {
		this.next = next;
	}

	public Nodes getPrevious() {
		return previous;
	}

	public void setPrevious(Nodes previous) {
		this.previous = previous;
	}

}
