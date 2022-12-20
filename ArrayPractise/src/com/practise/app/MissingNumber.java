package com.practise.app;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
		System.out.println(missingNumber(arr));
	}

	public static int missingNumber(int arr[]) {
		int sum1 = 0;

		for (int i : arr) {
			sum1 += i;
		}
		int sum2 = 10 * (10 + 1) / 2;

		return sum2 - sum1;
	}

}
