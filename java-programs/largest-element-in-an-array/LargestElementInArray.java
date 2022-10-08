package com.coderolls.JavaPrograms;
/**
 * A Java program to find the largest number in an array 
 * using for loop iteration.
 * 
 * @author coderolls.com
 *
 */
public class LargestElementInArray {

	public static void main(String[] args) {
		int[] arr = {2, 5, 9, 8, 11};
		
		int largestElement = getLargest(arr);
		System.out.println("Largest element in an array 'arr' is :"+ largestElement);

	}

	private static int getLargest(int[] arr) {
		int n = arr.length;
		int largest = arr[0];
		
		for(int i=0; i<n; i++) {
			// if number at  index i is bigger than the current largest number,
			// copy it to 'largest' int variable
			if(arr[i]>arr[0]) {
				largest = arr[i];
			}
		}
		return largest;
	}
}
