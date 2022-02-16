package com.gaurav.ExProject.LinkedList;

import java.util.LinkedList;
import java.util.List;

/**
 * A java program to iterate over linkedList
 * using the foreach loop.
 * 
 * @author coderolls.com
 *
 */
public class LinkedListForeachLoop {

	public static void main(String[] args) {

		List<String> linkedList = new LinkedList<String>();

		linkedList.add("Mango");
		linkedList.add("Banana");
		linkedList.add("Grapes");
		linkedList.add("Watermelon");
		linkedList.add("Apple");
		linkedList.add("Avocado");

		System.out.println("Iterating through LinkedList using the foreach loop!\n");
		
		// iterate over linkedList using foreach loop
		for (String str: linkedList) {
			System.out.println("Object form the LinkedList is "+str);
		}
	}
}
