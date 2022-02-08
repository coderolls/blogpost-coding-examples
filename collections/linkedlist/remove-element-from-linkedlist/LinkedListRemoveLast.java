package com.gaurav.ExProject.LinkedList;

import java.util.LinkedList;

/**
 * A Java program to remove last element from 
 * the linkedList using the removeLast() method.
 * 
 * @author coderolls.com
 *
 */
public class LinkedListRemoveLast {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("BHIM");
		linkedList.add("PayTM");
		linkedList.add("Freecharge");
		linkedList.add("PhonePe");
		linkedList.add("JioPay");
		
		System.out.println("LinkedList before removing an element:");
		System.out.println(linkedList);
		
		// removes first element i.e. removes BHIM
		linkedList.removeLast();
		
		System.out.println("\nLinkedList after removing an element using removeLast() method:");
		System.out.println(linkedList);
	}
}
