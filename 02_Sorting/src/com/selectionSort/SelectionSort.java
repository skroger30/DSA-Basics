package com.selectionSort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		System.out.println("Selection Sort ");
		//given array with non repeated elements
		int[] array= {5,9,4,7,3,2,1,8};				
		System.out.println("Given array - "+Arrays.toString(array));

		for(int i=0;i<array.length-1;i++) 
		{
			int smallest=i;
			for(int j=i+1;j<array.length;j++) 
			{
				if(array[smallest]>array[j]) 
				{
					smallest=j;
				}
			}
			
			int temp=array[smallest];
			array[smallest]=array[i];
			array[i]=temp;
		}
		
		System.out.println("\nSorted array - "+Arrays.toString(array));
	}

}
