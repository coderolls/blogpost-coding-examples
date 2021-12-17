package com.gaurav.ExProject.ArrayList;

import java.util.ArrayList;
import java.util.List;
/**
 * A java program to show the NullPointerException in retainAll() method
 * of the arrayList class.
 *  
 * @author gaurav
 *
 */
public class RetainAllNullPointerExceptionExample {

	public static void main(String[] args) {
		
		//create an empty arraylist of Integer to retain elements
		List<String> numbers1 = null;

		//create an empty arraylist of Integer
		List<Integer> numbers2 = new ArrayList<Integer>();

		// add number to the list
		numbers2.add(1);
		numbers2.add(2);
		numbers2.add(3);
		numbers2.add(4);

		System.out.println("Lists before the method call");
		System.out.println("numbers1: "+ numbers1);
		System.out.println("numbers2: "+ numbers2);
		
		//retain all the elements of numbers1 in the list numbers2
		numbers2.retainAll(numbers1);
		
		System.out.println("\nLists after the method call");
		System.out.println("numbers1: "+ numbers1);
		System.out.println("numbers2: "+ numbers2);	
	}
}
