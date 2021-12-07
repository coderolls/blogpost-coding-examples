package com.gaurav.ExProject.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * A java program to traverse the collection using
 * the for-each loop i.e. enhanced for loop
 * 
 * @author Gaurav Kukade at coderolls.com
 *
 */
public class ArrayListForEachExample {

	public static void main(String[] args) {
		
		// create an empty arraylist of Integer
		List<Integer> numbers = new ArrayList<Integer>();
		
		//add number to the list
		numbers.add(1);
		numbers.add(8);
		numbers.add(8);
		numbers.add(5);
		numbers.add(4);
		numbers.add(6);
		numbers.add(3);
		numbers.add(2);
		numbers.add(9);
		
		//traversing the collection using for-each loop
		for(Integer number: numbers) {
			System.out.println("The number is "+ number);
		}
	}
}
