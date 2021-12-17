package com.gaurav.ExProject.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * A java program to explain the subList() methods 
 * IllegalArgumentException exception case.
 * 
 * @author Gaurav Kukade at coderolls.com
 */
public class SubListMethodExceptionExample2 {

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
		
		// will throw IllegalArgumentException
		List<String> statesSubList = states.subList(3, 1); 
		
		System.out.println("\nThe states sublist from index 1 (inclusive) to 3 (exclusive): \n"+ statesSubList);
	}
}
