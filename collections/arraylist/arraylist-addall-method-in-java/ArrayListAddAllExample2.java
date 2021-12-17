package com.gaurav.ExProject.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * A Java program to add all elements of the specified collection
 * to the ArrayList from a particular index 
 * 
 * @author Gaurav Kukade at coderolls.com
 *
 */
public class ArrayListAddAllExample2 {

	public static void main(String[] args) {
		
		// ArrayList containing entrepreneurs
		List<String> entrepreneurs1 = new ArrayList<String>();
		
		entrepreneurs1.add("Bill Gates");
		entrepreneurs1.add("Steve Jobs");
		entrepreneurs1.add("Jeff Bezos");
		entrepreneurs1.add("Richard Branson");
		entrepreneurs1.add("Mark Cuban");
		
		System.out.println("Entrepreneurs collection 1: \n"+ entrepreneurs1 );
		
		// ArrayList containing entrepreneurs
		List<String> entrepreneurs2 = new ArrayList<String>();
		
		entrepreneurs2.add("Mark Zuckerberg");
		entrepreneurs2.add("Larry Page");
		entrepreneurs2.add("Larry Ellison");
		
		System.out.println("Entrepreneurs collection 2: \n"+ entrepreneurs2);
		
		// Add entrepreneurs2 collections all elements to entrepreneurs1 collection
		// starting from index 2
		entrepreneurs1.addAll(2, entrepreneurs2);
		
		System.out.println("Entrepreneurs : \n"+ entrepreneurs1);
	}
}
