package com.gaurav.ExProject.LinkedList;

import java.util.LinkedList;

public class LinkedListAddFirst {

	public static void main(String[] args) {
	
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Austin");
		linkedList.add("Boston");
		linkedList.add("Atlanta");
		linkedList.add("Madison");
		linkedList.add("Columbia");
		
		System.out.println(linkedList);
		
		// add element at the beginning
		linkedList.addFirst("Albany");
		System.out.println(linkedList);

	}

}
