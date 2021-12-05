package com.gaurav.ExProject2;

import java.util.ArrayList;

/**
 * A Java program to remove an object from ArrayList
 * using the remove(int index) method.
 * 
 * @author Gaurav Kukade at coderolls.com
 *
 */
public class ArrayListRemoveObjectExample2 {

	public static void main(String[] args) {
		
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		
		//create Employee objects
		Employee john = new Employee(100, "John Doe", 20000);
		Employee nathasha = new Employee(101, "Natasha Putin", 28000);
		Employee remo = new Employee(102, "Remo Smith", 40000);
		
		//adding employee objects to the arrayList using normal add method
		arrayList.add(john);
		arrayList.add(nathasha);
		arrayList.add(remo);
		
		System.out.println("ArrayList before removing an employee Object:\n"+ arrayList); 
		
		//Remove object using the remove(int index) method 
		//Remove employee nathasha from the arrayList, so pass natasha's index
		arrayList.remove(1);
		
		System.out.println("\nArrayList after removing an employee Object:\n"+ arrayList);
	}
}
