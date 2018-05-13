package binarySumm;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);
		// String A = in.next();
		// String B = in.next();
		String B = "1000000";
		String A = "111111";

		System.out.println(binarySumm(A, B));

	}

	public static String binarySumm(String big, String small) {

		if (big.length() < small.length()) {
			return binarySumm(small, big);
		}

		int remainer = 0;
		int a = 0;
		int b = 0;
		StringBuilder sb = new StringBuilder(big);

		for (int i = 1; i <= big.length(); i++) {

			a = Character.digit(big.charAt(big.length() - i), 2);
			
			a ^= remainer;
			
			if (i <= small.length() ) {
				b =  Character.digit(small.charAt(small.length() - i), 2);
				sb.setCharAt(sb.length() - i, Character.forDigit(a ^ b, 2));
				remainer ^= a & b;
			}else {
				if (remainer != 0) {
					sb.setCharAt(sb.length() - i, Character.forDigit(a, 2));
					remainer ^= a;
				} 
			}
			
		}
		
		if (remainer == 1) {
			sb.insert(0, 1);
		}

		return sb.toString();
	}

}