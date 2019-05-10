package com.hackerrank.challenge.arrays;

public class SparseArrays {
	
	public static void main(String[] args) {
		String[] strings = {"aba", "baba", "aba", "xzxb"};
		String[] queries = {"aba", "xzxb", "ab"};
		
		int[] result = matchingStrings(strings, queries);
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
	}

	private static int[] matchingStrings(String[] strings, String[] queries) {
		
		int[] result = new int[queries.length];
		
		for (int i = 0; i < queries.length; i++) {
			int count = 0;
			
			for(int j = 0; j < strings.length; j++) {
				if (strings[j].equals(queries[i])) {
					count++;
				}
				
			}
			
			result[i] = count;
		}
		
		
		return result;
	}

}
