package equalizeStones;

import java.util.*;

public class MainOptim {

	public static void main(String[] args) {

		// String input = "5 67 54 16 55 40";
		//String input = "3 1 49 50";
		//String input = "6 19 18 10 19 4 12";
		// String input = "3 100 25 25";
		// String input = "4 100 25 25 25";
		//String input = "6 100 25 25 25 25 1";
		// String input = "6 100 25 25 25 25 25";
		// String input = "2 100 150";
		// String input = "2 100 100";
		//String input = "1 100";
		 String input = "11 200 1 5 300 70 1 199 299 50 600 75";

		Scanner sc = new Scanner(input);

		int size = sc.nextInt();

		int[] weights = new int[size];

		for (int i = 0; i < weights.length; i++) {
			weights[i] = sc.nextInt();
		}

		sc.close();

		System.out.println(getMinimalBalance(weights));

	}

	public static int getMinimalBalance(int[] inputStones) {
		
		if (inputStones.length <= 1) return getSum(inputStones);

		Arrays.sort(inputStones);
		int bagOfStonesA = inputStones[inputStones.length - 1];
		inputStones[inputStones.length - 1] = 0;
		int bagOfStonesB = 0;
		
		for (int i = inputStones.length - 2; i >= 0; i--) {
	
				if (bagOfStonesA < bagOfStonesB ) {
					bagOfStonesA += inputStones[i];				
				}else {
					bagOfStonesB += inputStones[i];				
				}
				
				inputStones[i] = 0;
				
		}

		return  Math.abs(bagOfStonesB - bagOfStonesA);
	}


	private static int getSum(int[] nums) { 
		
		int res = 0;

		for (int i = nums.length - 1; i >= 0; i--) {
			res += nums[i];
		}

		return res;
	}
}