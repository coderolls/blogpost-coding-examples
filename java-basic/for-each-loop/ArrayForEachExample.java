package com.gaurav.ExProject.ArrayList;

/**
 * A java program to traverse the array using the 
 * for-each loop i.e. enhanced for loop
 * 
 * @author Guarav Kukade at coderolls.com
 *
 */
public class ArrayForEachExample {

	public static void main(String[] args) {
		
		// create an array of marks
		int[] numbers = { 88, 95, 65, 76, 78, 45, 95, 96, 56};
		
		// traversing the array using for-each loop
		for(int number: numbers) {
			
			System.out.println("The number is "+ number);
		}
	}
}
