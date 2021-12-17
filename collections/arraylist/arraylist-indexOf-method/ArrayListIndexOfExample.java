package com.gaurav.ExProject.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * A java program to explain the indexOf() method
 * of the arrayList class in java.
 * 
 * @author Gaurav Kukade
 */
public class ArrayListIndexOfExample {

	public static void main(String[] args) {
		
		// create an empty arraylist object 'states'
		List<String> states = new ArrayList<String>();

		// add state in the arraylist, Florida multiple times
		states.add("California");
		states.add("Texas");
		states.add("Florida");
		states.add("Florida");
		states.add("New Jersey");
		states.add("Washington");
		states.add("Florida");
		
		int index = states.indexOf("Florida");
		
		//prints index of the first occurrences of Florida i.e. 2
		System.out.println("The index of the Florida: "+ index);
		
		//trying get the index of element, which is not present
		int index2 = states.indexOf("Alaska");
		
		System.out.println("The index of the Alaska: " + index2);
	}
}
