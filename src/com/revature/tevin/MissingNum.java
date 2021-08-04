package com.revature.tevin;

import java.util.Arrays;

public class MissingNum {
	
	public static int findNum(int[] arr) {
		Arrays.sort(arr);
		
		int min = arr[0];
		int max = arr[arr.length-1];
		int missing = 0;
		int counter = 0;
		
		for (int i = min; i < max; i++) {
			if(arr[counter] != i) {
				missing = i;
				break;
			}
			counter++;
		}
		return missing;
	}

	public static void main(String[] args) {
		int[] arr1 = {4, 6, 2, 3, 5, 0};
		int[] arr2 = {3, 1};
		
		System.out.println("Missing number is " + findNum(arr1));
		System.out.println("Missing number is " + findNum(arr2));
	}
}
