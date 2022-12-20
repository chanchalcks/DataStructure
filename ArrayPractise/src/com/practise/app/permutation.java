package com.practise.app;

public class permutation {

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int arr2[] = { 8, 1, 6, 2, 4, 1, 1, 1 };

		System.out.println(calculatePermutation(arr1, arr2));
	}

	public static boolean calculatePermutation(int arr1[], int arr2[]) {
		if (arr1.length != arr2.length) {
			System.out.println("arrays length are not same");
			return false;
		}
		int sum1 = 0, sum2 = 0;
		int prod1 = 1, prod2 = 1;

		for (int i = 0; i < arr1.length; i++) {
			// calculating the sum of the two arrays
			sum1 += arr1[i];
			sum2 += arr2[i];
			// calculating the product of the two arrays
			prod1 *= arr1[i];
			prod2 *= arr1[i];

		}

		if ((sum1 == sum2) && (prod1 == prod2)) {
			System.out.println("Arrays are same");
			return true;
		}
		System.out.println("arrays are not same");
		return false;

	}
}
