package com.gaurav.ExProject.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * A java program to remove the range of elements from 
 * the MyArraylist (a class which extends the ArrayList)
 * using the removeRange() method.
 * 
 * The removeRange() method is protected and is accessed in class,
 * subclasses and in a package, but not public.
 * 
 * @author Gaurav Kukade at coderolls.com
 *
 */
public class MyArrayList extends ArrayList<String> {

	public static void main(String[] args) {
		
		MyArrayList myArrayList = new MyArrayList();
        
		myArrayList.add("Monday");
		myArrayList.add("Tuesday");
		myArrayList.add("Wednesday");
		myArrayList.add("Thursday");
		myArrayList.add("Friday");
		myArrayList.add("Saturday");
		myArrayList.add("Sunday");
        
        System.out.println("Arraylist before removing range of elments:\n"+ myArrayList);
  
        myArrayList.removeRange(2, 4);
        
        System.out.println("\nArraylist after removing range of elments:\n"+ myArrayList); 
	}
}
