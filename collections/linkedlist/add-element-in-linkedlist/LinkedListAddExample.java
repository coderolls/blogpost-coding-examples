package com.gaurav.ExProject.LinkedList;

import java.util.LinkedList;

/**
 * A Java program to add an element to the LinkedList.
 * 
 * The add(E e) method will add an element to 
 * the end of the linkedList.
 * 
 * @author coderolls.com
 *
 */
public class LinkedListAddExample {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		//adding elements to the linkedList
		linkedList.add("John");
		linkedList.add("Peter");
		
		System.out.println(linkedList);// [John, Peter]
		
		// adding an element to the linkedList
		// element will be added to the end of the linkedList
		linkedList.add("Noah");
		
		System.out.println(linkedList); // [John, Peter, Noah]
	}
}
