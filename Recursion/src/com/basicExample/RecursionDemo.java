package com.basicExample;

public class RecursionDemo {
	static int x=10;
	public static void getbyRecursion(int x) 
	{
		int n=x;
		if(n<0)
			return;
		System.out.println(n);
		getbyRecursion(x-1);
	}

	public static void getByIteration() 
	{
		for(int i=x;i>=0;i--) 
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		
		System.out.println("Retrieval by Recursion -  ");
		getbyRecursion(x);
		System.out.println("Retrieval by Iteration -  ");
		getByIteration();
	}

}
