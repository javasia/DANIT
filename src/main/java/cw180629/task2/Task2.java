package cw180629.task2;

/*
2. Дан массив из целочисленных значений.
2.1.
2.2.Необходимо четные числа выделить в один массив,
нечетные числа выделить в другой массив.
каждый массив должен иметь длину НЕ БОЛЬШЕ количества содержащихся элементов.
2.3.Посчитать количество значений в каждом массиве
*/

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] data = new Random().ints(0, 101).limit(100).sorted().toArray();
        System.out.printf("Random input data: %s\n", Arrays.toString(data));
        solve(data);
    }

    public static void solve (int[] data){
        int [] odds = Arrays.stream(data).filter(x -> x % 2 != 0).toArray();
        int [] evens = Arrays.stream(data).filter(x -> x % 2 == 0).toArray();
        System.out.printf("Odds length: %d\n", odds.length);
        System.out.printf("Even length: %d\n", evens.length);
    }
}
