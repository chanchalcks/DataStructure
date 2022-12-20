package com.recursion.app;

public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(2, 3));
	}

	public static int power(int value, int exp) {
		if (exp <= 0)
			return 1;

		return value * power(value, exp - 1);
	}
	

}
