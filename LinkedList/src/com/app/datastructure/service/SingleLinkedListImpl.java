package com.app.datastructure.service;

import com.app.datastructure.model.Node;

public class SingleLinkedListImpl {

	private Node head = null;
	private Node tail = null;
	private int size = 0;

	public void addToFirstPosition(int value) {
		Node node = new Node(value, null);
		if (head == null) {
			head = node;
			tail = head;

		} else {
			node.setNext(head);
			head = node;
		}

		size++;

	}

	public void addToLastPosition(int value) {

		Node node = new Node(value, null);

		if (head == null) {
			head = new Node(value, null);
			tail = head;
		} else {
			tail.setNext(node);
			tail = node;
		}
		size++;

	}

	public int getSize() {
		return size;
	}

	public void display() {

		if (head == null) {
			System.out.println("No Data found");
			return;
		}

		Node node = head.getNext();
		System.out.println(head.getValue());
		while (node != null) {

			System.out.println(node.getValue());
			node = node.getNext();

		}

	}

}
