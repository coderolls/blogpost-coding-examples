package com.gaurav.ExProject.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * A java program to explain the subList() method of the ArrayList class in Java
 * 
 * @author Gaurav Kukade at coderolls.com
 *
 */
public class ArrayListSubListExample {

	public static void main(String[] args) {

		// create an empty arraylist object 'states'
		List<String> states = new ArrayList<String>();

		// add state in the arraylist
		states.add("California");
		states.add("Texas");
		states.add("Florida");
		states.add("New Jersey");
		states.add("Washington");
		
		System.out.println("The states list: \n"+ states);
		
		// sublist the states list from 1 to 3 index
		List<String> statesSubList = states.subList(1, 3);
		
		System.out.println("\nThe states sublist from index 1 (inclusive) to 3 (exclusive): \n"+ statesSubList);
	}
}
