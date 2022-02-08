package com.gaurav.ExProject.LinkedList;

import java.util.LinkedList;

/**
 * A Java program to remove element at the specified position i.e. index
 * from the linkedList using the remove(int index) method.
 * 
 * @author coderolls.com
 */
public class LinkedListRemoveObjectByIndex {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("BHIM");
		linkedList.add("PayTM");
		linkedList.add("Freecharge");
		linkedList.add("PhonePe");
		linkedList.add("JioPay");
		
		System.out.println("LinkedList before removing an element:");
		System.out.println(linkedList);
		
		// removes the element at index 3 i.e. removes PhonePe
		linkedList.remove(3);
		
		System.out.println("\nLinkedList after removing an element using remove(int index) method:");
		System.out.println(linkedList);
	}
}
