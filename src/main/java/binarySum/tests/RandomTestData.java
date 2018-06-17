package binarySum.tests;

public class RandomTestData {
    public static String get(int size) {
        StringBuilder res = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            res.append(String.format("%.0f", Math.floor(Math.random() * 10) % 2));
        }
        return res.toString();
    }
}
