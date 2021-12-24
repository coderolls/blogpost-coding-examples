package com.gaurav.ExProject.ArrayList;

import java.util.ArrayList;
/**
 * An example java program for ensureCapacity(int MinCapacity) method 
 * of the ArrayList class in java.
 * @author Gaurav at coderolls.com
 *
 */
public class ArrayListEnsureCapacityExample {

	public static void main(String[] args) {
		
		// create an empty arraylist object 'states'
		ArrayList<String> states = new ArrayList<>();

		// add state in the arraylist
		states.add("California");
		states.add("Texas");
		states.add("Montana");
		states.add("Arizona");
		states.add("Florida");
		states.add("Michigan");
		states.add("New Jersey");
		states.add("Washington");
		states.add("Ohio");
		states.add("Minnesota");
		states.add("Colorado");
		states.add("Missouri");
		states.add("Nevada");
		System.out.println("ArrayList Elements are: \n"+ states);
		//We need to add more states, so we will ensure 
		//that arraylist should hold 50 elements
		 states.ensureCapacity(50);
		 
		 System.out.println("\nWe ensured that the arraylist should hold 50 elements.");
	}

}
