package cw180629.task1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int [] testData = TestDataProducer.produce(100);
        Arrays.sort(testData);
        SimpleValidator sv = new SimpleValidator(testData[testData.length-1]);
        System.out.println(sv.getCount());
    }
}
