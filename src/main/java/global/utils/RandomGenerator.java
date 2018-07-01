package global.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class RandomGenerator<T extends Collection<Integer>> {
    public T getRandomNumbers (int size, int upperBound, int bottomBound){
        return new Random()
                .ints(upperBound, bottomBound+1)
                .limit(size)
                .boxed()
                .collect(Collectors.toCollection(new Supplier<T>() {
                    @Override
                    @SuppressWarnings("unchecked")
                    public T get() {
                        return (T) (new ArrayList<Integer>());
                    }
                }));
    } 
}
