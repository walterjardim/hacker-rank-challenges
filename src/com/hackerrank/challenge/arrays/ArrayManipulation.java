package com.hackerrank.challenge.arrays;

public class ArrayManipulation {

	public static void main(String[] args) {
		int[][] queries = { { 2, 6, 8 }, { 3, 5, 7 }, { 1, 8, 1 }, { 5, 9, 15 } };

		int n = 10;

		System.out.println(arrayManipulation(n, queries));
	}

	private static int arrayManipulation(int n, int[][] queries) {

		int[] arr = new int[n];
		int maxSum = 0;
		int queriesLength = queries.length;
		
		for (int i = 0; i < queriesLength; i++) {

            int summand = queries[i][2];
            int start = queries[i][0];
            int end = queries[i][1];

            for (int k = start; k <= end; k++) {
                int sum = arr[k - 1] + summand;
                arr[k - 1] = sum;
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }

        }

//		for (int i = 0; i < queriesLength; i++) {
//
//            int summand = queries[i][2];
//            int start = queries[i][0];
//            int end = queries[i][1];
//
//            for (int k = start; k <= end; k++) {
//                int sum = arr[k - 1] + summand;
//                arr[k - 1] = sum;
//                if (sum > maxSum) {
//                    maxSum = sum;
//                }
//            }
//
//        }

		return maxSum;
	}
}
