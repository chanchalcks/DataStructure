package com.app.datastructure.execution;

import com.app.datastructure.service.DoubLeLinkedListImpl;

public class DoubleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoubLeLinkedListImpl dlist=new DoubLeLinkedListImpl();
		
		dlist.insertAtFirstPosition(1);
		dlist.insertAtFirstPosition(2);
		dlist.insertAtFirstPosition(3);
		dlist.insertAtFirstPosition(4);
		dlist.insertAtFirstPosition(5);
		dlist.insertAtLastPosition(10);
		dlist.insertAtPosition(2, 55);
		dlist.display();
		System.out.println("------------------------");
		dlist.deleteAtPosition(2);
		dlist.display();
		System.out.println("-------Previous Display------------");
		dlist.displayInOppositeDirection();
		
		

	}

}
