package com.gaurav.ExProject.LinkedList;

import java.util.LinkedList;

/**
 * A Java program to get an element from
 * the linkedlist by it's index.
 * 
 * @author coderolls.com
 */
public class LinkedListGetElement {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Adidas");
		linkedList.add("Air");
		linkedList.add("Nike");
		linkedList.add("Puma");
		linkedList.add("Reebok");
		
		System.out.println("LinkedList: ");
		System.out.println(linkedList);
		
		// get element at index 3
		String element = linkedList.get(3); // Puma
		
		System.out.println("\nElement at index 3 is: "+ element);
	}
}
