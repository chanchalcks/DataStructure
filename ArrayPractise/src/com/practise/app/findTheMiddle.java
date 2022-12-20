package com.practise.app;

import java.util.Arrays;

public class findTheMiddle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3 };

		int []arr2=Arrays.copyOfRange(arr, 1, arr.length-1);
		
		System.out.println(Arrays.toString(arr2));

	}

}
