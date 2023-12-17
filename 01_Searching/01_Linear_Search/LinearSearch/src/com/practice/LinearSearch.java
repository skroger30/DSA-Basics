package com.practice;

import java.util.Scanner;

//Linear search is defined as the searching algorithm where 
//the list or data set is traversed from one end to find the desired value.

//  refer - https://www.geeksforgeeks.org/searching-algorithms/

// Time Complexity - How the time will grow as the input grows.
// Best Case - O(1) / Worst Case - O(n)
public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = {31,124,-52,100,874};
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number to be searched - ");
		int findNumber = sc.nextInt();
		linearSearch(arr, findNumber);
	}
	
	static int linearSearch(int arr[], int findNumber) {
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==findNumber) {
				System.out.println("The number "+findNumber+" is present at index "+i);
				return i;
			}				
		}
		System.out.println("The number "+findNumber+" is not present in the array.");
		return -1;
	}
}
