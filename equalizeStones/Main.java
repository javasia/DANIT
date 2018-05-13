package equalizeStones;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		// String input = "5 67 54 16 55 40";
		//String input = "3 1 49 50";
		//String input = "6 19 18 10 19 4 12";
		// String input = "3 100 25 25";
		// String input = "4 100 25 25 25";
		//String input = "5 100 25 25 25 25";
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
		int bagOfStonesB = 0;
		int balanceAB = getSum(inputStones) - bagOfStonesA;
		inputStones[inputStones.length - 1] = 0;
		
		for (int i = inputStones.length - 2; i >= 0; i--) {
			if (inputStones[i] != 0) { //TODO can delete branch?
		
				int idx = getNearestIdx(inputStones, balanceAB / 2, i);
				
				if (bagOfStonesA < bagOfStonesB ) {
					bagOfStonesA += inputStones[idx];				
				}else {
					bagOfStonesB += inputStones[idx];				
				}
				
				inputStones[idx] = 0;
				
				balanceAB = Math.abs(bagOfStonesB - bagOfStonesA) + getSum(inputStones); //TODO can use variable instead of repeated counting?
			} 
		}

		return balanceAB;
	}

	private static int getNearestIdx(int[] weights, int balance, int initial) {//TODO can use branch instead circle?

		int idx = initial;

		for (int i = weights.length - 1; i >= 0; i--) {
			if (weights[i]==0) {
				continue;
			}
			int nearest = weights[idx];
			if (Math.abs(balance - nearest) > Math.abs(balance - weights[i])) {
				idx = i;
			}
		}

		return idx;
	}

	private static int getSum(int[] nums) { //TODO can use variable instead of repeated counting?
		int res = 0;

		for (int i = nums.length - 1; i >= 0; i--) {
			res += nums[i];
		}

		return res;
	}
}