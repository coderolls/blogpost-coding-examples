package com.gaurav.ExProject.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * A java program showing a NullPointerException case 
 * for the removeAll() method of the ArrayList class in Java.
 * 
 * @author gaurav
 */
public class ArrayListRemoveAllNullPointerException {

	public static void main(String[] args) {

		// create an empty arraylist object 'states'
		List<String> states = new ArrayList<String>();

		// add state in the arraylist, Florida multiple times
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
		
		// create another ArrayList with null value, 
		//so that removeAll will throw NullPointerException
		List<String> statesToBeRemoved =null;

		System.out.println("The states list before the removeAll() method call: \n" + states);
		
		// removes all elements specified in the ArrayList statesToBeRemoved 
		states.removeAll(statesToBeRemoved); 
		
		System.out.println("\nThe states list after the removeAll() method call: \n" + states);
	}
}
