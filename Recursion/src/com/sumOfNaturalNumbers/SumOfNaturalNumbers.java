package com.sumOfNaturalNumbers;

import java.util.Scanner;

public class SumOfNaturalNumbers {
	static int answer;
	static int x;
	
	public static int sum(int x) 
	{
		if(x==0) {
		//	System.out.println(answer);
			return answer; 
		}
		 answer=answer+x;
		 sum(x-1);
		 return answer;
	}
	
	public static void main(String[] args) {
		System.out.print("Enter the Number - ");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		//sum(x);
		System.out.println("Sum of first "+x+" natural numbers is "+sum(x)+"." );

	}

}
