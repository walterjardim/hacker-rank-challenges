package com.hackerrank.challenge.strings;

import java.util.Arrays;
import java.util.Collections;

public class SherlockAndTheValidString {

	public static void main(String[] args) {
		String s = "aaabbccdd";
		
		String result = isValid(s);
		
		System.out.println(result);
	}

	private static String isValid(String s) {
		String isValid = "NO";
		
		Integer[] lettersCount = new Integer[26];
		for (int i = 0; i < lettersCount.length; i++) {
			lettersCount[i] = 0;
		}
		
		for(char c : s.toCharArray()) {
			if (lettersCount[c - 'a'] == null) {
				lettersCount[c - 'a'] = 0;
			}
			lettersCount[c - 'a']++;
		}
		
		Arrays.sort(lettersCount, Collections.reverseOrder());
		
		
		int i = 0;
		while(lettersCount[i] > 0) {
			i++;
		}
		
		int max = lettersCount[0];
		int min = lettersCount[i - 1];
		
		if (min == max) {
			isValid = "YES";
		} else {
			if ( ((max - min == 1) && (max > lettersCount[1])) ) {
				isValid = "YES";
			}
		}
		
		for (i = 0; i < lettersCount.length; i++) {
			System.out.print(lettersCount[i] + " ");
		}
		
		return isValid;
	}
}
