package com.gaurav.ExProject.LinkedList;

import java.util.LinkedList;

/**
 * A Java program to add an element to the linkedlist
 * at the specific index.
 * 
 * The add(int index, E element) method will add 
 * an element at the specified index in LinkedList.
 * 
 * @author coderolls.com
 *
 */
public class LinkedListAddExample2 {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		//adding elements to the linkedList using normal add method
		linkedList.add("John");
		linkedList.add("Peter");
        linkedList.add("Karan");
		
		System.out.println(linkedList);// [John, Peter, Karan]
		
		// adding an element to  the LinkedList at index 1
		linkedList.add(1, "Noah");
		
		System.out.println(linkedList); // [John, Noah, Peter, Karan]
	}
}