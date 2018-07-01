package cw180624.task5;

import java.io.File;
import java.util.Random;
import java.util.TreeSet;

/*
5. Сгенерировать коллекию со 100 уникальными произвольными четными числами в диапазоне от 1 до 1000
отсортировать
записать в файл
*/
public class Task5 {
    public static void main(String[] args) {
        TreeSet<Integer> integers = new RandomGenerator().getRandomUniqueInts(100, 1, 1000);
        new FileWriter().write(new File("src/main/java/cw180624/task5/resources/OUT.txt"), integers);
    }
}
