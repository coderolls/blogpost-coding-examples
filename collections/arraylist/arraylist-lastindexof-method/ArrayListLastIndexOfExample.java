package com.gaurav.ExProject.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * A java program to explain the indexOf() method
 * of the arrayList class in java.
 * 
 * @author Gaurav Kukade
 */
public class ArrayListLastIndexOfExample {
	
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
		
		int index = states.lastIndexOf("Florida");
		
		//prints index of the last occurrences of Florida i.e. 6
		System.out.println("The last index of the Florida: "+ index);
		
		//trying get the index of element, which is not present
		int index2 = states.lastIndexOf("Alaska");
		
		System.out.println("The index of the Alaska: " + index2);
	}

}