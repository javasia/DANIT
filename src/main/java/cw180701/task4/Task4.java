package cw180701.task4;

import sun.reflect.generics.tree.Tree;

import java.io.File;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {
    /* generate Random 10 nos 5..25*/
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new Random(10506).
                ints(3, 8).map(e -> e * e).limit(15).boxed().collect(Collectors.toCollection(() -> new TreeSet<>()));
        new FileWriter ().write(new File("src/main/java/cw180701/task4/resources/OUT.txt"), numbers);
    }
}
