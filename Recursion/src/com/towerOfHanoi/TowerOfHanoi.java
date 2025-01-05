package com.towerOfHanoi;

public class TowerOfHanoi {

	static int c=0;
	public static void towerOfHanoi(int n, String src, String buffer,String dest) 
	{
		if(n==1) {
			System.out.println("transferred disk "+n+" from "+src+" to "+dest);
			c++;
			return;
		}
		c++;
		towerOfHanoi(n-1, src ,dest , buffer);
		System.out.println("transferred disk "+n+" from "+src+" to "+dest);
		towerOfHanoi(n-1, buffer , src, dest);
	}
	
	
	public static void main(String[] args) {
		
		int n=2;
		towerOfHanoi(n, "Source", "Buffer", "Destination");

		System.out.println("Total Steps required - "+c);
	}

}
