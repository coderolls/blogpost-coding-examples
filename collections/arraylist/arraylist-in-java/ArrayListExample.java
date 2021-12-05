package com.gaurav.ExProject;

import java.util.ArrayList;

/**
 * A Java program showing arraylist maintains the insertion order.
 * 
 * @author gaurav
 *
 */
public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("Gaurav");
		arrayList.add("Shyam");
		arrayList.add("Saurav");
		arrayList.add("Samiksha");
		arrayList.add("Rina");
		
		System.out.println(arrayList);
	}

}
