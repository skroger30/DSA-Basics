package com.insertionSort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		
		System.out.println("Insertion Sort ");
		//given array with non repeated elements
		//int[] array= {5,9,4,7,3,2,1,8};
		int[] array= {5,9,1,7,3};		
		System.out.println("Given array - "+Arrays.toString(array));

		for(int i=1;i<array.length;i++) 
		{
			int smallest=array[i];
			int j=i-1;
			while(j>=0 && smallest<array[j]) 
			{
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=smallest;
		}
		System.out.println("\nSorted array - "+Arrays.toString(array));
	}
}
