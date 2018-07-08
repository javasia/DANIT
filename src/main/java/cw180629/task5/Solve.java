package cw180629.task5;
/*
Сгенерировать коллекию со 100 уникальными простыми числами в диапазоне от 1 до 1000
отсортировать по убыванию
записать в файл
 */

import java.util.stream.Stream;

public class Solve {
    public static void main(String... args) {
        PrimeValidator sv = new PrimeValidator();
        Stream.iterate(0, integer -> ++integer).limit(1000).forEach(sv::isSimple);
        sv.getSimples().stream().limit(100).forEach(System.out::println); // toDO simplify
    }
}

