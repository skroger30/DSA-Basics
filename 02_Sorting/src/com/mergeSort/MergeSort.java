package com.mergeSort;

import java.util.Arrays;

public class MergeSort {
	public static void divide(int array[],int si,int ei) 
	{
		if(si>=ei)
			return;
		
		int mid=si+(ei-si)/2;
		divide(array,si,mid);
		divide(array,mid+1,ei);
		conquer(array,si,mid,ei);
	}
	public static void conquer(int array[],int si,int mid,int ei) 
	{
		int merge[]=new int[ei-si+1];
		int index1=si;
		int index2=mid+1;
		int x=0;
		while(index1<=mid && index2<=ei)
		{
			if(array[index1]<=array[index2]) {
				merge[x++]=array[index1++];
			}
			else {
				merge[x++]=array[index2++];
			}
		}
		
		while(index1<=mid) 
		{
			merge[x++]=array[index1++];
		}
		while(index2<=ei) 
		{
			merge[x++]=array[index2++];
		}
		
		for(int i=0,j=si;i<merge.length;i++,j++) 
		{
			array[j]=merge[i];
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Merge Sort ");
		//given array with non repeated elements
		int[] array= {5,9,4,7,3,2,1,8};				
		System.out.println("Given array - "+Arrays.toString(array));
		
		int size=array.length;
		
		divide(array, 0, size-1);
		
		System.out.println("Sorted array - "+Arrays.toString(array));
	}
}
