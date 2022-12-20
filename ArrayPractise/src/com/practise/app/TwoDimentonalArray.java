package com.practise.app;

import java.util.Arrays;

public class TwoDimentonalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int arr[][] = { { 1, 2, 3, 4 }, 
					        { 5, 6, 7, 8 }, 
					        { 9, 10, 11, 12 } };

			for (int r = 0; r < arr.length; r++) {
				for (int c = 0; c < arr[r].length; c++) {
					if (arr[r][c] == 15) {
						System.out.println("value found");
						return;
					}
				}

				// System.out.println("abc");

			}
			System.out.println("value not found");
			System.out.println(Arrays.deepToString(arr));

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("index out of bound");
		}
	}

}
