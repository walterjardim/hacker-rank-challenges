package com.hackerrank.challenge.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicArray {

	public static void main(String[] args) {
		
		List<List<Integer>> queries = new ArrayList<>();
		
		List<Integer> s1 = Arrays.asList(1, 0, 5);
		List<Integer> s2 = Arrays.asList(1, 1, 7);
		List<Integer> s3 = Arrays.asList(1, 0, 3);
		List<Integer> s4 = Arrays.asList(2, 1, 0);
		List<Integer> s5 = Arrays.asList(2, 1, 1);
		
		queries.add(s1);
		queries.add(s2);
		queries.add(s3);
		queries.add(s4);
		queries.add(s5);
		
		
		List<Integer> answers = dynamicArray(2, queries);
		
		for (Integer lastAnswer: answers) {
			System.out.println(lastAnswer);
		}
		
	}

	@SuppressWarnings("unchecked")
	private static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
		
		ArrayList<Integer>[] seqArray = new ArrayList[n];
		
		for (int i = 0; i < n; i++) {
			seqArray[i] = new ArrayList<>();
		}
		
		int lastAnswer = 0;
		List<Integer> result = new ArrayList<>();
		
		for(List<Integer> query : queries) {
			int x = query.get(1);
			int y = query.get(2);
			int seq = ((x ^ lastAnswer) % n);
			
			if (query.get(0) == 1) {
				seqArray[seq].add(y);
			}
			
			if (query.get(0) == 2) {
				int element = (y % seqArray[seq].size());
				lastAnswer = seqArray[seq].get(element);
				result.add(lastAnswer);
			}
		}
		
		return result;
	}
}
