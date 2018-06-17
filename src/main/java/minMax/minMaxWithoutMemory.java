package minMax;

public class minMaxWithoutMemory {

    public static int[] minMax (int x, int y){
        int max = x + y;
        int min = y;
        min ^= Math.min (min, max - min) ^ min; // setting m to max
        max -= min;                       // setting n to min
    return new int[] {min, max};
    }

    public static void main(String[] args) {
        int min = minMax(-7, -3)[0];
        int max = minMax(-3, -7)[1];
        System.out.printf("min: %d, max: %d\n", min, max);
    }
}
