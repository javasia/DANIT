package cw180701;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Task1 {
    /* generate Random 10 nos 5..25*/
    public static void main(String[] args) {
        int[] randoms = new Random().ints(5, 26).limit(10).toArray();
        System.out.printf("Arra is: %s", Arrays.toString(randoms));
        System.out.println();
        System.out.printf("Random stream is: %s", new Random().
                ints(5, 26).
                limit(10).
                boxed().
                collect(Collectors.toList())
        );
    }
}
