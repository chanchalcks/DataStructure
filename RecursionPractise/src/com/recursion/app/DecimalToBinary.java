package com.recursion.app;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(dtb(50));

	}

	public static int dtb(int value) {
		if (value <= 0) {
			return 0;
		}
		return value % 2 + 10*dtb(value / 2);
	}

}
