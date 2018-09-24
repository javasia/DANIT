package cw14092018;

import global.utils.FileReader;
import global.utils.FileWriter;
import global.utils.RandomGenerator;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Solution {
    public void genetateFile (String filepath, int size, int bottomBound, int upperBound) {
        new FileWriter<ArrayList<Integer>>(filepath).write(new RandomGenerator<ArrayList<Integer>>().numbers(size, upperBound, bottomBound));
    }
    public ArrayList<String> readSource (String filepath) throws FileNotFoundException {
        return new FileReader<ArrayList<String>>(filepath).get();
    }

    public void solve() throws FileNotFoundException {
        String inputFile = "random.txt";
        genetateFile(inputFile, 1000, 0, 100);
        new FileWriter<ArrayList<Integer>>("evens.txt").write(
                readSource(inputFile)
                        .stream()
                        .map((s) -> new Integer(s)).filter((i) -> i % 2 == 0)
                        .collect(Collectors.toCollection(ArrayList::new)));
        new FileWriter<ArrayList<Integer>>("odds.txt").write(
                readSource(inputFile)
                        .stream()
                        .map((s) -> new Integer(s)).filter((i) -> i % 2 != 0)
                        .collect(Collectors.toCollection(ArrayList::new)));
    }
}
