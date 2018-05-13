package fibNums;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(fib(in.nextInt()));

		in.close();
	}

	public static int fib(int n) {
		
		if (n == 0) {
			return 1;
		}
		
		if (n >= 1) {
			return (fib (n - 1) + fib (n - 2));
		}
		
		
		return -1;
	}

}