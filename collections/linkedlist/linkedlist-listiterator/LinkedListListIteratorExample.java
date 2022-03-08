package com.gaurav.ExProject.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;
/**
 * An example java program about the listIterator(int index)
 * method of the linkedList.
 * 
 * @author coderolls.com
 */
public class LinkedListListIteratorExample {

	public static void main(String[] args) {
		
		LinkedList<String> states = new LinkedList<>();

		// add state in the linkedList
		states.add("California");
		states.add("Texas");
		states.add("Montana");
		states.add("Arizona");
		states.add("Florida");
		states.add("Michigan");
		states.add("New Jersey");
		states.add("Washington");
		states.add("Ohio");
		
        //given index 3, iterator start from element with index 3
		ListIterator<String> itr = states.listIterator(3);
		System.out.println("Iterating the list from index 3\n");
		while(itr.hasNext()) {
			String state = itr.next();
			System.out.println("The state :"+ state);
		}
	}
}