package binarySum;

public class SolutionOptimazedStreamsAndCharConverntion {

    public static void main(String[] args) {
         java.util.Scanner in = new java.util.Scanner(System.in);
         String A = in.next();
         String B = in.next();
//        String B = "10000001";
//        String A = "111111";
        System.out.println(binarySum(A, B));
    }

    public static String binarySum(String big, String small) {
        if (big.length() < small.length()) {
            return binarySum(small, big);
        }
        StringBuilder sb = new StringBuilder(big);
        int[] arrayA = big.chars().map(operand -> operand - 48).toArray();
        int[] arrayB = small.chars().map(operand -> operand - 48).toArray();
        int remainder = 0;
        for (int i = arrayA.length - 1, j = arrayB.length - 1; j >= 0 || (i >= 0 && remainder != 0); i--, j--) {
            int a = arrayA[i];
            int b = j >= 0 ? arrayB[j] : 0;
            a ^= remainder;
            remainder = (remainder & ~a) ^ (a & b);
            sb.setCharAt(i, (char) ((a ^ b) + 48));
        }
        if (remainder == 1) {
            sb.insert(0, 1);
        }
        return sb.toString();
    }
}