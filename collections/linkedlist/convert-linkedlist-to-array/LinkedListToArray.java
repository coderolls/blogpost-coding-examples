package com.gaurav.ExProject.LinkedList;

import java.util.LinkedList;

/**
 * A java program to convert linkedlist to an array
 * using the toArray() method.
 * 
 * @author coderolls.com
 *
 */
public class LinkedListToArray {

	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Walmart");
		linkedList.add("Amazon");
		linkedList.add("Apple");
		linkedList.add("Microsoft");
		linkedList.add("Google");
		linkedList.add("Uber");
		linkedList.add("Tesla");
		
		System.out.println("Printing the linkedList: ");
		System.out.println(linkedList);
		
		// convert linkedList to Object[]
		Object[] arr = linkedList.toArray();
		
		System.out.println("\nPrinting the object array elements: ");
		for(Object obj:arr) {
			System.out.println(obj.toString());
		}
	}
}
