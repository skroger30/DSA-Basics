package com.basicAlgo;


// Pre-requisite, the array must be sorted before applying Binary Search.

public class OrderAgnosticBinarySearch {
	static boolean isAsc;
	public static void main(String[] args) {
		int array[]= {-29,-16,0,4,6,9,11,12,14,20,36,48};
//		int array[]= {29,16,0,-4,-6,-9,-11,-12,-14};
		int target= -29;int result;
		isAsc=orderAgnosticBinarySearch(array);
		System.out.println(isAsc);
		result=binarySearch(array,target);
		System.out.println(result);
	}
	static int binarySearch(int array[],int target) 
	{
		int start=0;
		int end=array.length-1 ;	
		while(start<=end) 
		{
			int mid=start+(end-start)/2;
			if(target==array[mid])
					return mid;
			
			if(isAsc==true) 
			{
				if(target<array[mid]) 
					end=mid-1;
				else if(target>array[mid]) 
					start=mid+1;
			}
			else
			{
				if(target>array[mid]) 
					end=mid-1;
				else if(target<array[mid]) 
					start=mid+1;
			}
		}
		return -1;	
	}
	//////////////////////////////////////////////////////////////////////////////
	static boolean orderAgnosticBinarySearch(int array[]) 
	{	
		int start=0;
		int end=array.length-1 ;
		boolean isAsc=array[start]<array[end]; 
			return isAsc;
	}
}
