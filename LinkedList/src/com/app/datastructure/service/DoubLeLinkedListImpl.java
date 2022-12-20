package com.app.datastructure.service;

import com.app.datastructure.model.Nodes;

public class DoubLeLinkedListImpl {

	private Nodes start = null;
	private Nodes end = null;
	private int size = 0;

	public void insertAtFirstPosition(int value) {

		Nodes node = new Nodes(value);
		if (start == null) {
			start = node;
			end = start;
		} else {

			node.setNext(start);
			start.setPrevious(node);
			start = node;

		}
		size++;

	}

	public void insertAtLastPosition(int value) {

		Nodes node = new Nodes(value);
		if (start == null) {
			start = node;
			end = start;
		} else {

			node.setPrevious(end);
			end.setNext(node);
			end = node;

		}
		size++;
	}

	public void insertAtPosition(int position, int value) {

		if (position == 1) {
			insertAtFirstPosition(value);
			return;
		}

		Nodes ntpr = start;

		for (int i = 2; i <= size; i++) {
			if (i == position) {
				Nodes temp = ntpr.getNext();
				Nodes node = new Nodes(value);
				ntpr.setNext(node);
				node.setPrevious(ntpr);
				node.setNext(temp);

			}

			ntpr = ntpr.getNext();

		}
		size++;
	}

	public void deleteAtPosition(int position) {

		if (position == 1) {
			if (size == 1) {
				start = null;
				end = null;
			}
			start = start.getNext();
			start.setPrevious(null);
			size--;
		}

		Nodes node = start;
		for (int i = 2; i <= size; i++) {
			if (i == position) {
				Nodes temp = node.getNext();
				Nodes nextNode = temp.getNext();
				node.setNext(nextNode);
				nextNode.setPrevious(node);
				size--;
			}

		}

	}

	public void display() {
		Nodes node = start;

		while (node != null) {
			System.out.println(node.getData());
			node = node.getNext();
		}

	}

	public void displayInOppositeDirection() {
		Nodes node = end;
		while (node != null) {
			System.out.println(node.getData());
			node=node.getPrevious();
		}
	}

	public int size() {
		return size;
	}

}
