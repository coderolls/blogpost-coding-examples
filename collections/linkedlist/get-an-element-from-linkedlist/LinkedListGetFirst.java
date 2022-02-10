package com.gaurav.ExProject.LinkedList;

import java.util.LinkedList;

/**
 * A Java program to get the first element from
 * the linkedlist using getFirst() method.
 * 
 * @author coderolls.com
 */
public class LinkedListGetFirst {

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
		String element = linkedList.getFirst(); // Adidas
		
		System.out.println("\nFirst element of the linkedList is: "+ element);
	}
}
