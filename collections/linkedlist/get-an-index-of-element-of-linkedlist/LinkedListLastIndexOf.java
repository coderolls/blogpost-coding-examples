package com.gaurav.ExProject.LinkedList;

import java.util.LinkedList;

/**
 * A Java program to get the last index of the element from
 * the linkedlist using lastIndexOf(Object o) method.
 * 
 * @author coderolls.com
 */
public class LinkedListLastIndexOf {

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
		int index = linkedList.lastIndexOf("GoldSpot"); // 6
		
		System.out.println("\nIndex of the GoldSpot in linkedList is: "+ index);
		
		// get first index of Moxie
		int indexMoxie = linkedList.lastIndexOf("Moxie"); // 7
		
		System.out.println("\nIndex of the Moxie in linkedList is: "+ indexMoxie);
	}
}
