package com.gaurav.ExProject.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * A java program to iterate through arraylist 
 * using forEach method and lamda expression.
 * 
 * @author Gaurav Kukade at coderolls.com
 *
 */
public class ArrayListIterateExample5 {
    
    public static void main (String[] args) {
        
        List<String> list = new ArrayList<String>();
        
        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesday");
        list.add("Thursday");
        list.add("Friday");
        list.add("Saturday");
        list.add("Sunday");
        
        System.out.println("Iterating through ArrayList using forEach method and lamda expression........\n");
        
        // add lambda expressionin the foreach loop
        list.forEach(s -> System.out.println("Object form the ArrayList is "+ s));
    }
}