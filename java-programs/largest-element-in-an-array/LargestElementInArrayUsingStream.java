package com.coderolls.JavaPrograms;

import java.util.Arrays;
/**
 * A Java program to find the largest number in an array 
 * using Java 8 Streams API.
 * 
 * max() returns the maximum element of this stream
 * 
 * @author coderolls.com
 *
 */
public class LargestElementInArrayUsingStream {

	public static void main(String[] args) {
		int[] arr = {2, 5, 9, 8, 11};
		
		int largestElement = getLargest(arr);
		System.out.println("Largest element in an array 'arr'"
				+ "using Java 8 Streams API is :"+ largestElement);
	}

	private static int getLargest(int[] arr) {
		int largest = Arrays.stream(arr).max().getAsInt();
		return largest;
	}
}
