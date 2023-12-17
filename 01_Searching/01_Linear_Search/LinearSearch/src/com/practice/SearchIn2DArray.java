package com.practice;

import java.util.Arrays;

public class SearchIn2DArray {

	public static void main(String[] args) {

		int arr[][] = { { -18, -20, 30 }, { -25, 2, -99, 44 }, { -78, 51, -99 }, { 19, -63 } };

		int target = 99;
		System.out.println(Arrays.toString(search(arr, target)));
		System.out.println((findMax(arr)));
	}

	private static int[] search(int[][] arr, int target) {

		// Loop through all rows
		for (int[] row : arr) {
			System.out.println(Arrays.toString(row));
		}

		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) {
				if (arr[r][c] == target) {
					return new int[] { r, c };
				}
			}
		}
		return new int[] { -1, -1 };

	}

	private static int findMax(int[][] arr) {
		int max = 0;

		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) {
				if (arr[r][c] > max) {
					max = arr[r][c];
				}
			}
		}
		return max;

	}

}
