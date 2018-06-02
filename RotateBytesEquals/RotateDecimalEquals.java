package RotateBytesEquals;

import java.util.*;

public class RotateDecimalEquals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        in.close();
        String resStr = equalsByRotation(m, n) ? "is rotation" : "isn't rotation";
        System.out.println(resStr);
    }

    public static boolean equalsByRotation(int m, int n) {
        if (m != n && ofTheSameOrder(m, n)) {
            for (double i = Math.floor(Math.log10(n)); n != m && i >= 0; i--) {
                m = rotateNumber(m);
                System.out.println(m);
            }
        };
        return m == n;
    }

    private static boolean ofTheSameOrder(int m, int n) {
        return Math.floor(Math.log10(n)) == Math.floor(Math.log10(m));
    }

    private static int rotateNumber(double n) {
        double order = Math.pow(10, Math.floor(Math.log10(n)));
        return (int) (((n % 10) * order) + (n / 10));
    }


}