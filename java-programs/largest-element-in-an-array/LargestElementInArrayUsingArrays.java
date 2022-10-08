package com.coderolls.JavaPrograms;

import java.util.Arrays;

/**
 * A Java program to find the largest number in an array 
 * using Arrays.sort().
 * 
 * Arrays.sort() sort the array in natural sorting order
 * 
 * @author coderolls.com
 *
 */
public class LargestElementInArrayUsingArrays {

	public static void main(String[] args) {
		int[] arr = {2, 5, 9, 8, 11};
		
		int largestElement = getLargest(arr);
		System.out.println("Largest element in an array 'arr' "
				+ "using Array.sort() is :"+ largestElement);
	}

	private static int getLargest(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length-1];
	}
}
