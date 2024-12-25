package com.bubbleSort;

import java.util.Arrays;


//TIME COMPLEXITY	---> O(n^2)

public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("Bubble Sort ");
		//given array with non repeated elements
		int[] array= {5,9,4,7,3,2,1,8};	
		
		System.out.println("Given array - "+Arrays.toString(array));
		
	//-------------------------------------------------------------------------------------------------------------	
		for(int i=0;i<array.length;i++)			//O(n)
		{
			for(int j=0;j<array.length-i-1;j++)   //O(n)
			{
				if(array[j]>array[j+1]) 		//logic to arrange element by ascending order
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted Array(ascending) - "+Arrays.toString(array));
	//-------------------------------------------------------------------------------------------------------------	
		
		int[] array1= {5,9,4,7,3,2,1,8};
		for(int i=0;i<array1.length;i++)			//O(n)
		{
			for(int j=0;j<array1.length-1;j++)   //O(n)
			{
				if(array1[j]<array1[j+1]) 		//logic to arrange element by descending order
				{
					int temp=array1[j];
					array1[j]=array1[j+1];
					array1[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted Array(descending) - "+Arrays.toString(array1));
	}
}
