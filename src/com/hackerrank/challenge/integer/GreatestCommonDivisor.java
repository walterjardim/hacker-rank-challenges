package com.hackerrank.challenge.integer;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		
		System.out.println(gcd(123, 456));
		
	}
	
	static int gcd (int a, int b) {
		int gcd = 0;
		if (b == 0) {
			gcd = a;
		} else {
			while (b != 0) {
				int c = a % b;
				a = b;
				b = c;
				
			}
			gcd = a;
		}
		
		return gcd;
	}
}
