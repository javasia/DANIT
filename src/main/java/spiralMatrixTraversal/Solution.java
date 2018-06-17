package spiralMatrixTraversal;

import java.util.*;

public class Solution {

	private static int[][] matrix;

	private static int curLine = 0;
	private static int curRow = 0;
	private static int curDirection = 0;

	private static boolean[][] boolMap;
	private static StringBuilder traversedMatrix;

	public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);
		// Scanner in = new Scanner("3 4\n" + "1 2 3 4 \n" + "5 6 7 8 \n" + "9 10 11 12
		// \n");
		Scanner in = new Scanner("3 1\n" + "1 2 3\n");
		int H = in.nextInt();
		int W = in.nextInt();
		matrix = new int[H][W];

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				matrix[i][j] = in.nextInt();
			}
		}

		in.close();

		boolMap = new boolean[H][W];

		System.out.println(traverseSpiralMatrix());

	}

	public static String traverseSpiralMatrix() {

		traversedMatrix = new StringBuilder(Integer.toString(matrix[curLine][curRow]));

		putStepTrace(boolMap);

		while (exploreMatrix()) {
			traversedMatrix.append(" " + matrix[curLine][curRow]);
		}

		return traversedMatrix.toString();

	}

	private static void putStepTrace(boolean[][] boolMap) {
		boolMap[curLine][curRow] = true;
	}

	private static int[] getDirectionModifier(int direction) {

		switch (direction) {
		case 0:
			return new int[] { 0, 1 };// E
		case 1:
			return new int[] { 1, 0 }; // S
		case 2:
			return new int[] { 0, -1 };// W
		case 3:
			return new int[] { -1, 0 };// N
		default:
			return null;
		}
	}

	private static boolean isFree(int[] cell) {
		return !boolMap[cell[0]][cell[1]];
	}

	private static boolean exploreMatrix() {

		if (move()) {
			return true;
		}

		turn();

		return move();
	}

	private static int[] getNextCell() {

		int[] dm = getDirectionModifier(curDirection);

		int line = curLine + dm[0];
		int row = curRow + dm[1];

		if (isWithinMargins(line, row)) {
			return new int[] { line, row };
		}

		return null;
	}

	private static boolean isWithinMargins(int line, int row) {
		return line >= 0 && line < matrix.length && row >= 0 && row < matrix[0].length;
	}

	private static void turn() {
		curDirection = (curDirection + 1) % 4;
	}

	private static boolean move() {

		int[] nextCell = getNextCell();

		if (nextCell != null && isFree(nextCell)) {
			curLine = nextCell[0];
			curRow = nextCell[1];
			putStepTrace(boolMap);
			return true;
		}

		return false;

	}

}