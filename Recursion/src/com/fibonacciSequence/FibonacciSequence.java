package com.fibonacciSequence;

import java.util.Scanner;

/*The Fibonacci sequence is a series of numbers 
in which each number is the sum of the two that precede it. 
Starting at 0 and 1, 
the sequence looks like this: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, and so on forever.*/

public class FibonacciSequence {

	public static void getFibSeqByRecursion(int x,int y,int n) 
	{	
		if(n==0)
			return;
		
		int z=x+y;
		System.out.print(z+" ");
		getFibSeqByRecursion(y, z, n-1);
	}
	
	public static int getFibSeqByIteration(int x,int y,int n) 
	{int z=0;
		for(int i=n;i>0;i--) 
		{
			 z=x+y;
			//System.out.print(z+" ");
			x=y;
			y=z;
		}
		return z;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=0,y=1;
		System.out.print("\nEnter Number up to which yoou want Fibonacci Series- ");
		int n=sc.nextInt();
		System.out.print("\nFibonacci series up to "+n+" terms.");
		System.out.print("\n\n1.By Recursion-"+x+" "+y+" ");
		getFibSeqByRecursion(0, 1, n-2);
		System.out.print("\n\n2.By Iteration-"+x+" "+y+" ");
		System.out.println(getFibSeqByIteration(0, 1, n-2));
	}

}
