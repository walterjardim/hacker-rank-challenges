package com.hackerrank.challenge.strings;

public class MakingAnagrams {

	public static void main(String[] args) {
		String a = "cde";
		String b = "abc";
		int res = makeAnagram(a, b);
		
		System.out.println(res);
	}

	private static int makeAnagram(String a, String b) {
		int[] lettercounts = new int[26];
		for(char c : a.toCharArray()){
			lettercounts[c-'a']++;
		}
		for(char c : b.toCharArray()){
			lettercounts[c-'a']--;
		}
		int result = 0;
		for(int i : lettercounts){
			result += Math.abs(i);
		}
		return result;
	}
}
