package com.gaurav.ExProject.ArrayList;

import java.util.ArrayList;

/**
 * A java program to change an element at 
 * particular index in ArrayList.
 * 
 * We can use 'public E set(int index, E element)' method
 * to change an element.
 * 
 * @author Guarav Kukade at coderolls.com
 *
 */
public class ArrayListSetExample {

	public static void main(String[] args) {
ArrayList<String> arrayList = new ArrayList<String>();
		
		//adding elements to the arrayList using normal add method
		arrayList.add("Gaurav");
		arrayList.add("Shyam");
		arrayList.add("Pradnya");
		
		System.out.println(arrayList);// [Gaurav, Shyam, Pradnya]
		
		// change an element at index 1
		arrayList.set(1, "Saurav");
		
		System.out.println(arrayList); // [Gaurav, Saurav, Pradnya]

	}

}
