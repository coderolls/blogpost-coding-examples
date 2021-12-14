package com.gaurav.ExProject.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * A java program to remove all the elements 
 * of ArrayList using the clear() method.
 * 
 * @author Gaurav Kukade at coderolls.com
 *
 */
public class ArrayListClearMethodExample {

	public static void main(String[] args) {
		
		// create an arraylist cities
		List<String> cities = new ArrayList<String>();
		
		// add string objects in 'cities'
		cities.add("New York City");
		cities.add("Los Angeles");
		cities.add("Mountain View");
		cities.add("Austin");
		cities.add("Atlanta");
		
		// printing the cities
		System.out.println("Before invoking the clear() method");
		System.out.println("Cities: "+ cities); //print the arraylist with elements
		System.out.println("cities size: "+ cities.size());
		
		//invoke the clear() method on arraylist
		cities.clear();
		System.out.println("\nAfter invoking the clear() method");
		System.out.println("Cities: "+ cities); // empty arraylist
		System.out.println("cities size: "+ cities.size());
	}
}
