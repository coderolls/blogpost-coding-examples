package com.gaurav.ExProject.LinkedList;

import java.util.LinkedList;

/**
 * A Java program to get the first index of the element from
 * the linkedlist using indexOf(Object o) method.
 * 
 * @author coderolls.com
 */
public class LinkedListIndexOf {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("PepsiCo");
		linkedList.add("DrPepper");
		linkedList.add("GoldSpot");
		linkedList.add("GoldSpot");
		linkedList.add("CocaCola");
		linkedList.add("Moxie");
		linkedList.add("GoldSpot");
		linkedList.add("Moxie");
		
		System.out.println("LinkedList: ");
		System.out.println(linkedList);
		
		// get first index of GoldSpot
		int index = linkedList.indexOf("GoldSpot"); // 2
		
		System.out.println("\nIndex of the GoldSpot in linkedList is: "+ index);
		
		// get first index of Moxie
		int indexMoxie = linkedList.indexOf("Moxie"); // 5
		
		System.out.println("\nIndex of the Moxie in linkedList is: "+ indexMoxie);
	}
}
