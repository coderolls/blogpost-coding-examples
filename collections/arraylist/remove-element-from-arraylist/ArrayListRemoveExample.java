package com.gaurav.ExProject.ArrayList;

import java.util.ArrayList;

/**
 * A Java program to remove an element from ArrayList
 * using the remove(Object o) method.
 * 
 * @author Gaurav Kukade at coderolls.com
 *
 */
public class ArrayListRemoveExample {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		//adding elements to the arrayList using normal add method
		arrayList.add("Red");
		arrayList.add("Green");
		arrayList.add("Pink");
		
		System.out.println("ArrayList before removing an element"+ arrayList); // ArrayList before removing an element[Red, Green, Pink]
		
		//Remove "Pink" from the arrayList
		arrayList.remove("Pink");
		
		System.out.println("ArrayList after removing an element"+ arrayList);// ArrayList after removing an element[Red, Green]
	}
}
