package ArrayListAddExample;
/**
 * A java program to reverse a striong using recursion.
 * 
 * @author gaurav
 *
 */
public class ReverseStringUsingRecursion {

	public static void main(String[] args) {
		
		String str = "Hello";
		System.out.println(reverse(str));

	}

	public static String reverse(String str) {
	    if ((null == str) || (str.length() <= 1)) {
	        return str;
	    }
	    return reverse(str.substring(1)) + str.charAt(0);
	}
}
