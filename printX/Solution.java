package printX;

/**
 * Homework2
 * 
 * @author Andrii Danchenko FS6
 */
public class Solution {

	public static void main(String[] args) {

		//printX(6);

		printX(5, 50);

		//printXWhile(100, );
	}

	public static void printX(int size) {
		printX(size, size);
	}

	public static void printX(int width, int height) {

		System.out.println("printX:");

		for (int i = 0; i < width * height; i++) {

			int line = i / width;
			int row = i % width;

			System.out.print(getSign(width, height, row, line));

			if ((row + 1) % width == 0) {
				System.out.println();
			}
		}

		System.out.println("Done.\n");
	}

	public static void printXWhile(int width, int height) {

		System.out.println("printX:");

		int i = 0;

		while (i < width * height) {

			int line = i / width;
			int row = i % width;

			System.out.print(getSign(width, height, row, line));

			if ((row + 1) % width == 0) {
				System.out.println();
			}

			i++;
		}

		System.out.println("Done.\n");
	}

	public static void printXNested(int width, int height) {

		System.out.println("printXNested:");

		for (int line = 0; line < height; line++) {
			for (int row = 0; row < width; row++) {
				System.out.print(getSign(width, height, row, line));
			}
			System.out.println();
		}

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
