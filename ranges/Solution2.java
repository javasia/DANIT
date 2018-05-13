package ranges;

import java.util.*;

public class Solution2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] values = new int[n];

		while (--n >= 0)
			values[values.length - n - 1] = in.nextInt();

		for (int i = 0, j = 0; i < values.length; i++) {

			if (i + 1 < values.length) {
			
				if (values[i] + 1 == values[i + 1]) {
					continue;
				}
				
			}
			
			System.out.print("[" + values[j] + (j == i ? "" : " " + values[i]) + "]");
			j = i + 1;
			
		}
		
	}

}