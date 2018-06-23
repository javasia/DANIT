import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int [] numbers = new int [] {1, 9, 3, 7, 5};
        int target = 7;

        System.out.println(find (numbers, target));
    }

    private static int find(int[] numbers, int target) {
        Arrays.sort(numbers);
        for (int i = 0; i < Math.min(target, numbers.length); i++){
            if (target == numbers[i]){
                return i;
            }
        }
        return -1;
    }
}