package cw180624.task4;

import cw180624.task4.utils.FileWriter;

import java.io.FileNotFoundException;
import java.util.PriorityQueue;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        PriorityQueue<User> base = new DataBaseAdapter("src/main/java/cw180624/task4/resources/USR_IN.txt").getCleanDataBase();
        new FileWriter("src/main/java/cw180624/task4/resources/USR_OUT.txt").write(base, true);
        new FileWriter("src/main/java/cw180624/task4/resources/USR_OUT.xml").writeXml(base, true);
    }
}
