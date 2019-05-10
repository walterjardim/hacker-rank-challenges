package com.hackerrank.challenge.arrays;

import java.util.Arrays;

/**
 * Circular Array concepts
 * @author walterjardim
 *
 */
public class LeftRotationSolution {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int d = 4;
		
		int[] result = rotLeft(arr, d);
		
		
		System.out.println(Arrays.toString(result));
		
	}
	
	// Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
    	
    	int n = a.length;
    	int[] b = new int[n];
    	
    	for(int i = 0; i < n; i++) {
    		b[i] = a[(i+d) % n];
    	}
    	
    	return b;
    }
}
