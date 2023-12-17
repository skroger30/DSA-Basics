package com.practice;



public class FindMin {

	public static void main(String[] args) {
		int arr[] = {31,124,-52,100,874,-999,999,0,-52};
		int min = findMinimum(arr);
		System.out.println(min);
	}
	
	static int findMinimum(int arr[]) {
		int min = arr[0];
		for(int i=0; i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];				
			}				
		}
		return min;
	}

}
