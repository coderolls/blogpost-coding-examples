package com.gaurav.ExProject.ArrayList;

import java.util.ArrayList;

/**
 * A java program to convert an ArrayList to array using
 * toArray method.
 * 
 * toArray(T[] a) method returns T[]
 * 
 * @author Gaurav Kukade at coderolls.com
 *
 */
public class ArrayListToArray2 {

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
		// pass a new String array of the arrayList size as a param to toArray
		//String[] elements = arrayList.toArray(new String[arrayList.size()]);
		
		//kindly read the 'Important Note' below
		String[] elements = arrayList.toArray(new String[0]);
		
		System.out.println("\nArray:");
		//we will receive the string array, so iterate on it to print each element
		for(String str:elements) {
			System.out.println(str);
		}
	}
}
