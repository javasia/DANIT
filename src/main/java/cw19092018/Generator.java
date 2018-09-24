package cw19092018;

import global.utils.RandomGenerator;

import java.util.List;

public class Generator {
    public List<Integer> generate (int size, int boundary){
        return new RandomGenerator<List<Integer>>().numbers(5, 10, 0);
    }
}
