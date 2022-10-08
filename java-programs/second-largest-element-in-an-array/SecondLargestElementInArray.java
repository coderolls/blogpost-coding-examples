package com.coderolls.JavaPrograms.second_largest;
/**
 * A Java program to find the second largest number in an array 
 * by iterating over an array using for loop.
 * 
 * @author coderolls.com
 */
public class SecondLargestElementInArray {

	public static void main(String[] args) {
		int[] arr = {2, 5, 9, 8, 11, 18, 13};
		
		int secondLargest = getSecondLargest(arr);
		System.out.println("The second largest element in an array 'arr' is :"+ secondLargest);
	}

	private static int getSecondLargest(int[] arr) {
		int n =arr.length;
		int largest =arr[0];
		int secondLargest = -1;
		
		for(int i=0; i<n; i++) {
			if(arr[i]>largest) {
				//if you found the new largest,
				//copy current largest to second largest and
				//copy current element arr[i] to largest
				secondLargest = largest;
				largest = arr[i];
			}else if(arr[i]!=largest) {
				// if the current element arr[i] is not the largest and 
				// still larger than the current secondLargest
				// then copy it to secondLargest
				if(arr[i]>secondLargest) {
					secondLargest = arr[i];
				}
			}
		}
		return secondLargest;
	}
}
