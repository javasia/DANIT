package ranges;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] values = new int[n];

		while (--n >= 0)
			values[values.length - n - 1] = in.nextInt();

		StringBuilder sb = new StringBuilder("");

		for (int i = 0; i < values.length; i++) {

			sb.append("[]");

			int numsInLine = i;

			while (numsInLine + 1 < values.length && values[numsInLine] + 1 == values[numsInLine + 1]) {
				numsInLine++;
			}

			if (numsInLine == i) {
				sb.insert(sb.length() - 1, values[numsInLine]);
			} else {
				sb.insert(sb.length() - 1, values[i] + " " + values[numsInLine]);
				i = numsInLine;
			}
		}

		System.out.println(sb);

	}

}