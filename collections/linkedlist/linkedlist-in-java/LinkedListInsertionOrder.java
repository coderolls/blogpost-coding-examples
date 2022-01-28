package com.gaurav.ExProject.LinkedList;

import java.util.LinkedList;
/**
 * A Java program to prove that LinkedList maintains insertion order
 * @author coderolls.com
 *
 */
public class LinkedListInsertionOrder {

	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("John");
		linkedList.add("Mark");
		linkedList.add("Ruby");
		linkedList.add("Lucy");
		linkedList.add("Vikram");
		
		System.out.println(linkedList);
	}
}
