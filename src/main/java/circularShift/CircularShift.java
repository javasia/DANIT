package circularShift;

import java.util.Scanner;

public class CircularShift {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int shift = in.nextInt();
        in.close();
        System.out.println(circularShiftRight(number, shift));
    }

    private static int circularShiftRight(int n, int shift) {
        shift %= n > 0 ? (int) (Math.log(n) / Math.log(2) + 1) : 32;     // normalize shift
        int tail = (1 << shift) - 1;                    // generate mask
        tail &= n;                                      // copy tail of n
        n >>>= shift;
        tail <<= (int) (Math.log(n) / Math.log(2) + 1); //shift to order of n
        return n | tail; //merge
    }
}