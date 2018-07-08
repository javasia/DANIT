package cw180706;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int[] a = new int[]{1, 2, 3};
        int[] b = new int[]{4, 5, 6, 7};
        int[] res = new int[a.length + b.length];

        for (int i = 0; i < res.length; i++) {
            if (i < a.length) {
                res[i] = a[i];
            } else {
                res[i] = b[i - a.length];
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
