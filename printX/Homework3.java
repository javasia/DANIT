package printX;

/**
 * Homework3 FS6
 * 
 * @author Andrii Danchenko FS6
 */
public class Homework3 {

	public static void main(String[] args) {

		// printX(6);

		printX(50, 100);

		// printXWhile(100, 50);
	}

	public static String getXAsString(int width, int height) {
		StringBuilder res = new StringBuilder(width * (height + 1));
		for (int i = 0; i < width * height; i++) {
			int line = i / width;
			int row = i % width;
			res.append(getSign(width, height, row, line));
			if ((row + 1) % width == 0) {
				res.append("\n");
			}
		}
		return res.toString();
	}

	public static void printX(int size) {
		printX(size, size);
	}

	public static void printX(int width, int height) {
		System.out.println("printX:");
		System.out.println(getXAsString(width, height));
		System.out.println("Done.\n");
	}

	private static char getSign(int width, int height, int row, int line) {

		char res = ' ';

		if (isTopOrBottomEdge(height, line)) {
			res = '-';
		} else if (isLeftOrRightEdge(width, row)) {
			res = '|';
		} else if (isSlash(width, height, row, line)) {
			res = '\\';
		} else if (isBackSlash(width, height, row, line)) {
			res = '/';
		}

		return res;
	}

	private static boolean isTopOrBottomEdge(int height, int line) {
		return line == 0 || line == height - 1;
	}

	private static boolean isLeftOrRightEdge(int width, int row) {
		return row == 0 || row == width - 1;
	}

	private static boolean isSlash(int width, int height, int row, int line) {
		return row == Math.round(line * getTanA(width, height));
	}

	private static boolean isBackSlash(int width, int height, int row, int line) {
		return row == width - 1 - Math.round(line * getTanA(width, height));
	}

	private static double getTanA(int width, int height) {
		return (double) width / height;
	}

}
