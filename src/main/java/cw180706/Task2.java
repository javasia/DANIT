package cw180706;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4};
        int[] b = new int[]{4, 2, 3, 10, 0, 100};
        System.out.println(Arrays.toString(copySame(a, b)));
    }

    public static int[] copySame (int[] a, int[] b){
        Arrays.sort(a);
        Arrays.sort(b);
        int startPoint = 0;
        int breakPoint = 0;
        int[] temp = new int[a.length + b.length];
        for (int i = 0, ai = 0, bi = 0; i < Math.min(a.length, b.length); i++) {
            if (a[ai] < b[bi]) {
                ai++;
            } else if (a[ai] > b[bi]) {
                bi++;
            } else {
                startPoint = i;
                while (ai < a.length && bi < b.length && a[ai] == b[bi]) {
                    temp[i++] = a[ai];
                    ai++;
                    bi++;
                }
                breakPoint = i;
                break;
            }
        }
        int[] res = new int[temp.length - startPoint - breakPoint];
        for (int i = 0; i < res.length; i++) {
            res[i] = temp[i + startPoint];
        }
        return res;
    }
}
