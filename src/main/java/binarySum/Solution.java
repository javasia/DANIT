package binarySum;

public class Solution {

    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        String A = in.next();
        String B = in.next();
//        String B = "1000000";
//        String A = "111111";

        System.out.println(binarySum(A, B));

    }

    public static String binarySum(String big, String small) {

        if (big.length() < small.length()) {
            return binarySum(small, big);
        }

        int remainer = 0;
        StringBuilder sb = new StringBuilder(big);

        for (int i = 1; i <= big.length(); i++) {

            int a = Character.digit(big.charAt(big.length() - i), 2);

            a ^= remainer;
            remainer &= ~a;

            if (i <= small.length()){
                int b = Character.digit(small.charAt(small.length() - i), 2);
                sb.setCharAt(sb.length() - i, Character.forDigit(a ^ b, 2));
                remainer ^= a & b;
            }else {
                sb.setCharAt(sb.length() - i, Character.forDigit(a, 2));
                if (remainer == 0){
                    break;
                }
            }
        }

        if (remainer == 1) {
            sb.insert(0, 1);
        }

        return sb.toString();
    }
}