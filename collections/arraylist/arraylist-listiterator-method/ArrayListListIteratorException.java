package com.gaurav.ExProject.ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;
/**
 * An example java program about the listIterator()
 * method of the arrayList.
 * 
 * @author coderolls.com
 */
public class ArrayListListIteratorException {

	public static void main(String[] args) {
		
		ArrayList<String> states = new ArrayList<>();

		// add state in the arraylist
		states.add("California");
		states.add("Texas");
		states.add("Montana");
		states.add("Arizona");
		states.add("Florida");
		states.add("Michigan");
		states.add("New Jersey");
		states.add("Washington");
		states.add("Ohio");
		
        //given index 120, it will  throw IndexOutOfBoundsException
		ListIterator<String> itr = states.listIterator(120);
		
		while(itr.hasNext()) {
			String state = itr.next();
			System.out.println("The state :"+ state);
		}
	}
}
