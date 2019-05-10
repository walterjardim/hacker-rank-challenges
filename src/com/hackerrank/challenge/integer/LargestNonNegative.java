package com.hackerrank.challenge.integer;

public class LargestNonNegative {

	public static void main(String[] args) {
		System.out.println(solution(17));
	}

	private static int solution(int N) {
		int index = 0;
		int result = function(index);
		while(result <= N) {
			index++;
			result = function(index);
		}
		
		if (result > N) {
			result = --index;
		}
		
		
		// ------------------
		
		int number = 0;
		while(function(number) <= N) {
			++number;
		}
		
		System.out.println("---- " + number);
		
		return result;
	}
	
	private static int function(int n) {
		if (n == 0) {
			return 0;
		}
		
		return function(n - 1) + n;
	}
}
