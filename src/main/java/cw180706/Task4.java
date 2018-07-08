package cw180706;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] data = new Random().ints(0, 5).limit(5).toArray();
        System.out.printf("Input array: %s\n", Arrays.toString(data));
        swapMaxMin(data);
        System.out.printf("Result: %s", Arrays.toString(data));
    }

    private static int maxIdx(int[] data) {
        int maxIdx = 0;
        for (int i = 0, maxVal = Integer.MIN_VALUE; i < data.length; i++) {
            if (maxVal < data[i]) {
                maxVal = data[i];
                maxIdx = i;
            }
        }
        return maxIdx;
    }

    private static int minIdx(int[] data) {
        int minIdx = 0;
        for (int i = 0, minVal = Integer.MAX_VALUE; i < data.length; i++) {
            if (minVal > data[i]) {
                minVal = data[i];
                minIdx = i;
            }
        }
        return minIdx;
    }

    private static int getMaxOrMin (int [] data, boolean ifTrueMax){
        return ifTrueMax ? maxIdx(data) : minIdx(data);
    }

    private static void swap(int idxMax, int idxMin, int[] data) {
        int temp = data[idxMin];
        data[idxMin] = data[idxMax];
        data[idxMax] = temp;
    }

    public static void swapMaxMin(int[] data) {
        swap(maxIdx(data), minIdx(data), data);
    }
}