

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.print("Enter the String to check Palindrome : ");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String reverse="";
		
		for(int i=input.length()-1;i>=0;i--) 
		{
			reverse=reverse+input.charAt(i);
		}
		System.out.println("Reversed string : "+ reverse);
		if(input.equals(reverse))
			System.out.println(input+" is a palindrome.");
		else
			System.out.println(input+" is not a palindrome.");
	}

}
