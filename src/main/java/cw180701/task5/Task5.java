package cw180701.task5;

import global.utils.FileReader;
import global.utils.FileWriter;
import global.utils.RandomGenerator;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = new String("src/main/java/cw180701/task5/resources/INPUT.txt");
        ArrayList<Integer> testData = new RandomGenerator<ArrayList<Integer>>().numbers(100, 0, 1000);
        new FileWriter<ArrayList<Integer>>(new String(filePath))
                .write(testData);
        new FileReader<ArrayList<String>>(filePath)
                .get()
                .forEach(System.out::println);
        Set<Integer> distinctNumbers = new FileReader<ArrayList<String>>(filePath)
                .get()
                .stream()
                .map(value -> Integer.parseInt(value))
                .collect(Collectors.toSet());
        Integer summ = distinctNumbers.stream().reduce((i1, i2) -> i1 + i2).get();
        int qtyOfNums = distinctNumbers.size();
        distinctNumbers.
                stream().
                sorted().
                forEach(x -> System.out.printf("%d ",x));
        new FileWriter<Set<Integer>>("src/main/java/cw180701/task5/resources/OUTPUT.txt").write(new TreeSet<Integer>(distinctNumbers));
    }
}
