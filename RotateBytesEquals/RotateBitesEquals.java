package RotateBytesEquals;

import java.util.Scanner;

public class RotateBitesEquals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        in.close();
//        79773846 638190768
//        1802973777 682998681
        System.out.println(Integer.toBinaryString(m));
        System.out.println(Integer.toBinaryString(n));
        //  System.out.println(Integer.toBinaryString(rotateNumber(m, 1)));
        String resStr = equalsByRotation(m, n) ? "is rotation" : "isn't rotation";
       System.out.println(resStr);
    }

    public static boolean equalsByRotation(int m, int n) {
        if (m != n) {
            int max = Math.max(m, n);
            n = m + n - max;
            m = max;
            for (int i = Integer.highestOneBit(m), count = 1; i > 0; i >>>= 1) {
                System.out.println("m: " + Integer.toBinaryString(rotateNumber(m, count)));
                System.out.println("n: " + Integer.toBinaryString(n));
                System.out.println();
                if (n == rotateNumber(m, count++)) {
                    return true;
                }
            }
        }
        return m == n;
    }

    private static int rotateNumber(int n, int steps) {
        int highestOneBit = Integer.highestOneBit(n);
        int tail = ((1 << (steps + 1)) - 1) & n; // copy tail
        n >>>= steps; // cut the begining

        while (tail != highestOneBit){ // move tail up till the highest one bit
            tail <<= 1;
        }

        n |= tail; // put tail into begging
        return n;
    }
}