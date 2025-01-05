package com.reverseTheString;

public class ReverseString {

	public static void getReverseStringByRecursion(String s, int index) 
	{
		if(index<=0) {
			System.out.print(s.charAt(index));	
			return;
		}
		System.out.print(s.charAt(index));
		getReverseStringByRecursion(s, index-1);
	}
	
	public static void getReverseStringByIterartion(String s, int index) 
	{
		for(int i=index;i>=0;i--) 
		{
			System.out.print(s.charAt(i));
		}
	}
	public static void main(String[] args) {
		
		String s="abcd";
		System.out.println("Given String - "+s);
		System.out.print("\nReversal of String by Recursion - ");
		getReverseStringByRecursion(s, s.length()-1);
		System.out.print("\nReversal of String by Iteration - ");
		getReverseStringByIterartion(s, s.length()-1);
		
	}

}
