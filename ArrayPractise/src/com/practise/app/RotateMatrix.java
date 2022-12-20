package com.practise.app;

import java.util.Arrays;

public class RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//{{7,4,1},{8,5,2},{9,6,3}}
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		rotateMatrix(matrix);
		//System.out.println(Arrays.deepToString(matrix));
	}

	public static boolean rotateMatrix(int arr[][]) {

		if (arr.length == 0 || arr.length != arr[0].length) {
			System.out.println("size does not match");
			return false;
		}
		int n = arr.length;
		for (int layer = 0; layer < n / 2; layer++) {
			int first = layer;
			int last = n - 1 - layer;
			//{{7,4,1},{8,5,2},{9,6,3}}
			for (int i = first; i < last; i++) {
				int offset = i - first;
				int top = arr[first][i];
				arr[first][i] = arr[last - offset][first];
				arr[last - offset][first] = arr[last][last - offset];
				arr[last][last - offset] = arr[i][last];
				arr[i][last] = top;
				
				System.out.println(Arrays.deepToString(arr));
			}
		}

		return true;
	}
	
}
