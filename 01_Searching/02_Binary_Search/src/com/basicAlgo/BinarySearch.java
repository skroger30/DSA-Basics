package com.basicAlgo;

public class BinarySearch {

	public static void main(String[] args) {
		
		int array[]= {-29,-16,0,4,6,9,11,12,14,20,36,48};
		int target = 44;
		System.out.println(binarySearch(array,target));
	}

	private static int binarySearch(int array[],int target) {
		
		int start = 0; int end = array.length-1;
		while(start<=end) {
			int mid = start + (end-start)/2;
			
			if(array[mid] == target) 
				return mid;
			
			if(target<array[mid]) 
				end=mid-1;
			else if(target>array[mid]) 
				start=mid+1;		
		}
		
		return -1;
	}


}
