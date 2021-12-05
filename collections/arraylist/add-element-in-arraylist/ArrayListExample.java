package com.gaurav.ExProject.ArrayList;

import java.util.ArrayList;

/**
 * A Java program to add an element to the list.
 * 
 * The add(E e) method will add an element to 
 * the end of the arrayList.
 * 
 * @author Guarav Kukade at coderolls.com
 *
 */
public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		//adding elements to the arrayList
		arrayList.add("Gaurav");
		arrayList.add("Shyam");
		
		System.out.println(arrayList);// [Gaurav, Shyam]
		
		// adding an element to  the arrayList
		// element will be added to the end of the arrayList
		arrayList.add("Saurav");
		
		System.out.println(arrayList); // [Gaurav, Shyam, Saurav]

	}

}
