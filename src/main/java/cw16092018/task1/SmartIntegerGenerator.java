package cw16092018.task1;

import global.utils.RandomGenerator;
import java.util.ArrayList;

public class SmartIntegerGenerator {
    public int getOne (int min, int max){
        return new RandomGenerator<ArrayList<Integer>>().numbers(1, max, min).get(0);
    }
}
