package com.app.datastructure.execution;

import com.app.datastructure.service.SingleLinkedListImpl;

public class SingleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addToFirstPosition();
		addToLastPosition();
	}
	
	public static void addToLastPosition() {
		SingleLinkedListImpl singleLinkedList = new SingleLinkedListImpl();
		singleLinkedList.addToLastPosition(1);
		singleLinkedList.addToLastPosition(2);
		singleLinkedList.addToLastPosition(3);
		singleLinkedList.addToLastPosition(4);
		singleLinkedList.addToLastPosition(5);
		singleLinkedList.addToLastPosition(6);
		singleLinkedList.display();
	
	}
	
	

	public static void addToFirstPosition() {
		SingleLinkedListImpl singleLinkedList = new SingleLinkedListImpl();

		singleLinkedList.addToFirstPosition(1);
		singleLinkedList.addToFirstPosition(2);
		singleLinkedList.addToFirstPosition(3);
		singleLinkedList.addToFirstPosition(4);
		singleLinkedList.addToFirstPosition(5);
		singleLinkedList.addToFirstPosition(6);
		singleLinkedList.addToFirstPosition(7);
		singleLinkedList.addToFirstPosition(8);
		singleLinkedList.addToFirstPosition(9);

		singleLinkedList.display();
	}

}
