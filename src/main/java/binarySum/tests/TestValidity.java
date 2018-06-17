package binarySum.tests;

import binarySum.Solution;
import binarySum.SolutionOptimazed;


public class TestValidity {
    public static void main(String[] args) {
        String a = RandomTestData.get(32);
        String b = RandomTestData.get(32);
//        String a = "111";
//        String b = "111";

        assert Solution.binarySum(a, b).equals(SolutionOptimazed.binarySum(a, b));
    }
}
