package com.coderolls.JavaPrograms.second_largest;

import java.util.Arrays;

/**
 * A Java program to find the second largest number in an array 
 * using Arrays.sort() method.
 * 
 * @author coderolls.com
 */
public class SecondLargestElementInArrayUsingArrays {

	public static void main(String[] args) {
		int[] arr = {2, 5, 9, 8, 11, 18, 13};
		
		int secondLargest = getSecondLargest(arr);
		System.out.println("The second largest element in an array 'arr' is using Arrays.sort() :"+ secondLargest);
	}

	private static int getSecondLargest(int[] arr) {
		Arrays.sort(arr);
		// return second largest, so length-2
		return arr[arr.length-2];
	}
}
