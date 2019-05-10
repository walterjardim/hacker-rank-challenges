package com.hackerrank.challenge.arrays;

/**
 * Return the minimum number of swaps to sort the given array.
 * 
 * @author walterjardim
 *
 */
public class MinimumSwapsSolution {

	public static void main(String[] args) {
		int[] arr = {2,3,4,1,5};
		
		System.out.println(minimumSwaps(arr));
	}

	private static int minimumSwaps(int[] arr) {
		int swaps = 0;
		for (int i = 0; i < arr.length; i++) {
			int index = i + 1;
			
			if((index) == arr[i]) {
				continue;
			}
			
			if (i + 1 < arr.length) {
				int j = i + 1;
				
				while (arr[j] != index) {
					++j;
				}
				
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				++swaps;
			}
		}
		
		
		
		return swaps;
	}
}
