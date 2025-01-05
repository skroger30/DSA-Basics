package com.x_power_n;

public class GetXPowerN {

	static int c;
	public static int getXPowerN(int x,int power) 
	{
		if(x==0 || power==0)
			return 1;
		
		int y=getXPowerN(x, power-1);
		c++;
		System.out.println(c);
		System.out.println(""+x+","+y+"");
		int result=y*x;
		System.out.println("Result = "+result);
		return result;
	}
	
	public static void main(String[] args) {
		
		int x=2,power=5;
		System.out.println(getXPowerN(x, power));
	}

}
