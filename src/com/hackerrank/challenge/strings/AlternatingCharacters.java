package com.hackerrank.challenge.strings;

public class AlternatingCharacters {

	public static void main(String[] args) {
		String s = "AAABBB";
		int result = alternatingCharacters(s);
		
		System.out.println(result);
	}

	private static int alternatingCharacters(String s) {
		int result = 0;
		char[] chars = s.toCharArray();
		
		for(int i = 0; i < chars.length; i++) {
			
			if (i + 1 < chars.length) {
				
				if (chars[i] == chars[i+1]) {
					result++;
				}
				
			}
			
		}
		
		return result;
	}
}
