package com.recursion.app;

public class HighestCommonDivisor {

	public static void main(String[] args) {

		System.out.println(gcd(18,18));
	}

	public static int gcd(int a,int b)
	{
		if(b==0)
		{
			return a;
		}
		return gcd(b ,a%b); 
	}

}
