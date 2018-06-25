package intervals;

public class Test {

//    Input:    6
//            3 6              // 1 2
//            7 8              // 3 6
//            1 2              // 6 7
//            6 7              // 6 10
//            6 10             // 7 8
//            11 2000000000     // 11 20000000000
//    Expected: 1 2
//            3 10
//            11 2000000000
//    Output:   1 2
//            3 8
//            11 2000000000

    //test input: 5 1 3 5 6 4 8 10 11 8 9


    public static void main(String... args) {
        int times = 1000000;
        int i = 0;

        long startTimeOptimal = System.currentTimeMillis();
        while (i++ < times) {
            IntervalsOptimized.main(TestData.getTestData());
        }
        long endTimeOptimal = System.currentTimeMillis();

        i = 0;
        long startTimeOld = System.currentTimeMillis();
        while (i++ < times) {
            Intervals.main(TestData.getTestData());
        }
        long endTimeOld = System.currentTimeMillis();

        System.out.printf("IntervalsOptimized. Average exec. time: %d\n", (endTimeOptimal - startTimeOptimal) / times);
        System.out.printf("Intervals. Average exec. time: %d\n", (endTimeOld - startTimeOld) / times);
//        TestData.print();
    }
}