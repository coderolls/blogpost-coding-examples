package com.gaurav.ExProject.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * A java program showing an example for the removeIf()
 * method of the ArrayList class in Java.
 * 
 * @author gaurav
 */
public class ArrayListRemoveIfExample {

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

		System.out.println("The states list before the removeIf() call: \n" + states);

		// a predicate for the condition
		Predicate p = s -> s.equals("Florida");
		states.removeIf(p); // removes all elements which satisfy the predicate p

		System.out.println("\nThe states list after the removeIf() call: \n" + states);
	}
}
