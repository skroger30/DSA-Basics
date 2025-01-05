package com.factorial;

import java.util.Scanner;

public class GetFactorial {

	 static int factByRecursion=1;
	//-------------------------By Iteration----------------------------------------
	public static void getFactorialByIteration(int x) 
	{
		int factByIteration=1;
		for(int i=1;i<=x;i++) {
			factByIteration=factByIteration*i;
		}
		System.out.println("Factorial by Iteration "+factByIteration+".");
	}
	
	//-------------------------By Recursion Method 1----------------------------------------
	public static void getFactorialByRecursion(int x) 
	{
		if(x==1 || x==0) {
			System.out.println("Factorial by Recursion "+factByRecursion+".");
			return;
		}
		factByRecursion=factByRecursion*x;
		getFactorialByRecursion(x-1);
	}
	
	//-------------------------By Recursion Method 2----------------------------------------
	public static int getFactorialByRecursion1(int x) 
	{
		if(x==1 || x==0) 
			return 1;
		
		int y=getFactorialByRecursion1(x-1);
		int factByRecursion1=y*x;
		return factByRecursion1;
	}
	
	//----------------------------------------To get  factorials in a specified range of numbers----------------------------------------
	public static void getFactRange()
	{
		int start=1;
		int end=5;
		for(int i=start;i<=end;i++)
		 {
			 int fact=1;
			 for(int j=1;j<=i;j++)
			 { 
				fact=fact*j;
			 }
			System.out.println("Factorial of:- "+i+" is "+fact);
		 }
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number - ");
		int x=sc.nextInt();
		
		getFactorialByIteration(x);
		getFactorialByRecursion(x);
		System.out.println(getFactorialByRecursion1(x));
		
		getFactRange();
	}

}
