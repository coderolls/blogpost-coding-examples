package com.gaurav.ExProject.LinkedList;

import java.util.LinkedList;
/**
 * A Java program to prove that LinkedList Allows null values
 * @author coderolls.com
 *
 */
public class LinkedAllowDuplicates {

	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("John");
		linkedList.add(null);
		linkedList.add("Mark");
		linkedList.add(null);
		linkedList.add("Ruby");
		linkedList.add("Lucy");
		linkedList.add("Vikram");
		linkedList.add(null);
		
		System.out.println(linkedList);
	}
}
