package com.gaurav.ExProject.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * A java program to iterate through arraylist 
 * using enhanced for loop i.e. For-each loop.
 * 
 * @author Gaurav Kukade at coderolls.com
 *
 */
public class ArrayListIterateExample2 {
    
    public static void main (String[] args) {
        
        List<String> list = new ArrayList<String>();
        
        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesday");
        list.add("Thursday");
        list.add("Friday");
        list.add("Saturday");
        list.add("Sunday");
        
        System.out.println("Iterating through ArrayList using enhanced for loop i.e. For-each loop.......\n");
        
        for(String str:list){
        	//we get 'str' in for-each loop
            System.out.println("Object form the ArrayList is " + str);
        }
    }
}