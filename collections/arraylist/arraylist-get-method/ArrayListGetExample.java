package com.gaurav.ExProject.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * A java program to get the element by 
 * its index using the get() method
 * 
 * @author Gaurav Kukade at coderolls.com
 *
 */
public class ArrayListGetExample {

	public static void main(String[] args) {
		
        List<String> list = new ArrayList<String>();
        
        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesday");
        list.add("Thursday");
        list.add("Friday");
        list.add("Saturday");
        list.add("Sunday");
        
        System.out.println("Arraylist:"+ list);
        
        // get element at index 3
        String element = list.get(3);
        System.out.println("\nElement at index 3 is "+ element);
        
        System.out.println("\nUsing get() method in for loop: \n");
        
        // using the get(0 method in for loop
        for(int i=0; i<list.size(); i++) {
        	System.out.println("The element at index "+i+" is "+ list.get(i));
        }
	}

}
