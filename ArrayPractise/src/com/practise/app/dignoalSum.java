package com.practise.app;

import java.util.HashMap;
import java.util.Map;

public class dignoalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.print(dignoalSum(arr));
	}

	public static int dignoalSum(int arr[][]) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i][i];
		}
		
		   Map<String,Integer> romanMapping=new HashMap<>();
	        romanMapping.put("I",1);
		String s="III";
		int sum3=0;
		char[] arr5=s.toCharArray();
		for(char t:arr5)
		{
			sum3+=(int)romanMapping.get(t+"");
		}
		
		return sum;
	}

}
