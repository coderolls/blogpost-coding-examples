package com.gaurav.ExProject.LinkedList;

import java.util.LinkedList;

public class LinkedListAddLast {

	public static void main(String[] args) {
	
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Austin");
		linkedList.add("Boston");
		linkedList.add("Atlanta");
		linkedList.add("Madison");
		linkedList.add("Columbia");
		
		System.out.println(linkedList);
		
		// add element at the end
		linkedList.addLast("Albany");
		System.out.println(linkedList);

	}

}
