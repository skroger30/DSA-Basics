package com.x_power_n;

public class StackHeightLogN {

	
	public static int getXPowerN(int x,int power) 
	{
		if(x==0 || power==0)
			return 1;
		
		if(power%2==0)
			return getXPowerN(x, power/2)*getXPowerN(x, power/2);
		
		else
			return getXPowerN(x, power/2)*getXPowerN(x, power/2)*x;
	
	}
	
	public static void main(String[] args) {
		
		int x=2,power=5;
		System.out.println(getXPowerN(x, power));
	}

}
