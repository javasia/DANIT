package binarySum.tests;

import binarySum.SolutionOptimazed;
import binarySum.SolutionOptimazedStreamsAndCharConverntion;

public class TestExecTime {
    public static void main(String[] args) {

        String a = RandomTestData.get(2000000);
        String b = RandomTestData.get(200000);
        int timesToTest = 500;

        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < timesToTest; i++) {
            long start = System.currentTimeMillis();
            SolutionOptimazed.binarySum(a, b);
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("SolutionOptimazed.binarySum: %d msec.\n", endTime - startTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < timesToTest; i++) {
            long start = System.currentTimeMillis();
            SolutionOptimazedStreamsAndCharConverntion.binarySum(a, b);
        }
        endTime = System.currentTimeMillis();
        System.out.printf("SolutionOptimazedStreamsAndCharConverntion.binarySum: %d msec.\n", endTime - startTime);


    }
}
