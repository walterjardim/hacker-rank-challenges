package com.hackerrank.challenge.arrays;

public class HourGlassSolution {

	public static void main(String[] args) {
		int[][] arr = { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0 }, { 0, 0, 2, 4, 4, 0 },
				{ 0, 0, 0, 2, 0, 0 }, { 0, 0, 1, 2, 4, 0 } };

		int result = hourglassSum(arr);

		System.out.println(result);
	}

	private static int hourglassSum(int[][] arr) {
		int arrLength = 6;

		int maxSum = -63;

		for (int i = 0; i < arrLength; i++) {

			for (int j = 0; j < arrLength; j++) {
				
				int hgSum = 0;
				
				if (j + 2 < arrLength) {

					if (i + 2 < arrLength) {
						hgSum += arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
						hgSum += arr[i + 1][j + 1];
						hgSum += arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

						System.out.println(arr[i][j] + " " + arr[i][j + 1] + " " + arr[i][j + 2]);
						System.out.println(arr[i + 1][j + 1]);
						System.out.println(arr[i + 2][j] + " " + arr[i + 2][j + 1] + " " + arr[i + 2][j + 2]);

						System.out.println("soma = " + hgSum);
						if (hgSum >= maxSum) {
							maxSum = hgSum;
						}
					}
				}

			}

		}

		return maxSum;
	}
}
