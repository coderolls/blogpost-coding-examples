package ArrayListAddExample;

import java.util.ArrayList;

/**
 * A Java program to add an element at the specific index.
 * 
 * The add(int index, E element) method will add 
 * an element at the specified index in ArrayList.
 * 
 * @author Guarav Kukade at coderolls.com
 *
 */
public class ArrayListAddExample {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		//adding elements to the arrayList using normal add method
		arrayList.add("Gaurav");
		arrayList.add("Shyam");
		
		System.out.println(arrayList);// [Gaurav, Shyam]
		
		// adding an element to  the arrayList at index 1
		arrayList.add(1, "Saurav");
		
		System.out.println(arrayList); // [Gaurav, Saurav, Shyam]

	}

}
