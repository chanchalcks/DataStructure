package com.recursion.app;

public class SumOfPositiveIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfDigits(12209));
	}

	public static int sumOfDigits(int value) {
		if (value <= 0) {
			return 0;
		}
		return value % 10 + sumOfDigits(value / 10);
	}

}
