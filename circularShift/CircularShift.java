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

    private static int circularShiftRight(int number, int shift) {
      //  shift %= (int) (Math.log(number) / Math.log(2) + 1);     // normalize shift
        int tail = (1 << shift) - 1;                    // generate mask
        tail &= number;                                      // copy tail of n to mask
        number >>>= shift;
        tail <<= (int) (Math.log(number) / Math.log(2) + 1); //shift up to order of initial n
        return number | tail; //merge
    }
}