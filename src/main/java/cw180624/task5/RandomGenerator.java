package cw180624.task5;

import java.util.Random;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class RandomGenerator {
    public TreeSet<Integer> getRandomUniqueIntsOld(int size, int upperBound, int bottomBound) {
        TreeSet<Integer> integers = new TreeSet<>();
        while (integers.size() < size) {
            integers.add(new Random().nextInt(upperBound) + bottomBound);
        }
        return integers;
    }

    public TreeSet<Integer> getRandomUniqueInts(int size, int upperBound, int bottomBound) {
        return new Random()
                .ints(upperBound, bottomBound)
                .distinct()
                .limit(size)
                .boxed()
                .collect(Collectors.toCollection(() -> new TreeSet<>()));
    }
}
