package com.revature.tevin;

import java.util.Scanner;

public class Subsequence {
	
	public static void lcs(String a, String b, int m, int n) {
		int[][] L = new int[m+1][n+1];
		
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0) {
					L[i][j] = 0;
				} else if (a.charAt(i-1) == b.charAt(j-1)) {
					L[i][j] = L[i-1][j-1] + 1;
				} else {
					L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
				}
			}
		}
		
		int index = L[m][n];
		int temp = index;
		char[] lcs = new char[index+1];
		lcs[index] = '\u0000';
		
		int i = m;
		int j = n;
		while (i > 0 && j > 0) {
			if (a.charAt(i-1) == b.charAt(j-1)) {
				lcs[index-1] = a.charAt(i-1);
				i--;
				j--;
				index--;
			} else if (L[i-1][j] > L[i][j-1]){
				i--;
			} else {
				j--;
			}
			System.out.println("LCS of " + a + " and " + b + " is ");
			for (int k = 0; k <= temp; k++) {
				System.out.println(lcs[k]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		
		int m = a.length();
		int n = b.length();
		lcs(a, b, m, n);
		
		in.close();
	}
}
