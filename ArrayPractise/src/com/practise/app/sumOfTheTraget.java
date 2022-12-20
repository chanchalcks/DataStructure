package com.practise.app;

public class sumOfTheTraget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 3, 4, 5 };
		int target = 7;
		System.out.println(findSumofTheTarget(arr, target));
	}

	public static String findSumofTheTarget(int arr[], int target) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					return i + "," + j;
				}
			}
		}
		return "No value found";
	}

}
