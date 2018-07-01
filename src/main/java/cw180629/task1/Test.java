package cw180629.task1;

public class Test {
    public static void main(String[] args) {
       // int [] testData = TestDataProducer.produce(100);
       // int[] testData = new int[] {2207, 2213, 9, 3333, };
      //  Arrays.sort(testData);
        SimpleValidator sv = new SimpleValidator();
        int count = 0;
        for (int i = 9999; i >= 1000; i--){
            if (sv.isSimple(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
