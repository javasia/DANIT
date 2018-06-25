package cw180624;

/*      1. Дан массив из целочисленных значений.
        Необходимо пройти по массиву и произвести следущую операцию:
        те числа которые без остатка делятся на 2 - разделить на 2;
        те числа которые без остатка делятся на 3 - разделить на 3;
        остальные - умножить на два
        Распечатать получившийся массив */

import java.util.Arrays;

public class Task1 {

    private int[] data;

    public Task1(int[] data) {
        this.data = data;
    }

    public void solve() {
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0) {
                data[i] /= 2;
            } else if (data[i] % 3 == 0) {
                data[i] /= 3;
            } else data[i] *= 2;
        }
        System.out.println(Arrays.toString(data));
    }
}
