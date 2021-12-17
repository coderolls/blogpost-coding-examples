package com.gaurav.ExProject.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * A Java program to add all elements of the specified collection
 * to the end of the ArrayList
 * 
 * @author Gaurav Kukade at coderolls.com
 *
 */
public class ArrayListAddAllExample {

	public static void main(String[] args) {
		
		// ArrayList contains actresses
		List<String> actresses1 = new ArrayList<String>();
		
		actresses1.add("Natalie Portman");
		actresses1.add("Abigail Anderson");
		actresses1.add("Jennifer Lawrence");
		
		System.out.println("Actresses collection 1: \n"+ actresses1 );
		
		// ArrayList contains actresses
		List<String> actresses2 = new ArrayList<String>();
		
		
		
		actresses2.add("Angelina Jolie");
		actresses2.add("Scarlett Johansson");
		
		System.out.println("Actresses collection 2: \n"+ actresses2);
		
		// Add actresses2 collections all elements to actresses1 collection using addAll()method
		actresses1.addAll(actresses2);
		
		System.out.println("Actresses : \n"+ actresses1);
	}
}
