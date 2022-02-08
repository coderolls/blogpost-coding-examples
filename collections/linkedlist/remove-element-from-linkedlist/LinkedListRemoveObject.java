package com.gaurav.ExProject.LinkedList;

import java.util.LinkedList;

/**
 * A Java program to remove the specified element from 
 * the linkedList using the remove(Object o) method.
 * 
 * @author coderolls.com
 *
 */
public class LinkedListRemoveObject {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("BHIM");
		linkedList.add("PayTM");
		linkedList.add("Freecharge");
		linkedList.add("PhonePe");
		linkedList.add("JioPay");
		
		System.out.println("LinkedList before removing an element:");
		System.out.println(linkedList);
		
		// removes the specified element i.e. removes Freecharge
		linkedList.remove("Freecharge");
		
		System.out.println("\nLinkedList after removing an element using remove(Object o) method:");
		System.out.println(linkedList);
	}
}
