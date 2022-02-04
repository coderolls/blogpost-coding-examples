package com.gaurav.ExProject.LinkedList;

import java.util.LinkedList;

/**
 * A java program to convert linkedlist to an array
 * using the toArray(T[] a) method.
 * 
 * @author coderolls.com
 *
 */
public class LinkedListToArray2 {

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
		
		// convert linkedList to String array
		String[] arr = linkedList.toArray(new String[linkedList.size()]);
		
		System.out.println("\nPrinting the String array elements: ");
		for(String str:arr) {
			System.out.println(str);
		}
	}
}
