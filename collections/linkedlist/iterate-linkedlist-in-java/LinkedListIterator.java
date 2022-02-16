package com.gaurav.ExProject.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * A java program to iterate through LinkedList using Iterator interface.
 * 
 * @author coderolls.com
 *
 */
public class LinkedListIterator {

	public static void main(String[] args) {
		List<String> linkedList = new LinkedList<String>();

		linkedList.add("Mango");
		linkedList.add("Banana");
		linkedList.add("Grapes");
		linkedList.add("Watermelon");
		linkedList.add("Apple");
		linkedList.add("Avocado");
		System.out.println("Iterating through LinkedList using Iterator interface........\n");

		// getting iterator
		Iterator<String> iterator = linkedList.iterator();

		// hasNext() returns true only if object is available at next call
		while (iterator.hasNext()) {

			// next() returns obejct, we can cast it to reuqired type
			String str = iterator.next();
			System.out.println("Object form the LinkedList is " + str);
		}
	}
}