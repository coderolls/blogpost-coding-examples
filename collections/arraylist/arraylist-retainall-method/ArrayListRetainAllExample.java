package com.gaurav.ExProject.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * A java program to to eplain the retainAll() method of the Arraylist class.
 * 
 * @author Gaurav Kukade at coderolls.com
 *
 */
public class ArrayListRetainAllExample {

	public static void main(String[] args) {

		//create an empty arraylist of Integer to retain elements
		List<Integer> numbers1 = new ArrayList<Integer>();

		//add number to the list
		numbers1.add(4);
		numbers1.add(5);
		numbers1.add(6);
		
		
		//create an empty arraylist of Integer
		List<Integer> numbers2 = new ArrayList<Integer>();

		// add number to the list
		numbers2.add(1);
		numbers2.add(2);
		numbers2.add(3);
		numbers2.add(4);
		numbers2.add(5);
		numbers2.add(6);
		numbers2.add(7);
		numbers2.add(8);
		numbers2.add(9);
		

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
