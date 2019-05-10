package com.hackerrank.challenge.strings;

public class BeautifulBinaryString {

	public static void main(String[] args) {
		 int result = beautifulBinaryString("0100101010100010110100100110110100011100111110101001011001110111110000101011011111011001111100011101");
		 System.out.println(result);
	}
	
	static int beautifulBinaryString(String b) {
		int result = 0;
		
		while (b.indexOf("010") != -1) {
			b = b.replaceFirst("010", "-1");
			result++;
		}
		
		
		return result;

    }
}
