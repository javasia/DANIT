package cw180701;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;

public class Task2 {
    /* generate Random 10 nos 5..25*/
    public static void main(String[] args) {

        List<Integer> integers = new Random().
                ints(5, 26)
                .limit(10)
                .boxed()
                .collect(Collectors.toList());
        System.out.println();
        System.out.printf("Random stream is: %s\n", integers);
        System.out.printf("Random doubled stream is: %s\n", integers.stream().map(e -> e * 2).collect(Collectors.toList()));
    }
}
