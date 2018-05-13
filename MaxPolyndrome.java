
public class MaxPolyndrome {

	public static void main(String[] args) {
		// System.out.println(solve());

		System.out.println(isPolyndrome(111));
		// System.out.println(isSimple(109));
	}

	public static long solve() {

		for (long i = 9999; i >= 1000; i--) {
			for (long j = i; j >= 1000; j--) {
				if (isSimple(j) && isSimple(i)) {
					if (isPolyndrome(j * i)) {
						return j * i;
					}
				}
			}
		}
		
		//jjjj

		return -1;
	}

	private static boolean isSimple(long n) {

		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}

		return true;

	}

	private static boolean isPolyndrome(long n) {
		
		

		return true;
	}
}
