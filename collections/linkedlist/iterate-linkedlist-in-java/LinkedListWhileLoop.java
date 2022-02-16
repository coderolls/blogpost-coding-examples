package com.gaurav.ExProject.LinkedList;

import java.util.LinkedList;
import java.util.List;

/**
 * A java program to iterate over linkedList
 * using the while loop.
 * 
 * @author coderolls.com
 *
 */
public class LinkedListWhileLoop {

	public static void main(String[] args) {

		List<String> linkedList = new LinkedList<String>();

		linkedList.add("Mango");
		linkedList.add("Banana");
		linkedList.add("Grapes");
		linkedList.add("Watermelon");
		linkedList.add("Apple");
		linkedList.add("Avocado");

		System.out.println("Iterating through LinkedList using the while loop!\n");
		
		int len = linkedList.size();
		
		// iterate over linkedList using while loop
		int i =0;
		
		while(i<len) {
			
			// get String object from linkedList at index i
			String str = linkedList.get(i);
			
			System.out.println("Object form the LinkedList is "+str);
			
			//increment index after getting the object
			i++;
		}
	}
}
