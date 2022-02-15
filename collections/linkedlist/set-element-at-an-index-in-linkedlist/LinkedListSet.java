package com.gaurav.ExProject.LinkedList;

import java.util.LinkedList;

/**
 * A java program to set an element at specified index
 * using the set(int index, E element) method.
 * 
 * @author coderolls.com
 */
public class LinkedListSet {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("IN");
		linkedList.add("US");
		linkedList.add("FR");
		linkedList.add("JP");
		linkedList.add("CN");
		linkedList.add("RU");
		
		System.out.println("LinkedList before setting an element at index 4:");
		System.out.println(linkedList);
		
		// replaces CN with BR 
		// returns the previously present element at index 4 i.e CN
		String previousElement = linkedList.set(4, "BR");
		
		System.out.println("\nLinkedList after setting an element BR at index 4:");
		System.out.println(linkedList);
		
		System.out.println("\nPreviously present element at index 4:");
		System.out.println(previousElement);
	}
}
