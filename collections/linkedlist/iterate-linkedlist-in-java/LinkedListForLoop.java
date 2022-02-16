package com.gaurav.ExProject.LinkedList;

import java.util.LinkedList;
import java.util.List;

/**
 * A java program to iterate over linkedList
 * using the basic for loop.
 * 
 * @author coderolls.com
 *
 */
public class LinkedListForLoop {

	public static void main(String[] args) {

		List<String> linkedList = new LinkedList<String>();

		linkedList.add("Mango");
		linkedList.add("Banana");
		linkedList.add("Grapes");
		linkedList.add("Watermelon");
		linkedList.add("Apple");
		linkedList.add("Avocado");

		System.out.println("Iterating through LinkedList using the basic for loop!\n");
		
		int len = linkedList.size();
		
		// iterate over linkedList using basic for loop
		for (int i = 0; i < len; i++) {
			
			// get String object from linkedList at index i
			String str = linkedList.get(i);
			System.out.println("Object form the LinkedList at " + i + " is " + str);
		}
	}
}
