package sum36Base;

public class Solution {
	public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);
		// String A = in.nextLine();
		// String B = in.nextLine();
		String A = "c";
		String B = "c";

		System.out.println(sum36Base(A, B));

	}

	public static String sum36Base(String a, String b) {
		String map = "0123456789abcdefghijklmnopqrstuvwxyz";
		return sumMapBase(a, b, map);
	}

	public static String sumMapBase(String big, String small, String map) {

		if (big.length() < small.length()) {
			return sumMapBase(small, big, map);
		}

		StringBuilder sb = new StringBuilder();

		int remainer = 0;

		for (int i = 1; i <= big.length(); i++) {
			int a = map.indexOf(big.charAt(big.length() - i));
			int b = i > small.length() ? 0 : map.indexOf(small.charAt(small.length() - i));
			sb.insert(0, map.charAt((a + b + remainer) % map.length() ));
			remainer = (a + b + remainer) / map.length();

		}

		if (remainer > 0) {
			sb.insert(0, remainer);
		}

		return sb.toString();
	}

}