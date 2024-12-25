package com.quickSort;

import java.util.Arrays;

public class QuickSort {

	public static int partition(int array[], int low,int high) 
	{
		int pivot= array[high];
		int i = low-1;
		for(int j=low;j<high;j++)
		{
			if(array[j]<pivot) 
			{
				i++;
				
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		i++;
		int temp=array[i];
		array[i]=array[high];
		array[high]=temp;
		return i;//pivot index
	}
	public static void quickSort(int array[], int low,int high) 
	{
		if(low<high) 
		{
			int pivotIndex=partition(array,low,high);
			
			quickSort(array, low, pivotIndex-1);
			quickSort(array, pivotIndex+1, high);
		}
	}
	public static void main(String[] args) {
		
		System.out.println("Quick Sort ");
		//given array with non repeated elements
		int[] array= {5,9,4,7,3,2,1,8};				
		System.out.println("Given array - "+Arrays.toString(array));

		int length=array.length;
		quickSort(array, 0, length-1);
		
//		for(int i=0;i<length;i++) 
//		{
//			System.out.print(array[i]+" ");
//		}
		
		System.out.println("Sorted array - "+Arrays.toString(array));
	}
}
