package com.practise.app;

import java.util.Arrays;

public class SimpleArray {

	public static void main(String[] args) {

		int arr[] = new int[3];
		for (int i = 0; i < arr.length; i++) {

			arr[i] = i + 1;
		}

		Arrays.stream(arr).forEach(e -> System.out.println(e));
	}

}
