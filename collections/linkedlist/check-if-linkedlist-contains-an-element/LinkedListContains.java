package com.gaurav.ExProject.LinkedList;

import java.util.LinkedList;

/**
 * A Java program to check if the element is present 
 * in the linkedList using the contains(Object o) method.
 * 
 * @author coderolls.com
 *
 */
public class LinkedListContains {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("Uber");
		linkedList.add("Ola");
		linkedList.add("Didi");
		linkedList.add("Lyft");
		linkedList.add("Yandex");
		
		System.out.println("LinkedList is as follows: \n"+ linkedList);

		
		// checks if the linkedList contains "Ola"
		// returns true if present
		boolean isOlaPresnet = linkedList.contains("Ola"); // true
		
		System.out.println("\nCheck if linkedList contains Ola: "+ isOlaPresnet);

		// checks if the linkedList contains "Grab"
		// returns true if present
		boolean isGrabPresnet = linkedList.contains("Grab"); // false
		
		System.out.println("\nCheck if linkedList contains Grab: "+ isGrabPresnet);
		
	}
}
