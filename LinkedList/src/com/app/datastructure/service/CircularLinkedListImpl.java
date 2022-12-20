package com.app.datastructure.service;

import com.app.datastructure.model.Nodes;

public class CircularLinkedListImpl {

	private Nodes start = null;
	private Nodes end = null;
	private int size = 0;

	public void insertAtFirst(int value) {

		Nodes node = new Nodes(value);
		if (start == null) {
			start = node;
			end = start;
		} else {
			node.setNext(start);
			start = node;
			end = start;
		}
		size++;
	}

	public void insertAtLast(int value) {

		Nodes node = new Nodes(value);
		if (start == null) {
			start = node;
			end = start;
		} else {
			end.setNext(node);
			end = node;
			node.setNext(start);
		}
		size++;

	}

	public void insertAtPosition(int position, int value) {

	}

	public void deleteAtPosition(int position) {

	}

	public void display() {

		
		
	}

}
