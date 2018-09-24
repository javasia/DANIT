package cw180706;

public class Task5 {
    public static void main(String[] args) {
        String origin = "Hello World!";
        System.out.println(reverse(origin));

    }

    public static String reverse(String input) {
        byte[] bytes = input.getBytes();
        for (int i = 0; i < bytes.length / 2; i++) {
            byte temp = bytes[i];
            bytes[i] = bytes[bytes.length - i - 1];
            bytes[bytes.length - i - 1] = temp;
        }
        return new String(bytes);
    }

    private static String reverseBinString(String input){
        StringBuilder sb = new StringBuilder();
        for (byte b : input.getBytes()){
            while (b != 0){
                sb.append(b & 1);
                b >>>= 1;
            }
        }
        return sb.toString();
    }
}
