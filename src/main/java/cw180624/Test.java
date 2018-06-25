package cw180624;

public class Test {
    public static void main(String[] args) {
        int i = 0;
        System.out.printf("Taks%d:\n", ++i);
        Task1 task1 = new Task1(new int[]{-1,0,2,3,4,5,6,7,8,9,10});
        task1.solve();
        System.out.printf("Taks%d:\n", ++i);
        Task2 task2 = new Task2("Hello world! This is test 4 u, buddy!");
        task2.solve();
    }
}
