package RotateBytesEquals;
//        79773846 638190768  sample inputs
//        1802973777 682998681

import java.util.Scanner;

public class RotateBitesEquals {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
        Scanner in = new Scanner("1802973777 682998681");
        int m = in.nextInt();
        int n = in.nextInt();
//         int m = Integer.parseInt(in.next(), 2);
//         int n = Integer.parseInt(in.next(), 2) ;
        in.close();
        System.out.printf("m=%32s;\n", Integer.toBinaryString(m));
        System.out.printf("n=%32s;\n", Integer.toBinaryString(n));
        System.out.println();
        String resStr = equalsByRotation(m, n) ? "is rotation" : "isn't rotation";
        System.out.println(resStr);
    }

    public static boolean equalsByRotation(int m, int n) {

        boolean areEqual = m == n;

        if (!areEqual) {
            int iteration = 1;
            int shiftN = 0;
            for (int i = Integer.highestOneBit(n); !areEqual && i != 0; i >>>= 1) {
                int rotatedN = rotateNumber(n, shiftN++);
                System.out.printf("Iteration %05d: shiftN=%d; %s\n", iteration, shiftN, Integer.toBinaryString(rotatedN));
                int shiftM = 0;
                for (int j = Integer.highestOneBit(m); !areEqual && j != 0; j >>>= 1) {
                    int rotatedM = rotateNumber(m, shiftM++);
                    System.out.printf("Iteration %05d: shiftM=%d; %s\n", iteration, shiftM, Integer.toBinaryString(rotatedM));
                    areEqual = rotatedM == rotatedN;
                    iteration++;
                }
                System.out.println();
            }
        }
        return areEqual;
    }

    private static int rotateNumber(int n, int shift) {
        shift %= n > 0 ? (int) (Math.log(n) / Math.log(2) + 1) : 32;     // normalize shift
        int tail = (1 << shift) - 1;                    // generate mask
        tail &= n;                                      // copy tail of n to mask
        n >>>= shift;
        tail <<= (int) (Math.log(n) / Math.log(2) + 1); //shift up to order of initial n
        return n | tail; //merge
    }


}