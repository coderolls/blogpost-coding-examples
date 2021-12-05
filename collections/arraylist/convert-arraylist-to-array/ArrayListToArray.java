package com.gaurav.ExProject.ArrayList;

import java.util.ArrayList;

/**
 * A java program to convert an ArrayList to array using
 * toArray method.
 * 
 * toArray() method returns Object[]
 * 
 * @author Gaurav Kukade at coderolls.com
 *
 */
public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		
		//adding elements to the arrayList
		arrayList.add("Meta");
		arrayList.add("Apple");
		arrayList.add("Amazon");
		arrayList.add("Netflix");
		arrayList.add("Microsoft");
		arrayList.add("Google");
		
		System.out.println("ArrayList: \n"+ arrayList);
		
		// convert ArrayList to array
		Object[] objects = arrayList.toArray();
		
		System.out.println("\nArray:");
		
		//we will receive the object array, so iterate on it to print each element
		for(Object obj:objects) {
			System.out.println(obj);
		}
	}
}
