package RotateBytesEquals;
import java.util.Scanner;

public class RotateBitesEquals {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in)
//        sample inputs:
//        79773846 638190768
//        1802973777 682998681
        Scanner in = new Scanner("1802973777 682998681");
        int m = in.nextInt();
        int n = in.nextInt();
        in.close();
        String resStr = equalsByRotation(m, n) ? "is rotation" : "isn't rotation";
        System.out.println(resStr);
    }

    public static boolean equalsByRotation(int m, int n) {
        boolean areEqual = m == n;
        if (!areEqual) {
            int shiftN = 0;
            for (int i = Integer.highestOneBit(n); !areEqual && i != 0; i >>>= 1) {
                int rotatedN = rotateNumber(n, shiftN++);
                int shiftM = 0;
                for (int j = Integer.highestOneBit(m); !areEqual && j != 0; j >>>= 1) {
                    areEqual = rotatedN == rotateNumber(m, shiftM++);
                }
            }
        }
        return areEqual;
    }

    private static int rotateNumber(int n, int shift) {
        shift %= 32;                                    // normalize shift simple
        int tail = (1 << shift) - 1;                    // generate
        tail &= n;                                      // copy tail of n
        n >>>= shift;
        tail <<= (int) (Math.log(n) / Math.log(2) + 1); //shift up to order of n
        return n | tail;                                //merge
    }
}