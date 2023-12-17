package com.practice;

import java.util.Scanner;

public class SearchInString {

	public static void main(String[] args) {
		String text = "GoogleSearch";
		char arr[] = text.toCharArray();
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the character to be searched - ");
		char findChar = sc.next().charAt(0);
		int start = 1;
		int end = 5;
//		System.out.println(linearSearch(arr, findChar));
//		System.out.println(linearSearch2(text, findChar));
		System.out.println(linearSearch3(arr, findChar, start, end));
	}
	
	static boolean linearSearch(char arr[], char findChar ) {
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==findChar) {
				return true;
			}				
		}
		return false;
	}
	
//	Iterating Using enhanced for-loop
	static boolean linearSearch2(String text, char findChar ) {
		
		for(char ch : text.toCharArray()) {
			if(ch==findChar) {
				return true;
			}				
		}
		return false;
	}
	
//	Find the  target in particular range of index
	
	static boolean linearSearch3(char arr[], char findChar, int start, int end ) {
		
		for(int i=start; i<=end;i++) {
			if(arr[i]==findChar) {
				return true;
			}				
		}
		return false;
	}
}
