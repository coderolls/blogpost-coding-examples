package com.gaurav.ExProject.ArrayList;

import java.util.ArrayList;
import java.util.List;
/**
 * A java program to check if the ArrayList 
 * contains the specified element.
 * 
 * @author Gaurav Kukade a coderolls.com
 *
 */
public class ArrayListContainsMethodExample {

	public static void main(String[] args) {
		
		//create an empty arraylist object 'states'
		List<String> states = new ArrayList<String>();
		
		//add state in the arraylist 
		states.add("California");
		states.add("Texas");
		states.add("Florida");
		states.add("New Jersey");
		states.add("Washington");
		
		//check if states contains florida
		boolean isPresent1 = states.contains("Florida");
		System.out.println("Is Florida present in the list: "+ isPresent1);
		
		//check if states contains alaska
		boolean isPresent2 =states.contains("Alaska");
		System.out.println("\nIs Alaska present in the list: "+ isPresent2);
	}
}
