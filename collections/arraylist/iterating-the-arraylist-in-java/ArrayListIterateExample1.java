package com.gaurav.ExProject.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * A java program to iterate through arraylist 
 * using the basic for loop.
 * 
 * @author Gaurav Kukade at coderolls.com
 *
 */
public class ArrayListIterateExample1 {
    
    public static void main (String[] args) {
        
        List<String> list = new ArrayList<String>();
        
        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesday");
        list.add("Thursday");
        list.add("Friday");
        list.add("Saturday");
        list.add("Sunday");
        
        System.out.println("Iterating through ArrayList using the basic for loop.......\n");
        
        for(int i =0; i <list.size(); i++){
            System.out.println("Object form the ArrayList at "+ i + " is " + list.get(i));
        }
    }
}