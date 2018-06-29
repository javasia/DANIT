package cw180629.task1;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestDataProducer {

    public static int[] produce(int amount) {
        return IntStream.generate(()->(int)(Math.random()*100)).limit(amount).toArray();
    }



}
