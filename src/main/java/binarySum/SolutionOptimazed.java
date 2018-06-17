package binarySum;

public class SolutionOptimazed {

    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // String A = in.next();
        // String B = in.next();
        String B = "10000001";
        String A = "111111";

        System.out.println(binarySum(A, B));

    }

    public static String binarySum(String big, String small) {

        if (big.length() < small.length()) {
            return binarySum(small, big);
        }

        int remainder = 0;
        StringBuilder sb = new StringBuilder(big);
        for (int i = 1; i <= small.length() || (i <= big.length() && remainder != 0); i++) {
            int a = Character.digit(big.charAt(big.length() - i), 2);
            int b = (i <= small.length()) ? Character.digit(small.charAt(small.length() - i), 2) : 0;
            a ^= remainder;
            remainder = (remainder & ~a) ^ (a & b);
            sb.setCharAt(sb.length() - i, Character.forDigit(a ^ b, 2));
        }

        if (remainder == 1) {
            sb.insert(0, 1);
        }

        return sb.toString();
    }
}