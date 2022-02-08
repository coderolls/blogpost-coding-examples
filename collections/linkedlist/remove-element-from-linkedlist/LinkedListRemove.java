package com.gaurav.ExProject.LinkedList;

import java.util.LinkedList;

/**
 * A Java program to remove head element from 
 * the linkedList using the remove() method.
 * 
 * @author coderolls.com
 *
 */
public class LinkedListRemove {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("BHIM");
		linkedList.add("PayTM");
		linkedList.add("Freecharge");
		linkedList.add("PhonePe");
		linkedList.add("JioPay");
		
		System.out.println("LinkedList before removing an element:");
		System.out.println(linkedList);
		
		// removes head(first element) i.e. removes BHIM
		linkedList.remove();
		
		System.out.println("\nLinkedList after removing an element using remove() method:");
		System.out.println(linkedList);
	}
}
