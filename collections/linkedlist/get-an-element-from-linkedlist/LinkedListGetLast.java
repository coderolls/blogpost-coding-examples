package com.gaurav.ExProject.LinkedList;

import java.util.LinkedList;

/**
 * A Java program to get the last element of
 * the linkedlist using getLast() method.
 * 
 * @author coderolls.com
 */
public class LinkedListGetLast {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Adidas");
		linkedList.add("Air");
		linkedList.add("Nike");
		linkedList.add("Puma");
		linkedList.add("Reebok");
		
		System.out.println("LinkedList: ");
		System.out.println(linkedList);
		
		// get first element
		String element = linkedList.getLast(); // Adidas
		
		System.out.println("\nLast element of the linkedList is: "+ element);
	}
}
