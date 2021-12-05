package com.gaurav.ExProject.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A java program to iterate through arraylist 
 * using Iterator interface.
 * 
 * @author Gaurav Kukade at coderolls.com
 *
 */
public class ArrayListIterateExample4 {
    
    public static void main (String[] args) {
        
        List<String> list = new ArrayList<String>();
        
        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesday");
        list.add("Thursday");
        list.add("Friday");
        list.add("Saturday");
        list.add("Sunday");
        
        System.out.println("Iterating through ArrayList using Iterator interface........\n");
        
        // getting iterator
        Iterator iterator = list.iterator();
        
        // hasNext() returns true only if object is available at next call
        while (iterator.hasNext()) {
        	
        	//next() returns obejct, we can cast it to reuqired type
        	String str = (String) iterator.next();
        	System.out.println("Object form the ArrayList is " + str);
		}
    }
}