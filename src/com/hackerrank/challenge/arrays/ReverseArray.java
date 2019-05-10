package com.hackerrank.challenge.arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] a = {1, 4, 3, 2};
		
		int[] res = reverseArray(a);
		
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}
	
	static int[] reverseArray(int[] a) {
        int[] reverse = new int[a.length];
        int j = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            reverse[j] = a[i];
            j++;
        }
        return reverse;
    }
}
