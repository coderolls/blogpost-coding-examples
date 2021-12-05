package com.gaurav.ExProject.ArrayList;

import java.util.ArrayList;

/**
 * A Java program to remove an element from ArrayList
 * using the remove(int index) method.
 * 
 * @author Gaurav Kukade at coderolls.com
 *
 */
public class ArrayListRemoveExample2 {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		//adding elements to the arrayList using normal add method
		arrayList.add("Apple");
		arrayList.add("Orange");
		arrayList.add("Guava");
		arrayList.add("Banana");
		
		System.out.println("ArrayList before removing an element"+ arrayList); // ArrayList before removing an element[Apple, Orange, Guava, Banana]
		
		//Remove the element at the specified index i.e. 2
		//Remove "Guava" from the arrayList
		arrayList.remove(2);
		
		System.out.println("ArrayList after removing an element"+ arrayList);// ArrayList after removing an element[Apple, Orange, Banana]
	}
}
