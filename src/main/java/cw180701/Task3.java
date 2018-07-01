package cw180701;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task3 {
    /* generate Random 10 nos 5..25*/
    public static void main(String[] args) {
       System.out.printf("Random stream is: %s\n", new Random(10506).
                ints(3, 8)
                .limit(15)
                .boxed()
                .collect(Collectors.toList()));
        System.out.printf("Random squared stream is: %s\n", new Random(10506).
                ints(3, 8).map(e -> e * e)
                .limit(15)
                .boxed()
                .collect(Collectors.toList()));
    }
}
