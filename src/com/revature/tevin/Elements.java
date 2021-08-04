package com.revature.tevin;

public class Elements {

	public static void main(String[] args) {
		int small = 0;
		int large = 0;
		int[] group = new int[] {10, 2, 7, 4, 5};
		int size = group.length;
		small = group[0];
		large = group[0];
		for (int i = 0; i < size; ++i) {
			if (group[i] > large) {
				large = group[i];
			}
			if (group[i] < small) {
				small = group[i];
			}
		}
		System.out.println("Smallest element is " + small);
		System.out.println("Largest element is " + large);
	}

}
