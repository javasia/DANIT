
public class IsSimple {

	public static void main(String[] args) {

		System.out.println(isSimple(108));
		System.out.println(isSimple(109));
	}

	private static boolean isSimple(int n) {

		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}

		return true;

	}

}
