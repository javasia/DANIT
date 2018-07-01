package cw180624.task5;

import java.util.Random;
import java.util.TreeSet;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

public class RandomGenerator {
    public TreeSet<Integer> getRandomUniqueIntsOld(int size, int upperBound, int bottomBound) {
        TreeSet<Integer> integers = new TreeSet<>();
        while (integers.size() < size) {
            int newElement = new Random().nextInt(upperBound) + bottomBound;
            if (newElement % 2 == 0){
                integers.add(newElement);
            }
        }
        return integers;
    }

    public TreeSet<Integer> getRandomUniqueInts(int size, int upperBound, int bottomBound) {
        return new Random()
                .ints(upperBound, bottomBound)
                .filter(x -> x % 2 == 0)
                .distinct()
                .limit(size)
                .boxed()
                .collect(Collectors.toCollection(() -> new TreeSet<>()));
    }
}
