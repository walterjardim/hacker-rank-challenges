package com.hackerrank.challenge.strings;

public class LoveLetterPalindrome {

	public static void main(String[] args) {
		System.out.println(theLoveLetterMystery("abc"));
	}
	
	static int theLoveLetterMystery(String s) {
		int moves = 0;
		
		String reverse = new StringBuilder(s).reverse().toString();
		
		if (!reverse.equals(s)) {
			int e = 0;
			int d = s.length() - 1;
			
			while (e < d) {
				
				if (s.charAt(e) != s.charAt(d)) {
					moves += Math.abs(s.charAt(d) - s.charAt(e));
				}
				
				e++;
				d--;
			}
			
		}
		
		return moves;
    }
}
