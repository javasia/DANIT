package cw180706;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getUnique(new int[]{1, 2, 3, 4, 4, 4, 4, 10, 11})));
    }

    public static int[] getUnique(int[] data) {
        Arrays.sort(data);
        int[] temp = new int[data.length];
        int falseNums = 0;
        for (int i = 0, j = 0; i < temp.length - 1; i++) {
            if (data[i] != data[i + 1]) {
                temp[j++] = data[i];
            } else {
                falseNums++;
            }
        }

        if (data[data.length - 1] != data[data.length - 2]) {
            temp[temp.length - 1] = data[data.length - 1];
        } else {
            falseNums++;
        }

        Arrays.sort(temp);
        int[] res = new int[data.length - falseNums];
        for (int i = 0; i < res.length; i++) {
            res[i] = temp[i + falseNums];
        }
        return res;
    }
}
