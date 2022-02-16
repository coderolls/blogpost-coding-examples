package com.gaurav.ExProject.LinkedList;

import java.util.LinkedList;
import java.util.List;

/**
 * A java program to iterate over linkedList
 * using the java 8 foreach method.
 * 
 * @author coderolls.com
 */
public class LinkedListForEachMethod {

	public static void main(String[] args) {

		List<String> linkedList = new LinkedList<String>();

		linkedList.add("Mango");
		linkedList.add("Banana");
		linkedList.add("Grapes");
		linkedList.add("Watermelon");
		linkedList.add("Apple");
		linkedList.add("Avocado");

		System.out.println("Iterating through LinkedList using forEach method and lamda expression........\n");

		// add lambda expression in the foreach method
		linkedList.forEach(s -> System.out.println("Object form the LinkedList is " + s));
	}
}
